package com.faltdor.todo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.faltdor.todo.domain.Task;
import com.faltdor.todo.service.TaskServiceImpl;

@RestController
@RequestMapping("/api/tasks")
public class TaskController {
	
	private final TaskServiceImpl taskService;
	
	public TaskController(TaskServiceImpl taskService) {
		this.taskService = taskService;
	}
	
	@GetMapping(value= {"","/"})
	public Iterable<Task> listTask(){
		return this.taskService.list();
	}
	
	@PostMapping("/save")
	public Task saveTask(@RequestBody Task task) {
		return this.taskService.save(task);
	}
	
	
}
