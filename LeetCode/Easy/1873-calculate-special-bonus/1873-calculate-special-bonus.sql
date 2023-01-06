# Write your MySQL query statement below

# SELECT employee_id,
# IF (employee_id % 2 AND name not like "M%", salary, 0) as bonus
# FROM Employees order by employee_id;

select 
    employee_id, 
    salary * (employee_id % 2) * (name not like "M%") as bonus 
from Employees order by employee_id;