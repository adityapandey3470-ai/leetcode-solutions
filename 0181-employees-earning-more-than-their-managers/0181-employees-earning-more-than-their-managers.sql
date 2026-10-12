# Write your MySQL query statement below
select e.name as Employee
from Employee e
join Employee a
on e.managerid = a.id
where a.salary < e.salary;

