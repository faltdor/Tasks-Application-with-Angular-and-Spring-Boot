import { Component, OnInit } from '@angular/core';
import { Task } from '../../../model/task';

import { TaskService } from '../../../services/task.service';


@Component({
  selector: 'app-tasks-list',
  templateUrl: './tasks-list.component.html',
  styleUrls: ['./tasks-list.component.css']
})
export class TasksListComponent implements OnInit {

  tasks : Task[] = []; 	

  constructor(private taskService:TaskService ) { }

  ngOnInit() {
  	this.tasks.push(new Task(1,'Task 1',false,'07/08/2017'));
  	this.tasks.push(new Task(2,'Task 2',false,'07/08/2017'));
  	this.tasks.push(new Task(3,'Task 3',false,'07/08/2017'));
  	this.tasks.push(new Task(4,'Task 4',false,'07/08/2017'));
  }

  onTaskChange(event, task: Task){
    this.taskService.saveTask(task,event.target.checked);
  }

  getDueDateLabel(task:Task){
    return task.completed ? 'label-success' : 'label-primary';
  }

}
