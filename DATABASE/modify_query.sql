CREATE TABLE IF NOT EXISTS tasks (
    task_id INT AUTO_INCREMENT,
    title VARCHAR(255) NOT NULL,
    start_date DATE,
    due_date DATE,
    priority TINYINT NOT NULL DEFAULT 3,
    description TEXT,
    PRIMARY KEY (task_id)
);

INSERT INTO 
	tasks(title, priority, start_date)
VALUES("TASK1", DEFAULT, CURRENT_DATE() ); 



CREATE TABLE projects1(
	project_id INT AUTO_INCREMENT, 
	name VARCHAR(100) NOT NULL,
	start_date DATE,
	end_date DATE,
	PRIMARY KEY(project_id)
);


INSERT INTO 
	projects1(name, start_date)
VALUES
	('AI for Marketing','2019-08-01'),
	('ML for Sales','2019-05-15');

SHOW VARIABLES LIKE 'max_allowed_packet';


-- INSERT ON DUPLICATE KEY UPDATE 

CREATE TABLE devices(
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(100)
);

INSERT INTO devices(name)
VALUES('Rourter F1'),('Switch 1'),('Switch 2');


INSERT INTO devices(id, name)
VALUES(4,'Printer')
ON DUPLICATE KEY UPDATE name = "My Printer";


CREATE TABLE subscribers(
    id INT AUTO_INCREMENT PRIMARY KEY,
    email VARCHAR(100) NOT NULL UNIQUE
);

INSERT INTO subscribers(email)
VALUES('priyaraj0330987@gmail.com');

INSERT INTO subscribers(email)
VALUES('piryaraj00987@gmail4.com'), ('piryarasj00987@gmail.com');

INSERT IGNORE INTO subscribers(email)
VALUES('piryaraj00987@gmail.com'), ('piryaraj00987@gmail.com');


-- UPDATE 

select firstname, lastname, email from employees where employeeNumber = 1056;

UPDATE employees 
SET email = 'piryaraj00987@gmail.com'
where employeeNumber = 1056;

-- update multiple values
UPDATE employees 
SET 
    email = "'piryaraj00987@gmail.com'",
    lastName = "Paterson"
where employeeNumber = 1056;


-- update and replace values
UPDATE employees 
SET 
    email = REPLACE(email,'@classicmodelcars.com', '@wileyedge.com')
where 
    jobTitle = 'Sales Rep' AND 
    officeCode = 0;


CREATE TABLE suppliers (
    supplierNumber INT AUTO_INCREMENT,
    supplierName VARCHAR(50) NOT NULL,
    phone VARCHAR(50),
    addressLine1 VARCHAR(50),
    addressLine2 VARCHAR(50),
    city VARCHAR(50),
    state VARCHAR(50),
    postalCode VARCHAR(50),
    country VARCHAR(50),
    customerNumber INT,
    PRIMARY KEY (supplierNumber)
);

SELECT 
    customerNumber,
    customerName,
    phone,
    addressLine1,
    addressLine2,
    city,
    state,
    postalCode,
    country
FROM
    customers
WHERE
    country = 'USA' AND 
    state = 'CA';










-- MySQL UPDATE JOIN 

CREATE DATABASE IF NOT EXISTS empdb;

USE empdb;

-- create tables
CREATE TABLE merits (
    performance INT(11) NOT NULL,
    percentage FLOAT NOT NULL,
    PRIMARY KEY (performance)
);

CREATE TABLE employees (
    emp_id INT(11) NOT NULL AUTO_INCREMENT,
    emp_name VARCHAR(255) NOT NULL,
    performance INT(11) DEFAULT NULL,
    salary FLOAT DEFAULT NULL,
    PRIMARY KEY (emp_id),
    CONSTRAINT fk_performance FOREIGN KEY (performance)
        REFERENCES merits (performance)
);
-- insert data for merits table
INSERT INTO merits(performance,percentage)
VALUES(1,0),
      (2,0.01),
      (3,0.03),
      (4,0.05),
      (5,0.08);
-- insert data for employees table
INSERT INTO employees(emp_name,performance,salary)      
VALUES('priya', 1, 50000),
      ('Rishav Raj', 3, 65000),
      ('Steve Fernandes', 4, 75000),
      ('Swati Jha', 5, 125000),
      ('Jahnavi T', 3, 85000),
      ('Riti Rathore', 2, 45000),
      ('Sachin Kumar', 3, 55000);

