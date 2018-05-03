import { Component, OnInit } from '@angular/core';
import {TopicService} from "./topic.service";
import {Topic} from './model/Topic'

@Component({
  selector: 'app-topic',
  templateUrl: './topic.component.html',
  styleUrls: ['./topic.component.css']
})
export class TopicComponent implements OnInit {

  topics:Array<Topic>;
  constructor(private topicService:TopicService) { }

  ngOnInit() {
    this.topicService.getTopics().subscribe(
      ((data) => {
        this.topics = data;
      })
    )
  }
}
