package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MyController {
	
	@RequestMapping("/")
	public String index() {
		
		return "index";
	}
	
	@RequestMapping("gotoSecondPage")
	public String secondPage(@RequestParam(value="valueOne") String valueOne, Model model) {
		model.addAttribute("valueOne", valueOne);
		return "secondPage";
	}
	
	@RequestMapping("result")
	public String result(@RequestParam(value="valueOne")String valueOne, @RequestParam(value ="valueTwo") String valueTwo, Model model) {
		
		int total=0;
		
		total = Integer.parseInt(valueOne) + Integer.parseInt(valueTwo);
		model.addAttribute("total", total);
		return "result";
	}

}
