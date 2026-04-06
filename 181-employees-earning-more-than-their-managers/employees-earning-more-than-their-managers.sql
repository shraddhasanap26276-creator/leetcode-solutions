# Write your MySQL query statement below
SELECT e.name as Employee
FROM Employee e
JOIN Employee m on e.managerId = m.Id
WHERE e.salary > m.salary