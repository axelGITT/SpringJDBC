create table person
(
id integer not null,
name varchar(255) not null,
location varchar(255) not null,
birth_date varchar(255) not null,
primary key(id)
);

INSERT INTO PERSON (
ID,NAME,LOCATION,BIRTH_DATE
)VALUES(10001,'John','New York','28-01-1995');
INSERT INTO PERSON (
ID,NAME,LOCATION,BIRTH_DATE
)VALUES(10002,'Peter','Warszawa','28-01-1985');
INSERT INTO PERSON (
ID,NAME,LOCATION,BIRTH_DATE
)VALUES(10003,'Greg','Amsterdam','28-01-2000');
INSERT INTO PERSON (
ID,NAME,LOCATION,BIRTH_DATE
)VALUES(10004,'Tony','Amsterdam','28-01-2000');