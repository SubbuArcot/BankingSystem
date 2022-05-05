# BankingSystem

## Project Description

Banking System undertaken as a project is based on relevant technologies. The main aim of this project is to develop software for banking system.
This project has been developed to carry out the processes easily and quickly, which is not possible with the manuals systems but which are overcome by Eclipse software(Maven project).This project is developed using JAVA and MYSQL language. Hence it gives the complete solution for the current banking system.


## Technologies Used

* Eclipse - version 2022-23
* MYSQL - version 8.0.28
* JDBC- version 8.0

## Features

In this project has lot of advantages like offline banking system. When you have use this application, really you are enjoying this concept.

* New users can be Create Account
* Able to Transfer Money from others. 
* Users can check Balance Enquiry.
* Get Transaction Statements.
* Counting the number of transcations.

To-do list:
* Request Debit Card/Cheque Book
* UPI Payments
* E-Passbook
## Getting Started
   
git clone:https://github.com/SubbuArcot/BankingSystem/edit

Eclipse or webdevelopers 
MYSQL 8.0.28.0/MYSQL workbench

Create project database in MYSQL
Create table  trans with the property given below
+-------------+-------------+------+-----+---------+-------+
| Field       | Type        | Null | Key | Default | Extra |
+-------------+-------------+------+-----+---------+-------+
| fromid      | varchar(20) | YES  |     | NULL    |       |
| toid        | varchar(20) | YES  |     | NULL    |       |
| transamount | double      | YES  |     | NULL    |       |
| date        | date        | YES  |     | NULL    |       |
+-------------+-------------+------+-----+---------+-------+
 Create table accountdetials (Account details) 
+-----------+-------------+------+-----+---------+----------------+
| Field     | Type        | Null | Key | Default | Extra          |
+-----------+-------------+------+-----+---------+----------------+
| id        | int         | NO   | PRI | NULL    | auto_increment |
| user_name | varchar(20) | YES  |     | NULL    |                |
| phone_no  | varchar(20) | YES  |     | NULL    |                |
| address   | varchar(50) | YES  |     | NULL    |                |
| balance   | double      | YES  |     | NULL    |                |
| aadhar_no | int         | YES  |     | NULL    |                |
+-----------+-------------+------+-----+---------+----------------+



## Usage

> We can ablr to add the values in both the entitles,count the number of transactions,deleting the account and transferring the amount from one acoount to another account by giving specific details of the users.



