# Write your MySQL query statement below
select p.firstName,p.lastName,a.city,a.state from Person as p left Join Address as a on
p.personId=a.personId