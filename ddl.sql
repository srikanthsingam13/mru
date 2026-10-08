CREATE DATABASE company;
use company;
create table employee(
emp_id	int,
emp_name	varchar(50),
emp_salary	decimal(10,2)
);

alter table employee add address varchar(50);
alter table employee modify address varchar(100);
alter table employee drop column address;


rename table employee to employees;
rename table employees to employee;

drop table employee;

drop database company;

truncate table employee;