 CREATE TABLE STUDENTS (  
  ID int NOT NULL AUTO_INCREMENT,
NAME VARCHAR (20) NOT NULL,  
MIDDLENAME VARCHAR (20) NOT NULL,  
LASTNAME VARCHAR (20) NOT NULL,  
BIRTHDAY date                         NOT NULL,  
GROUPNUMBER INT						NOT NULL,
  PRIMARY KEY (id)
);  
INSERT INTO my_db.students (name, MIDDLENAME,LASTNAME, BIRTHDAY, GROUPNUMBER)
VALUES
	('Misha', 'Bezdelnikov','Migelevich', '1996-07-17', 500),
	('Oleg', 'Ivanov','Huanovich', '1996-07-17', 700),
	('Nina', 'Sidorova','Petrovna', '1996-07-17', 850);
