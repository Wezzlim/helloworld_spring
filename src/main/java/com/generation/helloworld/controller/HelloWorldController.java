package com.generation.helloworld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloWorldController {

	@GetMapping
	public String hello()
	{
		return "<b>Hello World!</b>";
	}
	
	@GetMapping("/world")
	public String world()
	{
		return "<marquee>World is Mine!</marquee>";
	}
	
}
