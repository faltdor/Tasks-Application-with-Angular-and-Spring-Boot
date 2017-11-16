package com.faltdor.todo;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import com.faltdor.todo.domain.Task;
import com.faltdor.todo.service.ITaskService;

@SpringBootApplication
public class TodoTaskAppApplication {

	public static void main(String[] args) {
		SpringApplication.run(TodoTaskAppApplication.class, args);
	}
	
	@Bean
	CommandLineRunner runner(ITaskService taskService) {
		return args -> {
			taskService.save(new Task(1L,"Create Boot Application",LocalDate.now(),true));	
			taskService.save(new Task(2L,"Create Boot Application",LocalDate.now().plus(1,ChronoUnit.DAYS),false));
			taskService.save(new Task(3L,"Create Boot Application",LocalDate.now().plus(2,ChronoUnit.DAYS),false));
			taskService.save(new Task(4L,"Create Boot Application",LocalDate.now().plus(3,ChronoUnit.DAYS),false));
			taskService.save(new Task(5L,"Create Boot Application",LocalDate.now().plus(4,ChronoUnit.DAYS),false));
			taskService.save(new Task(6L,"Create Boot Application",LocalDate.now().plus(5,ChronoUnit.DAYS),false));
			taskService.save(new Task(7L,"Create Boot Application",LocalDate.now().plus(6,ChronoUnit.DAYS),false));
			taskService.save(new Task(8L,"Create Boot Application",LocalDate.now().plus(7,ChronoUnit.DAYS),false));

			
			
		};
	}
}
