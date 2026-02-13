package com.klu.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.klu.service.CalciService;

@RestController
@RequestMapping("/calci")
public class CalciController {
	@Autowired
	private CalciService service;
	
	//Addition - RequestParam
	// URL : http://localhost:8080/calci/add?a=10&b=5
	@RequestMapping("/add")
	public int add(@RequestParam int a, @RequestParam int b) {
		return service.add(a,b);
	}
	
	//Subctraction - PathVariable
	// URL : http://localhost:8080/calci/sub/12/8
	@RequestMapping("/sub/{a}/{b}")
	public int sub(@PathVariable int a, @PathVariable int b) {
		return service.sub(a,b);
	}
	
	// URL : http://localhost:8080/calci/mul/12/8
	@RequestMapping("/mul/{a}/{b}")
	public int mul(@PathVariable int a, @PathVariable int b) {
		return service.multiply(a,b);
	}
	
	//http://localhost:8080/calci/div?a=10&b=5
	@RequestMapping("/div")
	public double div(@RequestParam int a, @RequestParam int b) {
		return service.divide(a,b);
	}
	
	//http://localhost:8080/calci/modulo?a=10&b=5
	@RequestMapping("/modulo")
	public int modulo(@RequestParam int a, @RequestParam int b) {
		return service.modulo(a,b);
	}
	
	
	
	
}
