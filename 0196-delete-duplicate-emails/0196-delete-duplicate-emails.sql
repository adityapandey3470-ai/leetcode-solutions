# Write your MySQL query statement below
Delete p1
from Person p1
join Person p2 ON p2.email = p1.email
And p1.id > p2.id;