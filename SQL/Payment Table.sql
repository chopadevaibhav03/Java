CREATE DATABASE PAYMENTINFO;
USE PAYMENTINFO;

CREATE TABLE PAYMENT (PAYMENTID INT PRIMARY KEY AUTO_INCREMENT,
					ORDERID INT NOT NULL, CUSTOMERID INT NOT NULL,
                    PAYMENT_DATE DATETIME NOT NULL,PAYMENT_MODE VARCHAR(10) NOT NULL DEFAULT 'CASH',
                    TRANSACTIONID VARCHAR(50) UNIQUE NOT NULL,AMOUNTPAID DECIMAL(10,2) NOT NULL,
                    CURRENCY VARCHAR(5) DEFAULT 'INR',PAYMENTSTATUS VARCHAR(10) DEFAULT 'UNPAID',
                    INVIOCENUMBER VARCHAR (50) UNIQUE NOT NULL);
                    
SELECT * FROM PAYMENT;               

ALTER TABLE PAYMENT CHANGE COLUMN INVIOCENUMBER INVOICENUMBER VARCHAR(50) UNIQUE NOT NULL;

alter table PAYMENT rename to Salary;

select * from Salary;

alter table Salary rename to Payment;

select * from Payment;

