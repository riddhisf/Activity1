package com.example.demo.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/activity")
public class ActivityController {
	
	@GetMapping("/chirag")
	public String getActivity() {
		return "Hello from Chirag!!";
	}

	@GetMapping("/riddhi")
	public String getActivity1() {
		return "Hello from Riddhi!!";
	}
	@GetMapping("/ishank")
	public String getActivity2() {
		return "Hello from Ishank!!";
	}
	@GetMapping("/tryambakesh-satish")
	public String test() {
		return "Hello from Tryambakesh Satish!";
	}

}
