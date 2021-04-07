package com.stacksimplify.restservice.springbootbuildingblocks.Hello;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorldController {
	
	//@RequestMapping(method = RequestMethod.GET, path = "/helloWorld")
	@GetMapping(path = "/helloWorld")
	public String helloWorldMethod() {
		return "HelloWorld-1";
	}
	
	@GetMapping(path = "/hellowWorldBean")
	public UserDetails helloWorldBean() {
		return new UserDetails("Penchi", "E", "Chennai");
	}
}
