create database StudentInfo;

use StudentInfo;

CREATE TABLE Student (
    RollNo INT AUTO_INCREMENT PRIMARY KEY,
    Name VARCHAR(50),
    MobNo BIGINT NOT NULL,
    Email VARCHAR(50) UNIQUE,
    Address VARCHAR(100),
    College VARCHAR(50),
    Placement_Status VARCHAR(10) DEFAULT 'Not Placed',
    Fess INT,
    Department VARCHAR(10),
    DOB DATE,
    Batch VARCHAR(10),
    Admission_Date DATE,
    JavaMarks INT,
    AptiMarks INT,
    SpokenMarks INT,
    Total_Marks INT,
    Gender VARCHAR(10)
);

INSERT INTO Student (Name, MobNo, Email, Address, College, Placement_Status, Fess, Department, DOB, Batch, Admission_Date, JavaMarks, AptiMarks, SpokenMarks, Total_Marks, Gender)
VALUES 
    ('Amit Sharma', 9876543210, 'amit.sharma@email.com', 'Pune, Maharashtra', 'MIT Pune', 'Placed', 25000, 'CS', '2001-05-15', '2022', '2020-08-10', 85, 78, 80, 243, 'Male'),
    ('Neha Verma', 9123456789, 'neha.verma@email.com', 'Mumbai, Maharashtra', 'IIT Bombay', 'Not Placed', 30000, 'IT', '2000-12-22', '2024', '2019-07-15', 90, 85, 88, 263, 'Female'),
    ('Rahul Patil', 9988776655, 'rahul.patil@email.com', 'Nagpur, Maharashtra', 'VNIT Nagpur', 'Placed', 27000, 'CS', '2001-08-10', '2023', '2020-07-12', 78, 80, 75, 233, 'Male'),
    ('Priya Deshmukh', 9876541230, 'priya.deshmukh@email.com', 'Nashik, Maharashtra', 'COEP Pune', 'Not Placed', 26000, 'IT', '2002-01-15', '2023', '2021-06-20', 88, 82, 79, 249, 'Female'),
    ('Suresh Kulkarni', 7766554433, 'suresh.kulkarni@email.com', 'Pune, Maharashtra', 'MIT Pune', 'Placed', 25000, 'CS', '2001-05-22', '2022', '2020-08-15', 90, 89, 85, 264, 'Male'),
    ('Anjali Sharma', 8866442299, 'anjali.sharma@email.com', 'Mumbai, Maharashtra', 'IIT Bombay', 'Not Placed', 32000, 'IT', '2001-09-30', '2024', '2019-07-30', 83, 80, 82, 245, 'Female'),
    ('Ravi Gupta', 9001122334, 'ravi.gupta@email.com', 'Bangalore, Karnataka', 'IISc Bangalore', 'Placed', 28000, 'CS', '2000-11-05', '2021', '2018-06-15', 92, 90, 88, 270, 'Male'),
    ('Sneha Joshi', 7889900112, 'sneha.joshi@email.com', 'Hyderabad, Telangana', 'IIIT Hyderabad', 'Placed', 29000, 'CS', '2002-02-10', '2023', '2020-06-18', 85, 87, 90, 262, 'Female'),
    ('Vikram Choudhary', 9998887776, 'vikram.choudhary@email.com', 'Delhi', 'DTU Delhi', 'Not Placed', 31000, 'IT', '2001-04-25', '2023', '2020-07-10', 88, 81, 79, 248, 'Male'),
    ('Pooja Mehta', 7878665544, 'pooja.mehta@email.com', 'Jaipur, Rajasthan', 'MNIT Jaipur', 'Placed', 27000, 'CS', '2002-07-19', '2024', '2021-08-01', 86, 84, 83, 253, 'Female');


CREATE TABLE Student_Course (
    CourseID INT AUTO_INCREMENT PRIMARY KEY,
    RollNo INT,  -- Foreign key referencing Student table
    CourseName VARCHAR(50),
    Instructor VARCHAR(50),
    Credits INT,
    StartDate DATE,
    EndDate DATE,
    Grade VARCHAR(2),
    FOREIGN KEY (RollNo) REFERENCES Student(RollNo) ON DELETE CASCADE
);

