package com.cs.DemoOneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OnetooneController {

	@Autowired
	PersonRepository personrepo;
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person)
	{
		return personrepo.save(person);
	}
}
