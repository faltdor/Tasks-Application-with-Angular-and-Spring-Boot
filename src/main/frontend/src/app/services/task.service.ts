import { Injectable,EventEmitter } from '@angular/core';
import { Http } from  '@angular/http';

import "rxjs/add/operator/map";

import { Task } from '../model/task';

@Injectable()
export class TaskService {

  private urlTask: string =  '/api/tasks/';

  onTaskAdded = new EventEmitter<Task>();

  constructor(private _http: Http) { }


  getTask(){
  	return this._http.get(this.urlTask).map(response => response.json());
  }


  saveTask(task:Task,checked:boolean){
  	task.completed = checked;

  	return this._http.post(this.urlTask+'save',task)
  			  .map(response => response.json())	;

  }

  addTask(task: Task){
  	return this._http.post(this.urlTask+'save',task)
  			  .map(response => response.json())	;
  }

}
