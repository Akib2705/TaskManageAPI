package com.springboot.model;

import java.time.LocalDate;
import java.util.Random;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "DailyTask")
public class Task {

	@Id
	private int id=generateRandomId();

	private String title;
	private String description;
	private boolean completed;
	private LocalDate dueDate;

	public Task(int id, String title, String description, boolean completed, LocalDate dueDate) {
		super();

		this.title = title;
		this.description = description;
		this.completed = completed;
		this.dueDate = dueDate;
	}

	public Task() {

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isCompleted() {
		return completed;
	}

	public void setCompleted(boolean completed) {
		this.completed = completed;
	}

	public LocalDate getDueDate() {
		return dueDate;
	}

	public void setDueDate(LocalDate dueDate) {
		this.dueDate = dueDate;
	}
	

    private int generateRandomId() {
        Random random = new Random();
        return random.nextInt(1000);
    }

	@Override
	public String toString() {
		return "Task [id=" + id + ", title=" + title + ", description=" + description + ", completed=" + completed
				+ ", dueDate=" + dueDate + "]";
	}

}
