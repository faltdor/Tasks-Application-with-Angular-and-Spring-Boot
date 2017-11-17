import { Injectable } from '@angular/core';
import { Http } from  '@angular/http';

import "rxjs/add/operator/map";



@Injectable()
export class TaskService {

 private urlTask: string =  '/api/tasks';

  constructor(private _http: Http) { }


  getTask(){
  	return this._http.get(this.urlTask).map(response => response.json());
  }


  saveTask(task,checked){}

}
