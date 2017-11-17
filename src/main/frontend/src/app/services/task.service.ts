import { Injectable } from '@angular/core';
import { Http } from  '@angular/http';

import "rxjs/add/operator/map";

import { Task } from '../model/task';

@Injectable()
export class TaskService {

 private urlTask: string =  '/api/tasks/';

  constructor(private _http: Http) { }


  getTask(){
  	return this._http.get(this.urlTask).map(response => response.json());
  }


  saveTask(task:Task,checked:boolean){
  	task.completed = checked;

  	return this._http.post(this.urlTask+'save',task)
  			  .map(response => response.json())	;

  }

}
