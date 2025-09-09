/* Write your PL/SQL query statement below */
select MAX(salary) SecondHighestSalary  from Employee where 
salary <(select  MAX(salary) from Employee);