package com.ds.BetaOneToOne;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/one")
public class OneToOneController {

	@Autowired
	PersonRepository prsrepo;
	
	@PostMapping("/save")
	public Person savePerson(@RequestBody Person person)
	{
		return prsrepo.save(person);
	}
}
