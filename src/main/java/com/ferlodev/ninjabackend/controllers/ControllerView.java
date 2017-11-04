package com.ferlodev.ninjabackend.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ferlodev.ninjabackend.model.Person;

@Controller
@RequestMapping("/controller")
public class ControllerView {
	
	private static final String FORM_VIEW = "form";
	
	@RequestMapping(value="/showform", method= RequestMethod.GET)
	public String showForm(Model m){
		
		m.addAttribute("person", new Person());
		return FORM_VIEW;
	}
}
