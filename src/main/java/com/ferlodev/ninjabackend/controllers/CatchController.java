package com.ferlodev.ninjabackend.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
@RequestMapping(path="/catchcontroller")
public class CatchController {
	
	static final public String SHOW_VIEW = "show";
	
	@PostMapping("/catchRequest")	
	public ModelAndView catchRequest(@RequestParam(name="name", required = false, defaultValue="NULL") String name){
		//add view to return 
		ModelAndView m = new ModelAndView(SHOW_VIEW);
		//add object value to show at view
		m.addObject("name", name);
		return m;
	}
}
