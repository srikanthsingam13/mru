package com.cs.DerivedQueries;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	@Autowired
	EmployeeRepository repository;
	
	@PostMapping("/save")
	public Employee save(@RequestBody Employee emp)
	{
		return repository.save(emp);
	}
	
	@GetMapping("fetch/{name}")
	public List<Employee> fetchByName(@PathVariable String name)
	{
		return repository.findByName(name);
	}
	@GetMapping("/fetchSalary/{sal}")
	public List<Employee> findBySalary(@PathVariable double sal)
	{
		return repository.findBySalary(sal);
	}
	
}
