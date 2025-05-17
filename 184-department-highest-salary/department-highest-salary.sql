# Write your MySQL query statement below
WITH ranked AS (
    SELECT
        d.name  AS Department,
        e.name  AS Employee,
        e.salary AS Salary,
        RANK() OVER (PARTITION BY e.departmentId
                     ORDER BY e.salary DESC) AS rnk
    FROM Employee   e
    JOIN Department d ON d.id = e.departmentId
)
SELECT Department, Employee, Salary
FROM   ranked
WHERE  rnk = 1;
