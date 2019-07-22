package com.afrikatek.todoapp.service;

import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.afrikatek.todoapp.model.ToDo;
import com.afrikatek.todoapp.repository.ToDoRepository;

@Service
public class ToDoServiceImpl implements ToDoService {

	@Autowired
	private ToDoRepository toDoRepository;
	
	@Override
	public List<ToDo> findAll() {
		return toDoRepository.findAll();
	}

	@Override
	public ToDo findById(Long id) {
		return toDoRepository.getOne(id);
	}

	@Override
	public List<ToDo> findByPostedBefore(Date datePosted) {
		return toDoRepository.findByDatePostedBefore(datePosted);
	}

	@Override
	public List<ToDo> findByPostedAfter(Date datePosted) {
		return toDoRepository.findByDatePostedAfter(datePosted);
	}

	@Override
	public List<ToDo> findByDueBefore(Date date) {
		return toDoRepository.findByDateDueBefore(date);
	}

	@Override
	public ToDo addToDo(ToDo toDo) {
		return toDoRepository.save(toDo);
	}

	@Override
	public ToDo updateToDo(ToDo toDo) {
		return toDoRepository.save(toDo);
	}

	@Override
	public boolean deleteToDoById(Long id) {
		try {
			toDoRepository.deleteById(id);
			return true;
		}catch (Exception e) {
			
		}
		return false;
	}

	@Override
	public boolean deleteToDo(ToDo toDo) {
		try {
			toDoRepository.delete(toDo);
			return true;
		}catch (Exception e) {
			
		}
		return false;
	}

}
