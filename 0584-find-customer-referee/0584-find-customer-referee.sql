# Write your MySQL query statement below
select name from Customer where (isNull(referee_id) or referee_id!=2 )