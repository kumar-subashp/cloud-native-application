import {BrowserModule} from '@angular/platform-browser';
import {NgModule} from '@angular/core';


import {AppComponent} from './app.component';
import {TopicComponent} from './topic/topic.component';
import {CourseComponent} from './course/course.component';
import {TopicService} from "./topic/topic.service";
import {RouterModule} from "@angular/router";
import {CourseService} from "./course/course.service";
import {HttpClientModule} from "@angular/common/http";
import { AddComponent } from './topic/add/add.component'

@NgModule({
  declarations: [
    AppComponent,
    TopicComponent,
    CourseComponent,
    AddComponent

  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    RouterModule.forRoot([
      {path: 'topic', component: TopicComponent},
      {path: 'course', component: CourseComponent}
    ], {useHash: true})
  ],
  providers: [TopicService, CourseService],
  bootstrap: [AppComponent]
})
export class AppModule {
}
