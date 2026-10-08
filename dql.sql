create database emp1;

use emp1;

CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(30),
    department VARCHAR(20),
    salary DECIMAL(10,2)
);

INSERT INTO employee VALUES
(101,'Ravi','IT',50000),
(102,'Kiran','HR',45000),
(103,'Priya','IT',60000),
(104,'Suresh','Finance',55000);


SELECT * FROM employee;

SELECT emp_name, salary
FROM employee;

SELECT *
FROM employee
WHERE department = 'IT';

SELECT *
FROM employee
ORDER BY salary ASC;

SELECT *
FROM employee
ORDER BY salary DESC;

SELECT DISTINCT department
FROM employee;

SELECT COUNT(*) AS TotalEmployees
FROM employee;

SELECT MAX(salary) AS HighestSalary
FROM employee;


SELECT MIN(salary) AS LowestSalary
FROM employee;

SELECT avg(salary) AS AverageSalary
FROM employee;

SELECT SUM(salary) AS TotalSalary
FROM employee;

SELECT department, COUNT(*) AS EmployeeCount
FROM employee
GROUP BY department;

SELECT department, COUNT(*) AS EmployeeCount
FROM employee
GROUP BY department
HAVING COUNT(*) > 1;

SELECT *
FROM employee
WHERE emp_name LIKE 'R%';

SELECT *
FROM employee
WHERE emp_name LIKE '%a';

SELECT *
FROM employee
WHERE salary BETWEEN 45000 AND 55000;