INSERT INTO Student_Course (RollNo, CourseName, Instructor, Credits, StartDate, EndDate, Grade)
VALUES 
    (1, 'Java Programming', 'Dr. Rajesh Kumar', 4, '2022-01-10', '2022-05-15', 'A'),
    (2, 'Database Management', 'Prof. Neha Sharma', 3, '2023-02-01', '2023-06-30', 'B'),
    (3, 'Data Structures', 'Dr. Arun Mehta', 4, '2023-01-15', '2023-05-20', 'A'),
    (4, 'Machine Learning', 'Prof. Priya Singh', 3, '2023-02-10', '2023-06-25', 'A'),
    (5, 'Software Engineering', 'Dr. Suresh Gupta', 4, '2022-01-20', '2022-05-30', 'B'),
    (6, 'Computer Networks', 'Prof. Ramesh Iyer', 3, '2023-03-01', '2023-07-10', 'B'),
    (7, 'Cloud Computing', 'Dr. Anil Pandey', 4, '2021-02-15', '2021-06-20', 'A'),
    (8, 'Cyber Security', 'Prof. Sneha Rajput', 3, '2023-04-05', '2023-08-15', 'A'),
    (9, 'Artificial Intelligence', 'Dr. Ajay Verma', 4, '2023-03-20', '2023-07-25', 'B'),
    (10, 'Web Development', 'Prof. Megha Sharma', 3, '2022-05-10', '2022-09-15', 'A');



insert into student (MobNo,email,Address,College,Placement_Status,Fess,Department,DOB,Batch,Admission_Date,JavaMarks,AptiMarks,SpokenMarks)
values (8888394037,"pratik@gmail.com","Risod","MIT ADT College","Not Placed",35000,"CSE",'2001-11-15',"2024",'2023-12-01',90,98,95);

ALTER TABLE Student MODIFY MobNo BIGINT NOT NULL;

alter table Student rename column Deparment to Department;

select * from student;

ALTER TABLE Student ADD COLUMN Total_Marks int;

UPDATE Student SET Total_Marks = (JavaMarks + AptiMarks + SpokenMarks) where RollNo IN (1,2,3,4,5,6,7,8,9,10);

SELECT RollNo, Name, JavaMarks, AptiMarks, SpokenMarks, Total_Marks FROM Student WHERE RollNo IN (1,2,3,4,5,6,7,8,9,10);

SELECT * FROM Student WHERE RollNo IN (1,2,3,4,5,6,7,8,9,10);

select * from Student;

select distinct Name from Student;

select distinct batch from Student;

select RollNo,Name,Batch,Fess , (Fess/100)*15 as discount , (Fess - (Fess/100)*15) as finalAmount from Student;

select * from Student;

Select RollNo, Name ,Total_Marks from Student where Total_Marks between 200 and 300;

select * from student where JavaMarks like 50;

select * from student where email like '%sh%';
select * from student where Name like "A%";
select * from student where Name like "%ha%";

select * from student;

select * from student where email like "%email%";

select * from student where Address like "%pune%";

select * from student where Placement_Status = "Placed" order by Name asc;

select * from student where Deparment  = "cs" order by DOB asc;

select * from student order by  Name desc;

select * from student where MobNo like "^98";

select * from student;

select * from student limit 3;

select * from student limit 3,3;

select * from student limit 8,4;

select * from student order by  JavaMarks limit 1;

update student set Department  = "CS" where RollNo = 9;

select * from student;

update student set Fess = (Fess + 1000) where Javamarks <= 50;

update Student set Batch = '2024' where Batch  = '2021';

alter table Student add  Gender varchar(10); 

alter table Student add  TotalFeesPaid varchar(10); 

alter table student drop TotalFeesPaid;

select * from student;

update student set Java_marks = 95 where RollNo  = 1;


SELECT DISTINCT Department from student;

select count(distinct Placement_Status) from Student;


select count(*)from  Student where Fess >= 30000;


select * from Student where Fess > 25000;

select * from Student where Batch = "2023" AND AptiMarks <= 50;

select * from student where Placement_Status <> "Placed";
select * from student where Placement_Status = "Not Placed";

select * from student where JavaMarks >= 80 and Fess > 30000;
select * from student where JavaMarks >= 80 or Fess > 30000;

select Total_Marks from Student; ;
select Total_Marks from Student where Total_Marks between 200 and 250;
select * from Student where Total_Marks between 200 and 250;

select distinct AptiMarks from student;

SELECT  RollNo,Name, (JavaMarks + Aptmarks + SponMarks) AS Total_Marks 
FROM students;

