import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { TasksComponent } from './components/tasks/tasks.component';
import { TasksAddComponent } from './components/tasks/tasks-add/tasks-add.component';
import { TasksListComponent } from './components/tasks/tasks-list/tasks-list.component';

import { TaskService } from './services/task.service';


@NgModule({
  declarations: [
    AppComponent,
    TasksComponent,
    TasksAddComponent,
    TasksListComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [TaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
