# Write your MySQL query statement below
SELECT e.name,b.bonus
from Employee e
left Join Bonus b
on e.empId = b.empId
where bonus<1000 
or bonus is null