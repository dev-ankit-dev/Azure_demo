package com.azure.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AzureDemoController {
	
@GetMapping(value="/hello") 
public String hello(){
	
		
		return "Azure Pipeline in git";
		
		
	}

}
