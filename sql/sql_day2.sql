create database Employee;
use Employee;
create table project(
project_id int not null,
project_name varchar(100)
);
ALTER TABLE project
ADD PRIMARY KEY (project_id);

CREATE TABLE department (
    d_id int NOT NULL,
    d_name varchar(100)
);
ALTER TABLE department
ADD PRIMARY KEY (d_id);

CREATE TABLE employee (
    emp_no int NOT NULL primary key,
    emp_name varchar(100),designation varchar(100),salary bigint,doj date, dob date, age int,d_id int,
	foreign key(d_id) references department(d_id)
);
desc employee;
select * from employee;actor
alter table employee drop column age;
alter table employee add column d_name varchar(100) after d_id;
select * from employee;

insert into project values (1,'Retail'),(2,'Insurance'),(3,'Resources'),(4,'Banking');
select * from project;
insert into department values(1001,'LKM'),(1002,'JavaCap'),(1003,'.NetCap');
insert into employee values (7001,'Cynthya','CEO',800000.00,'1975-05-12','1997-02-14',1001,NULL);