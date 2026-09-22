# Write your MySQL query statement below
select r.contest_id, ROUND(count(user_id)*100.0/(SELECT count(*) from users),2) as  percentage
from Register r
GROUP by contest_id
order by percentage desc,contest_id ASC