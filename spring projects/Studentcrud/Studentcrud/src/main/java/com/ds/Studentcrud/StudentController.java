package com.ds.Studentcrud;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/student")
public class StudentController {
	
	@Autowired
	StudentRepository stdrepo;
	
	@PostMapping("/save")
	public Student saveStudent(@RequestBody Student std)
	{
		return stdrepo.save(std);
	}
	
	@GetMapping("/fetchdetails")
	public List<Student> fetchStudents()
	{
		return stdrepo.findAll();
	}
	
	@GetMapping("/fetchrecord/{id}")
	public Optional<Student> fetchStudent(@PathVariable int id)
	{
		return stdrepo.findById(id);
	}
	
	@DeleteMapping("/delete/{id}")
	public String delete(@PathVariable int id)
	{
		
		stdrepo.deleteById(id);
		return "deleted";
	}
	
	@PutMapping("/update/{id}")
	public Student updateStudent(@RequestBody Student std,
			@PathVariable int id)
	{
		Student oldstudent=stdrepo.findById(id).orElse(null);
		oldstudent.setSname(std.getSname());
		oldstudent.setScourse(std.getScourse());
		return stdrepo.save(oldstudent);
	}
	
}
