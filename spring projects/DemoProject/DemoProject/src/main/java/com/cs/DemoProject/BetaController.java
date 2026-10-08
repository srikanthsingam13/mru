package com.cs.DemoProject;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/beta")
public class BetaController {

	@GetMapping("/vishnu")
	public String callVishnu()
	{
		return "hey vishnu";
	}
	
	@PostMapping("/shiva")
	public String callShiva()
	{
		return "hey shiva";
	}
	
	@PutMapping("/nani")
	public String callNani()
	{
		return "hey nani";
	}
	
	@DeleteMapping("/raki")
	public String callRaki()
	{
		return "hey raki";
	}
	
	@GetMapping("/students/{id}")
	public String getStudentId(@PathVariable int id)
	{
		return "student ="+id;
	}
	
	@GetMapping("/employee")
	public String emp(@RequestParam String name)
	{
		return name;
	}
	
	@GetMapping("/course")
	public String courseDetails(@RequestParam String cname,
			@RequestParam int cid)
	{
	return "cname :"+cname+"c id:"+cid;	
	}
	
	@PostMapping("/std")
	public String saveStudent(@RequestBody Student std)
	{
		return std.getEmail()+"\t"+std.getName();
	}
	
	
	
}
