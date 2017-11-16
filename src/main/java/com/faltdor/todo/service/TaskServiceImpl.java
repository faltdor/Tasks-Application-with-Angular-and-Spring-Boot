package com.faltdor.todo.service;

import org.springframework.stereotype.Service;

import com.faltdor.todo.domain.Task;
import com.faltdor.todo.repository.ITaskRepository;

@Service
public class TaskServiceImpl implements ITaskService {
	
	
	private final ITaskRepository taskRepository;
	
	public TaskServiceImpl(ITaskRepository taskRepository) {
		this.taskRepository = taskRepository;
	}

	@Override
	public Iterable<Task> list() {
		return this.taskRepository.findAll();
	}

	@Override
	public Task save(Task task) {
		return this.taskRepository.save(task);
	}

}
