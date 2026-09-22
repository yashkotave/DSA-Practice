# Write your MySQL query statement below
SELECT query_name,ROUND(AVG(rating/position),2) as quality, 
ROUND(AVG(CASE
        WHEN rating<3 then 1
        else 0
        END )*100,
        2) as poor_query_percentage
from Queries
GROUP By query_name 