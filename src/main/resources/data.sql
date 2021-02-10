CREATE TABLE person
(
    id integer not null,
    name varchar (255) not null,
    location varchar (255),
    birth_date timestamp,
    primary key (id)
);

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1001, 'Ranga', 'Hyderabad', PARSEDATETIME('02/01/2016', 'dd/MM/yyyy'));

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1002, 'James', 'New York', PARSEDATETIME('03/01/2016', 'dd/MM/yyyy'));

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1003, 'Piotr', 'Moscu', PARSEDATETIME('04/01/2016', 'dd/MM/yyyy'));

INSERT INTO PERSON (ID, NAME, LOCATION, BIRTH_DATE)
VALUES (1004, 'Jorge', 'Medellin', PARSEDATETIME('07/03/1985', 'dd/MM/yyyy'));