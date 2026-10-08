package com.cs.OneToManyCS;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class OneToManyController {
	@Autowired 
	EmployeeRepository emprepo;
	
	@Autowired 
	DepartmentRepository deptrepo;
	
	@PostMapping("/save")

    public Department save(@RequestBody Department dept) {
        return deptrepo.save(dept);
    }

	
	
	
	
}