-- Adjust the salary of employees based on their performance

UPDATE employees
    INNER JOIN 
        merits ON employees.per = merits.performance
SET
    salary = salary + salary * percentage;


-- MySQL DELETE JOIN with INNER JOIN
DROP TABLE IF EXISTS t1, t2;

CREATE TABLE t1 (
    id INT PRIMARY KEY AUTO_INCREMENT
);

CREATE TABLE t2 (
    id VARCHAR(20) PRIMARY KEY,
    ref INT NOT NULL
);

INSERT INTO t1 VALUES (1),(2),(3);

INSERT INTO t2(id,ref) VALUES('A',1),('B',2),('C',3);


-- MySQL ON DELETE CASCADE
-- ON DELETE CASCADE referential action for a foreign key to delete data from multiple related tables

CREATE TABLE buildings (
    building_no INT PRIMARY KEY AUTO_INCREMENT,
    building_name VARCHAR(255) NOT NULL,
    address VARCHAR(255) NOT NULL
);

CREATE TABLE rooms (
    room_no INT PRIMARY KEY AUTO_INCREMENT,
    room_name VARCHAR(255) NOT NULL,
    building_no INT NOT NULL,
    FOREIGN KEY (building_no)
        REFERENCES buildings (building_no)
        ON DELETE CASCADE
);

INSERT INTO buildings(building_name,address)
VALUES('ACME Headquaters','3950 North 1st Street CA 95134'),
      ('ACME Sales','5000 North 1st Street CA 95134');

INSERT INTO rooms(room_name,building_no)
VALUES('Amazon',1),
      ('War Room',1),
      ('Office of CEO',1),
      ('Marketing',2),
      ('Showroom',2);









-- MySQL REPLACE statement

REPLACE [INTO] table_name(column_list)
VALUES(value_list);

-- The MySQL REPLACE statement is an extension to the SQL Standard. The MySQL REPLACE statement works as follows:

-- Step 1. Insert a new row into the table, if a duplicate key error occurs.

-- Step 2. If the insertion fails due to a duplicate-key error occurs:

-- Delete the conflicting row that causes the duplicate key error from the table.
-- Insert the new row into the table again.
-- To determine whether the new row that already exists in the table, MySQL uses PRIMARY KEY or UNIQUE KEY index. If the table does not have one of these indexes, the REPLACE works like an  INSERT statement.

-- To use the REPLACE statement, you need to have at least both INSERT and DELETE privileges for the table.


CREATE TABLE cities (
    id INT AUTO_INCREMENT PRIMARY KEY,
    name VARCHAR(50),
    population INT NOT NULL
);


INSERT INTO cities(name,population)
VALUES('New York',8008278),
	  ('Los Angeles',3694825),
	  ('San Diego',1223405);



-- MySQL prepared statement

-- MySQL prepared statement to make your queries execute faster and more secure.

/* Prior MySQL version 4.1, a query is sent to the MySQL server in the textual format. 

In turn, MySQL returns the data to the client using textual protocol. 

MySQL has to fully parse the query and transforms 
the result set into a string before returning it to the client.

The textual protocol has serious performance implication. 
To address this issue, MySQL added a new feature called prepared statement since version 4.1.

The prepared statement takes advantage of client/server binary protocol. 
It passes the query that contains placeholders (?) to the MySQL Server
*/


SELECT * 
FROM products 
WHERE productCode = ?;

-- When MySQL executes this query with different productcode values, it does not have to fully parse the query. As a result, this helps MySQL execute the query faster, especially when MySQL executes the same query multiple times.

-- Since the prepared statement uses placeholders (?), this helps avoid many variants of SQL injection hence make your application more secure.

-- MySQL prepared statement usage
-- In order to use MySQL prepared statement, you use three following statements:

-- PREPARE             –    prepare a statement for execution.
-- EXECUTE             –    execute a prepared statement prepared by the PREPARE statement.
-- DEALLOCATE PREPARE  –    release a prepared statement.

--Execution flow:

    PREPARE -> EXECUTE -> DEALLOCATE PREPARE







