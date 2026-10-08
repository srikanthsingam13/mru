CREATE DATABASE college;
USE college;
CREATE TABLE department (
    dept_id INT PRIMARY KEY,
    dept_name VARCHAR(30),
    location VARCHAR(30)
);

INSERT INTO department
VALUES (1, 'HR', 'Hyderabad');

INSERT INTO department
VALUES (2, 'Finance', 'Mumbai');

INSERT INTO department
VALUES (3, 'IT', 'Bangalore');

SELECT * FROM department;

UPDATE department
SET location = 'Chennai'
WHERE dept_id = 3;

SELECT * FROM department;

DELETE FROM department
WHERE dept_id = 2;

SELECT * FROM department;

