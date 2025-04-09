# Write your MySQL query statement below
SELECT
FirstName,
LastName,
City,
State
FROM Person p
LEFT JOIN Address a
ON p.Personid = a.Personid;