select * from student where MobNo regexp '^98';
select MobNo from student where MobNo like '98%';

select email from student where email regexp "email\\.com$";

select MobNo from student;


UPDATE student SET Name = "John Week" WHERE RollNo = 31;

select * from student;

select * from student where email regexp "gmail\\.com$";

select * from student where email like "email.com";

delete from Student where RollNO = 32;

select Name as StudentName from student;


create table Student_Cource (CourceID int primary key auto_increment, RollNo int, Coursename varchar (20), 
Instructor varchar (20), Credits int ,StartDate date,EndData date ,Grade varchar(2),
 FOREIGN KEY (RollNo) references Student(RollNo) );

desc Student_Cource;
alter table Student_Cource  rename column EndData to EndDate;

insert into Student_Cource (RollNo,Coursename,Instructor,Credits,StartDate,EndDate,Grade) values 
(1, 'Data ', 'Dr. Sharma', 4, '2023-01-10', '2023-06-15', 'A'),
(2, 'Database ', 'Prof. Verma', 3, '2023-02-05', '2023-07-20', 'B+'),
(3, 'Operating ', 'Dr. Patel', 4, '2023-01-15', '2023-06-10', 'A-'),
(4, 'Machine ', 'Dr. Kulkarni', 3, '2023-03-01', '2023-08-10', 'B'),
(5, 'Computer ', 'Prof. Gupta', 3, '2023-02-20', '2023-07-15', 'A'),
(6, 'Web ', 'Dr. Singh', 3, '2023-01-10', '2023-06-10', 'A+'),
(7, 'Cyber ', 'Dr. Mehta', 3, '2023-03-05', '2023-08-20', 'B+'),
(8, 'Cloud ', 'Prof. Rao', 4, '2023-02-15', '2023-07-25', 'A-'),
(9, 'Artificial ', 'Dr. Nair', 4, '2023-04-10', '2023-09-20', 'A'),
(10, 'Software ', 'Prof. Yadav', 3, '2023-02-01', '2023-07-01', 'B+');

select * from Student_Cource;
select*from Student;

select*from Student_Cource where RollNo = 1;

desc Student_Cource;
desc student;

select * from Student join Student_Cource;

select * from Student right join Student_Cource on Student.RollNo = Student_Cource.CourceID;

select*from Student_Cource right join Student on Student_Cource.Coursename = Student.Department;

alter table Student_Cource add constraint fk_student foreign key (RollNo) references Student (RollNo) on delete cascade;

delete from Student where RollNo = 33;

select*from student;

delete from Student;

select*from Student_Cource;
truncate table Student_Cource;
desc Student_Cource;

truncate table Student;


INSERT INTO Student (Name, MobNo, Email, Address, College, Placement_Status, Fess,
 Department, DOB, Batch, Admission_Date, JavaMarks, AptiMarks, SpokenMarks, Total_Marks, Gender)
VALUES 
('Amit Sharma', 9876543210, 'amit.sharma@email.com', 'Pune, Maharashtra',
 'MIT Pune', 'Placed', 25000, 'CS', '2001-05-15', '2022', '2020-08-10', 85, 78, 80, 243, 'Male'),
('Neha Verma', 9123456789, 'neha.verma@email.com', 'Mumbai, Maharashtra',
 'IIT Bombay', 'Not Placed', 30000, 'IT', '2000-12-22', '2024', '2019-07-15', 90, 85, 88, 263, 'Female');

select*from Student_Course ;



select * from Student;

DESC Student;
DESC Student_Course;
select * from Student where JavaMarks >= (select JavaMarks from Student where Name = "Rahul Patil");


select * from Student as s
left join Student_Course as sc on s.RollNo = sc.RollNo;

select * from Student as s
 inner join Student_Course as sc
 on s.RollNo = sc.CourseID;
 
select * from  Student as s left join 
Student_Course as sc on s.Name = sc.CourseName;
  
 select * from Student_Course;
 
 delete from Student_Course where CourseID between 5 and 10;
 
 select distinct Name from Student where mod(RollNo , 2) != 0;  -- distinct name of students with odd number
 
 use StudentInfo;
 
SELECT Student.Name, Student_Course.CourseID
FROM Student
FULL OUTER JOIN Student_Course ON Student.RollNo=Student_Course.CourseID
ORDER BY Student.Name;