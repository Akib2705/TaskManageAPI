package com.springboot.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.model.Task;
import com.springboot.repository.TaskRepository;

@Service
public class TaskServiceDaoImpl implements TaskServiceDao {

	@Autowired
	private TaskRepository taskRepository;

	@Override
	public Task createTask(Task task) {
		Task save = taskRepository.save(task);
		return save;
	}

	@Override
	public List<Task> getAllTasks() {
		List<Task> findAll = taskRepository.findAll();
		return findAll;
	}

	@Override
	public Task updateTask(int id, Task updatedTask) {
		Task task = taskRepository.findById(id).get();

		if (task != null) {
			task.setTitle(updatedTask.getTitle());
			task.setDescription(updatedTask.getDescription());
			task.setCompleted(updatedTask.isCompleted());
			task.setDueDate(updatedTask.getDueDate());
			return taskRepository.save(task);
		} else {
			System.out.println("No tasks is stored");
			return null;
		}
	}

	@Override
	public Task getTaskById(int id) {
		Task task = taskRepository.findById(id).get();
		return task;
	}

	@Override
	public void deleteTask(int id) {
		Task task = taskRepository.findById(id).get();
		taskRepository.delete(task);
	}

}
