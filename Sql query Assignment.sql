select * from Student;
select * from teacher;
--1 no of students in each elective subject
select elective_subject, count(roll_no) from Student group by elective_subject;
-- 2 name of teacher and elective which is not choosen by any student
select concat(firstname,' ',lastname) from teacher where subject not in(select distinct(subject) from student);
-- 3 Arrange the students in order of age and then dob;
select * from student order by age,dob;
--4 Write a query to display eldest student from each age group in asc order
select concat(firstname,' ',lastname)as Name ,age from Student where dob in (select max(dob)  from Student group by age) order by age asc;
--5 Name the students with atlest 5 letter in their firstname
select firstname from Student where firstname like '_____%';
--6 Find the who has same lastname as Shanu
select firstname from Student where lastname=(select lastname from student where firstname='Shanu');
--7 List the students first name along with last name who have same teacher as elective_subject teacher;
select concat(Student.firstname,' ',Student.lastname) as Name  from Student inner join teacher on Student.teachers_id=teacher.teachers_id and Student.elective_subject=teacher.subject;
--8 update the salary of teacher whose teachers_id is 'A103' as 110000;
update teacher set salary=110000 where teachers_id='A103';
--9 Insert a new student id=111,Firstname= Harshit, lastname= choudhary, dob= 1999-05-25,age=23,address= Ward no 13, Keshripura sanwer,Indore, Teacher_id=A104, elective Artificial Intelligence;
Insert into Student values(111,'Harshit','Choudhary','1999-05-25',23,'Ward no 13, Keshripura sanwer,Indore','A104','Artificial Intelligence');
--10 Delete the data of student having id =111;
delete from Student where roll_no=111;

--window function eg
--list teachers_id, firstname, lastname,salary and max salary from teachers table;
select teachers_id,firstname,lastname,salary,max(salary) over() max_salary from teacher;

