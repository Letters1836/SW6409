package com.sw409.HelloWorldRest.services;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.sw409.HelloWorldRest.models.HelloWorldBean;

@RestController
public class HelloWorld {
	
	@GetMapping(path = "/hello")
	public String helloworld() {
		
		return "Hello World!";
	
	}
	
	@GetMapping(path = "/hello/{name}")
	public String helloworld(@PathVariable("name") String str) {
		
		return "Hello " + str + "!";
	
	}
	
	@GetMapping(path = "/helloworldbean")
	public HelloWorldBean hello() {
		
		return new HelloWorldBean("Hello World from bean!");
		
	}
	
	@GetMapping(path = "/helloworldbean/{name}")
	public HelloWorldBean helloPathVar(@PathVariable("name") String str) {
		
		return new HelloWorldBean("Hello " + str + "!");
		
	}

}
