create database LaptopInfo;

use LaptopInfo;

create table Laptop (SrNo int auto_increment primary key ,
LaptopId int  not null unique ,
Name varchar(20) not null,
Model varchar(50), 
Ram varchar(10),SSD int, 
GraphicsCard varchar(20),
Display varchar(20) default 'untouchable', 
CPU varchar(50), Processor varchar(20));
									
select * from Laptop;		

insert into Laptop values (2,1234,"MacAir 1","apple","16gb",256,"4gb","untouchable","4536U","M1 chipset");

insert into Laptop (LaptopId,Name,Model,Ram,SSD,GraphicsCard,CPU,Processor)
values (908765,"HP","paveloin","8gb",1000,"20gb","7798W","Snapdragon");


select * from Laptop;

select * from Laptop where SSD >= 400;
select * from Laptop where Name = "HP";
select * from Laptop where Display = "untouchable";
select * from Laptop where Graphicscard <> "2gb";

truncate Laptop;

select * from Laptop;
select * from Laptop where Ram >= "4gb" AND Ram <= "10gb" ;
