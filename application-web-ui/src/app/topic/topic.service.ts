import {Injectable, OnInit} from '@angular/core';
import {HttpClient, HttpErrorResponse} from "@angular/common/http";
import 'rxjs/add/operator/do'
import 'rxjs/add/operator/catch'
import {Observable} from "rxjs/Observable";
import {Topic} from './model/Topic'

@Injectable()
export class TopicService {

  constructor(private httpClient: HttpClient) {
  }

  getTopics():Observable<Array<Topic>>{
        return this.httpClient.get("http://localhost:8084/api/topic-service/topics")
          .do((data) => {console.log(`opics are  JSON.stringify(data)`)})
          .catch(this.handleError);
  }

  handleError(err: HttpErrorResponse) {
    console.log("Error : " + err.message);
    return Observable.throw(err);
  }

}
