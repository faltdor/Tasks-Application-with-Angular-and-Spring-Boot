package com.faltdor.todo.service;

import com.faltdor.todo.domain.Task;

public interface ITaskService {
	
	Iterable<Task> list();
	
	Task save (Task task);
	
}
