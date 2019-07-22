package com.afrikatek.todoapp.repository;

import java.util.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.afrikatek.todoapp.model.ToDo;

public interface ToDoRepository extends JpaRepository<ToDo, Long> {
	List<ToDo> findByDatePostedBefore(Date datePosted);
	List<ToDo> findByDatePostedAfter(Date datePosted);
	List<ToDo> findByDateDueBefore(Date date);
}
