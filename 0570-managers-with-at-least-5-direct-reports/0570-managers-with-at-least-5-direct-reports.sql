# Write your MySQL query statement below
Select  m.name
from Employee e
join Employee m
on e.managerId = m.id
GROUP BY m.id,m.name
HAVING COUNT(DISTINCT e.id)>=5