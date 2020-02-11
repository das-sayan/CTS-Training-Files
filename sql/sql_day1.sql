create database food;
use food;
CREATE TABLE customer (
    cust_ID int(3) not null,
    Name varchar(255),
    Address varchar(255),
    Email varchar(30)
);
desc customer;
ALTER TABLE customer
ADD mobile bigint(10);
ALTER TABLE customer
ADD column lname varchar(255) AFTER Name;
ALTER TABLE customer
drop column lname;

ALTER TABLE customer
change Name FullName varchar(255);

insert into customer(cust_ID,FullName,Address,Email,mobile) values(100,'Sayan Das','Kolkata','abc@abc.com',9876543210);

ALTER TABLE customer
MODIFY COLUMN FullName varchar(50);

select * from customer;
insert into customer(cust_ID,FullName,Address,Email,mobile) values(101,'Suman Das','Kharagpur','abcd@abcd.com',7776543210);
insert into customer(cust_ID,FullName,Address,Email,mobile) values(103,'Kushal Roy','Howrah','test@gmail.com',7776984210);
DELETE FROM customer WHERE Email="test@gmail.com";

SET SQL_SAFE_UPDATES = 0;
DELETE FROM customer WHERE Email="test@gmail.com";
select * from customer;
insert into customer(cust_ID,FullName,Address,Email,mobile) values(102,'Kushal Roy','Howrah','test@gmail.com',7776984210);

insert into customer(cust_ID,FullName,Address,Email,mobile) values(103,'Aritra Dey','Howrah','aritra@gmail.com',7790984210);
insert into customer(cust_ID,FullName,Address,Email,mobile) values(104,'Aritra Roy','Delhi','roy@gmail.com',8890984210);

CREATE TABLE products (
    p_id int not null,
    pname varchar(255),
    pqty int,
    pprice int
);


insert into products(p_id,pname,pqty,pprice) 
values(10,'Screws',100,20);
select * from products;
insert into products(p_id,pname,pqty,pprice) 
values(12,'Pins',100,20);
insert into products(p_id,pname,pqty,pprice) 
values(13,'Belts',50,30);


insert into products values(14,'Shirts',250,400),(15,'Jeans',250,450),(16,'Blazzers',150,800);

insert into customer values(105,'Aritra Roy','Delhi','test1@gmail.com',8890983310),
(106,'Sourav Mallick','Kolkata','mallick@gmail.com',8890984211),
(107,'Ms Dhoni','Jharkhand','ms@gmail.com',8220984210);

select mobile,FullName from customer where Address="Kolkata"

delete from customer where cust_ID=106

update customer set Email="sayan@gmail.com" where cust_ID=100
drop table customer;
CREATE TABLE customer (
    cust_id int(3) not null,
    name varchar(255),
    address varchar(255),
    email varchar(30),
    age int
);
insert into customer values(1,'Aritra Roy','Uttar Pradesh','test1@gmail.com',8890983310,19),
(2,'Sourav Mallick','Kolkata','mallick@gmail.com',8890984211,22),
(3,'Ms Dhoni','Jharkhand','ms@gmail.com',8220984210,19),
(4,'Sayan Das','Kharagpur','sayan@gmail.com',7001984210,22),
(5,'Subhasis','Kolkata','subhasis@gmail.com',8220988888,44),
(6,'Koustav','Kolkata','koustav@gmail.com',8657842109,32),
(7,'Suman Ghosh','Kharagpur','ghosh@gmail.com',8990984210,22),
(8,'Peter Parkar','Kharagpur','peter@gmail.com',8220111210,47),
(9,'Sneha Das','kolkata','sneha@gmail.com',8220986666,27),
(10,'Kartik Aryan','Uttar Pradesh','kartik@gmail.com',8220004210,32),
(11,'Rahul Roy','Jharkhand','rahul@gmail.com',8220984210,50),
(12,'Vivek','Uttar Pradesh','vivek@gmail.com',8224444210,27);
alter table customer add column mobile bigint after email;


select* from customer;
select * from customer where address ="Kolkata" and cust_id<6;
select * from customer where address ="Kolkata" or address="Kharagpur";
select distinct address from customer;
use 
select * from customer where address="Kharagpur" order by name ;
select name,address from customer where cust_id<6 order by name desc;
select address, count(*) from customer group by address; 
select * from customer where age>20 order by name;
select count(address) as "total address" from customer 

select name,min(age) as "Smallest Age" from customer;
insert into customer values
(13,'Vivek','Uttar Pradesh','vivek1@gmail.com',9724444210,28);
select max(age) as "Largest Age" from customer group by name;

select name,sum(age) as "sum Age" from customer where name="Vivek";
select name,age from customer where age in (select max(age) from customer);
select  name ,sum(age) as "Total Age" from customer group by name having sum(age) <20;
select* from customer

select name,address from customer where address like '%pr%'
select name,address from customer where address like '___kat_'
select name,address from customer where address not like '%pr%'
select * from customer  where name not  in ('sayan das','vivek','sourav mallick');

select * from customer;

update customer set doj = '2019-08-25' where cust_id=2