package com.afrikatek.todoapp.service;

import java.util.Date;
import java.util.List;

import com.afrikatek.todoapp.model.ToDo;

public interface ToDoService {
	List<ToDo> findAll();
	ToDo findById(Long id);
	List<ToDo> findByPostedBefore(Date datePosted);
	List<ToDo> findByPostedAfter(Date datePosted);
	List<ToDo> findByDueBefore(Date date);
	ToDo addToDo(ToDo toDo);
	ToDo updateToDo(ToDo toDo);
	boolean deleteToDoById(Long id);
	boolean deleteToDo(ToDo toDo);
}
