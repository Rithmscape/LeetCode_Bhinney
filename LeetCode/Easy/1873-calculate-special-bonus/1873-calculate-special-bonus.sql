# Write your MySQL query statement below

select employee_id,
if (employee_id % 2 and name not like "M%", salary, 0) as bonus
from Employees order by employee_id;

# select 
#     employee_id, 
#     salary * (employee_id % 2) * (name not like "M%") as bonus 
# from Employees order by employee_id;