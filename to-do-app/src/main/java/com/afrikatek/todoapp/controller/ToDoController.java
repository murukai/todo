package com.afrikatek.todoapp.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class ToDoController {

	@GetMapping(value = {"/","/home","index"})
	public String home(Model model) {
		return "home";
	}
}
