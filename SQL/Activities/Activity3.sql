REM   Script: Activity3
REM   FST Training Activity 3

INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int  
) 
 
INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int  
) 
 
INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int, 
) 
 
INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int, 
);

INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int 
);

INSERT INTO salesman 
VALUES (5001,'James Hoog','New York',15) ;

CREATE TABLE salesman(  
salesman_id int,  
salesman_name varchar(20),  
salesman_city varchar(20),  
comission int 
);

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
 
SELECT * FROM salesman;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
 
SELECT * FROM salesman;

INSERT ALL 
    INTO salesman VALUES(5005, 'Pit Alex', 'London', 11) 
    INTO salesman VALUES(5006, 'McLyon', 'Paris', 14) 
    INTO salesman VALUES(5007, 'Paul Adam', 'Rome', 13) 
    INTO salesman VALUES(5003, 'Lauson Hen', 'San Jose', 12) 
 
SELECT * FROM salesman;

SELECT * FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT salesman_id, salesman_city FROM salesman;

SELECT * FROM salesman WHERE salesman_city='Paris';

SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

