package com.afrikatek.todoapp.service;

import java.util.Date;
import java.util.List;

import com.afrikatek.todoapp.model.ToDo;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

public interface ToDoService {
	List<ToDo> findAll();
	Page<ToDo> findAll(Pageable pageable);
	ToDo findById(Long id);
	List<ToDo> findByPostedBefore(Date datePosted);
	List<ToDo> findByPostedAfter(Date datePosted);
	List<ToDo> findByDueBefore(Date date);
	ToDo addToDo(ToDo toDo);
	ToDo updateToDo(ToDo toDo);
	boolean deleteToDoById(Long id);
	boolean deleteToDo(ToDo toDo);
	Date convertStringToDate(String date);
}
