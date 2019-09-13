package com.afrikatek.todoapp.controller;

import com.afrikatek.todoapp.model.ToDo;
import com.afrikatek.todoapp.service.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.jws.WebParam;
import java.awt.print.Pageable;
import java.util.List;

@Controller
public class ToDoController {

	@Autowired
	private ToDoService toDoService;
	@GetMapping(value = {"/","/home","index"})
	public String home(Model model, @RequestParam(defaultValue = "0") int page) {

		PageRequest requestedPage = PageRequest.of(page, 3);
		Page<ToDo> todos = toDoService.findAll(requestedPage);
		model.addAttribute("currentPage", page);
		model.addAttribute("todos", todos);
		return "home";
	}

	@GetMapping("/get-add-todo")
	public String getAddToDo(Model model){
		return "addtodo";
	}
}
