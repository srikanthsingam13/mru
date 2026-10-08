package com.example.demo1234;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/sample")
public class SampleController {

	
	@GetMapping("/hi")
	public String sayHi()
	{
		return "hi";
	}
}
