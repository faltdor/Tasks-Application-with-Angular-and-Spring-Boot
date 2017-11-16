package com.faltdor.todo.repository;

import org.springframework.data.repository.CrudRepository;

import com.faltdor.todo.domain.Task;

public interface ITaskRepository extends CrudRepository<Task, Long>{
	
	
}
