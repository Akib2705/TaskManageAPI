package com.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Task;
import com.springboot.service.TaskServiceDao;

@RestController
public class TaskController {

	@Autowired
	private TaskServiceDao serviceDao;

	@RequestMapping("/addTask")
	public Task addTask(@RequestBody Task task) {
		System.out.println(task.getId());
		Task createTask = serviceDao.createTask(task);
		return createTask;
	}

	@GetMapping("/taskList")
	public List<Task> getAllTaskList() {
		List<Task> allTasks = serviceDao.getAllTasks();
		return allTasks;

	}

	@DeleteMapping("/deleteTask/{id}")
	public void deleteTask(@PathVariable("id") int id) {

		serviceDao.deleteTask(id);
		System.out.println("data deleted successfully");
	}

	@PutMapping("/updateTask/{id}")
	public Task updateTask(@PathVariable int id, @RequestBody Task task) {
		Task updateTask = serviceDao.updateTask(id, task);
		return updateTask;
	}
}
