REM   Script: Activity5
REM   FST Training Activity 5

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

ALTER TABLE salesman ADD grade int;

UPDATE salesman SET grade=100;

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman;

UPDATE salesman SET grade=200 WHERE salesman_city='Rome';

UPDATE salesman SET grade=300 WHERE salesman_name='James Hoog';

UPDATE salesman SET salesman_name='Pierre' WHERE salesman_name='McLyon';

SELECT * FROM salesman where salesman_name='James Hoog';
