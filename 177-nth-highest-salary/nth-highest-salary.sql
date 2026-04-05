CREATE FUNCTION getNthHighestSalary(N INT) RETURNS INT
BEGIN
  RETURN (
     
     WITH te AS
     (SELECT *,DENSE_RANK() OVER(ORDER BY Salary DESC)
     AS rnk 
     FROM Employee)
     
     SELECT DISTINCT IFNULL(Salary,null)
     FROM te 
     WHERE rnk = N
  );
END