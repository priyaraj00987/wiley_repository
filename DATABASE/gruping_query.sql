-- Get the total amount of all order by status, join order table with orderdetails table
-- SUM 
use empdb;
SELECT
    status,
    SUM(quantityOrdered * priceEach) AS amount
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
GROUP BY
    status;

-- Return the order numbers and the total amount of each order
SELECT
    orderNumber,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orderdetails
GROUP BY
    orderNumber;

-- get the total sales for each year
SELECT
    YEAR(orderDate) AS year,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
WHERE
    status = "Shipped"
GROUP BY
    YEAR(orderDate);

-- select the total sales of the years after 2003; 
SELECT
    YEAR(orderDate) AS year,
    SUM(quantityOrdered * priceEach) AS total
FROM
    orders
    INNER JOIN orderdetails USING (orderNumber)
WHERE
    status = "Shipped"
GROUP BY
    year
HAVING
    year > 2003;



-- total number of orders per year
SELECT
    year(orderDate) as YEAR,
    COUNT(orderNumber) AS Total
FROM
    orders
GROUP BY
    YEAR;
SELECT
    status,
    COUNT(*)
FROM
    orders
GROUP BY
    status;


-- Get order numbers , the number of items sold per order and total sales for each from the orders table
SELECT
    orderNumber,
    SUM(quantityOrdered) AS itemsCount,
    SUM(priceEach * quantityOrdered) AS total
FROM
    orderDetails
GROUP BY
    orderNumber;

-- Find the total sales greater than 1000 
SELECT
    orderNumber,
    SUM(quantityOrdered) AS itemsCount,
    SUM(priceEach * quantityOrdered) AS total
FROM
    orderDetails
GROUP BY
    orderNumber
HAVING
    total > 1000;


-- Find the total sales greater than 1000 and contains more than 600 items 
SELECT
    orderNumber,
    SUM(quantityOrdered) AS itemsCount,
    SUM(priceEach * quantityOrdered) AS total
FROM
    orderDetails
GROUP BY
    orderNumber
HAVING
    total > 1000
    AND itemsCount > 600;

-- Find all the orders that already shipped and total amount greater than 1500
SELECT
    a.orderNumber,
    status,
    SUM(priceEach * quantityOrdered) AS total
FROM
    orderDetails a
    INNER JOIN orders b ON b.orderNumber = a.orderNumber
GROUP BY
    orderNumber,
    status
HAVING
    status = "Shipped"
    AND total > 1500;

-- ROLLUP


CREATE TABLE sales
SELECT
    productline,
    YEAR(orderDate) orderYear,
    SUM(priceEach * quantityOrdered) AS orderValue
FROM
    orderDetails
    INNER JOIN orders USING(orderNumber)
    INNER JOIN products USING (productCode)
GROUP BY
    productline,
    orderYear;

-- Grouping set is a set of columns which you wanted to group. 
SELECT
    productline,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    productline;

-- this will create empty group
SELECT
    SUM(orderValue) totalOrderValue
FROM
    sales;

-- two or more grouping sets together in one query UNION ALL
SELECT
    productline,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    productline
UNION
ALL
SELECT
    NULL,
    SUM(orderValue) totalOrderValue
FROM
    sales;

-- Fix the above issues with ROLLUP
SELECT
    productline,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    productline WITH ROLLUP;

--
SELECT
    productline,
    orderYear,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    productline,
    orderYear WITH ROLLUP;

--  productline > orderYear 
SELECT
    orderYear,
    productline,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    orderYear,
    productline WITH ROLLUP;

SELECT
    IF(GROUPING(orderYear), 'All Years', orderYear) orderYear,
    IF(GROUPING(productline), 'All Product Line', productline) productline,
    SUM(orderValue) totalOrderValue
FROM
    sales
GROUP BY
    orderYear,
    productline WITH ROLLUP;