package com.ds.OneToMany;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/department")
public class DepartmentController {

    @Autowired
    private DepartmentRepository repository;

    @PostMapping
    public Department save(@RequestBody Department dept) {
        return repository.save(dept);
    }

    @GetMapping
    public List<Department> getAll() {
        return repository.findAll();
    }
}
