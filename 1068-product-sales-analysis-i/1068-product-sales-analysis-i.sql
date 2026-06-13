# Write your MySQL query statement below
select s1.product_name,s.year,s.price from sales s 
left join product s1
on s.product_id = s1.product_id ;
