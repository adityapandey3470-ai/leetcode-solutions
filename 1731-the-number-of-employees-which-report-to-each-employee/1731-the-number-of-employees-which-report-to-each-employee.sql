# Write your MySQL query statement below
select e.employee_id, e.name, count(m.employee_id) as reports_count,
 round(Avg(m.age)) as average_age
 from Employees e
 join  Employees m ON m.reports_to = e.employee_id
 GROUP BY e.employee_id, e.name
 ORDER BY e.employee_id;

