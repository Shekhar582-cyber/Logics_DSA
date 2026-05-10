/* Write your PL/SQL query statement */
SELECT Name as Customers
FROM Customers
WHERE id NOT IN (
    SELECT customerId
    FROM Orders
);