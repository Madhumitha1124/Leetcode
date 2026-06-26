# Write your MySQL query statement 
Select activity_date as day ,count(distinct user_id) as active_users 
from activity
where activity_date between date_add('2019-07-27',INTERVAL-29 day) 
and '2019-07-27'
group by activity_date;
