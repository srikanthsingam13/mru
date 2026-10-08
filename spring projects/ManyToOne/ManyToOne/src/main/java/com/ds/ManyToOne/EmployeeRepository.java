package com.ds.ManyToOne;

import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository	extends JpaRepository<Employee,Long> {
}
