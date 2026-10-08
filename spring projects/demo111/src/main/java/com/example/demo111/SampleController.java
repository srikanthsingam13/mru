package com.example.demo111;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.v3.oas.annotations.Operation;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.*;
@RestController
@RequestMapping("/sample")
public class SampleController {

	

    private List<Employee> employees = new ArrayList<>();

    @GetMapping
    @Operation(summary = "Get All Employees")
    public List<Employee> getAllEmployees() {

        employees.add(new Employee(101,"John",50000));
        employees.add(new Employee(102,"David",60000));

        return employees;
    }

    @GetMapping("/{id}")
    public Employee getEmployee(@PathVariable int id) {

        return new Employee(id,"John",50000);
    }

    @PostMapping
    @Operation(summary = "Add New Employee")
    public Employee addEmployee(@RequestBody Employee employee) {

        return employee;
    }

    @PutMapping("/{id}")
    public String updateEmployee(@PathVariable int id,
                                 @RequestBody Employee employee) {

        return "Employee Updated Successfully";
    }

    @DeleteMapping("/{id}")
    public String deleteEmployee(@PathVariable int id) {

        return "Employee Deleted Successfully";
    }
}
