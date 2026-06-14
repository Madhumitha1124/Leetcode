# Write your MySQL query statement below
select s.product_id, s.year as first_year,s.quantity,s.price from sales s
join (select product_id,min(year) as  first_year from sales group by product_id ) m
on s.product_id=m.product_id and s.year=m.first_year;
 
