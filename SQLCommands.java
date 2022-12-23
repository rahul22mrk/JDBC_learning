/*

create table customer(
custid varchar(255),
firstname varchar(255),
lastname varchar(255),
aadhar varchar(255),
passport varchar(255),
address varchar(255),
dob varchar(255),
gender varchar(255),
contact varchar(255)



);
ALTER TABLE student
ADD PRIMARY KEY (rollno);
select * from customer;
drop table customer;
create database school;
use school;
describe database student;
drop database student;
show databases;
use airline;

create table flight(
	flightid varchar(255),
    src varchar(255),
    destination varchar(255),
    deptdate varchar(255),
    departure varchar(255),
    arrival varchar(255),
    price varchar(255)
);
select * from flight;
drop table flight;

create table user(
	firstname varchar(255),
    lastname varchar(255),
    username varchar(255),
    password varchar(255)
  
);
use school;
select * from student;
delete * from student where rollno=16;
select * from user;


create table employee(
eno int primary key,
ename varchar(50),
sal int,
desg varchar(50),
pcode varchar(50)
	);
    
    create table project(
pcode varchar(50) primary key,
ptitle varchar(50),
cname varchar(50)
	);
    drop table project;
  insert into employee values(1,"A",50000,"SE","P1");
  insert into employee values(2,"B",60000,"ST","P2");
  insert into employee values(3,"C",40000,"TL","P3");
  insert into employee values(4,"D",70000,"PM","P1");
  insert into employee values(5,"E",80000,"SE","P2");
  
  insert into project values("P1","AscW","HDFC");
    insert into project values("P2","BankSc","SBI");  
    insert into project values("P3","Frsl","Intel");
  
  select * from project;
  select * from employee;
  
  select ename,ptitle from employee,project where employee.pcode=project.pcode;
  
  








*/
