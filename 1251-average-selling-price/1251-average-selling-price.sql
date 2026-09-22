# Write your MySQL query statement below
SELECT p.product_id,COALESCE(ROUND(SUM(p.price*units)/NULLIF (SUM(u.units),0),2),0) AS average_price
from Prices p
left join UnitsSold u
On p.product_id = u.product_id
AND  u.purchase_date BETWEEN p.start_date AND p.end_date
group by p.product_id