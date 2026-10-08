package com.beta.EmployeeCrud;

import java.util.HashSet;
import java.util.List;

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
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeRepository emprepo;
	
	@PostMapping("/save")
	public Employee saveEmployee(@RequestBody Employee e)
	{
		return emprepo.save(e);
	}
	
	@GetMapping("/getEmployees")
	public List<Employee> getEmps()
	{
		return emprepo.findAll();
	}
	@GetMapping("/getemp/{id}")
	public Employee getEmp(@PathVariable int id)
	{
		return emprepo.findById(id).orElse(null);
	}
	
	@PutMapping("/updateEmployee/{id}")
	public Employee update(@RequestBody Employee emp,
			@PathVariable int id)
	{
		//select * from emp where id=1;
		Employee oldemployee=emprepo.findById(id).orElse(null);
		oldemployee.setEmpname(emp.getEmpname());
		oldemployee.setEmpemail(emp.getEmpemail());
		return emprepo.save(oldemployee);
	}
	
	@DeleteMapping("/delete/{id}")
	public String deleteEmployee(@PathVariable int id)
	{
		emprepo.deleteById(id);
		return " deleted";
	}
	
	
	
	
	
}
