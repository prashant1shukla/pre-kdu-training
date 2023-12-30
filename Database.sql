-- Create database
CREATE DATABASE employee;
USE employee;

-- Create department table
CREATE TABLE department (
    department_id INT PRIMARY KEY,
    department_name VARCHAR(255)
);

-- Create employee table
CREATE TABLE employee (
    employee_id INT PRIMARY KEY,
    employee_name VARCHAR(255),
    salary DECIMAL(10, 2),
    department_id INT,
    FOREIGN KEY (department_id) REFERENCES department(department_id)
);

-- Query to print employee_id, employee_name and department_name
SELECT e.employee_id, e.employee_name, d.department_name
FROM employee e
INNER JOIN department d ON e.department_id = d.department_id;

-- Query to print all the employees and their salaries in descending order of their salary
SELECT employee_name, salary
FROM employee
ORDER BY salary DESC;

-- Query to print the average salary of employees in each department with the department name
SELECT d.department_name, AVG(e.salary) as average_salary
FROM employee e
INNER JOIN department d ON e.department_id = d.department_id
GROUP BY d.department_id, d.department_name;
