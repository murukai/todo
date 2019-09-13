package com.afrikatek.todoapp.controller;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.afrikatek.todoapp.model.ToDo;
import com.afrikatek.todoapp.service.ToDoService;

@RestController
@RequestMapping("/api")
public class ToDoRestController {

	@Autowired
	private ToDoService toDoService;
	
	
	@GetMapping("/todos")
	public List<ToDo> allToDos(){
		return toDoService.findAll();
	}
	
	@GetMapping("/todos/{id}/todo")
	public ToDo getToDoById(@PathVariable Long id) {
		return toDoService.findById(id);
	}
	
	@GetMapping("/todos/{datePosted}/before")
	public List<ToDo> allToDosPostedBefore(@PathVariable String datePosted){
		Date date = toDoService.convertStringToDate(datePosted);
		return toDoService.findByPostedBefore(date);
	}
}
