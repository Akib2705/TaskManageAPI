package com.springboot.service;

import java.util.List;

import com.springboot.model.Task;

public interface TaskServiceDao {

	Task createTask(Task task);
	
	List<Task> getAllTasks();
	
	Task updateTask(int id,Task updatedTask);
	
	Task getTaskById(int id);
	
	void deleteTask(int id);
}
