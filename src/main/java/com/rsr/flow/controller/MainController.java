package com.rsr.flow.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("hi")
public class MainController {

	@GetMapping("hello")
	public String hello()
	{
		return "hello";
	}
}
