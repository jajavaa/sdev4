
# -- !Ups
INSERT INTO address VALUES (0, '1 Clarinda Avenue West', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AC10', 'Ireland');
INSERT INTO address VALUES (1, '14 Tivoli Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D1853FT', 'Ireland');
INSERT INTO address VALUES (2, '17 Marine Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AA11', 'Ireland');

INSERT INTO department VALUES (0, 'Accounting');
INSERT INTO department VALUES (1, 'Production');

INSERT INTO employee (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID) VALUES (0, 'Konrad', 'Gladysz', 'konrad@konrad.ie', '0871233567', 0, 1);
INSERT INTO employee (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID) VALUES (1, 'Susan', 'Moore', 'susan.moore@gmail.com','0879876543', 1, 0);
INSERT INTO employee (ID, FIRST_NAME, LAST_NAME, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID) VALUES (2, 'Andrew', 'Byrne', 'andrew19212@hotmail.com' ,'0859128425', 2, 0);

INSERT INTO project (id, name, start, end) VALUES (0, 'Company Books for 17/18', PARSEDATETIME('01-01-18 00:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('31-12-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO project (id, name, start, end) VALUES (1, 'Finantial Report Q1', PARSEDATETIME('01-01-18 00:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('31-03-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO project (id, name, start, end) VALUES (2, 'Website remodeling', PARSEDATETIME('05-01-18 08:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('30-06-18 11:59:59','dd-MM-yy hh:mm:ss'));

INSERT INTO employee_project VALUES (0, 2);
INSERT INTO employee_project VALUES (1, 0);
INSERT INTO employee_project VALUES (1, 1);
INSERT INTO employee_project VALUES (2, 1);

INSERT INTO USER VALUES ('gladysz.konrad@gmail.com', 'admin', 'Konrad', 'password');

# -- !Downs

TRUNCATE TABLE ADDRESS;
TRUNCATE TABLE DEPARTMENT;
TRUNCATE TABLE EMPLOYEE;
TRUNCATE TABLE PROJECT;
TRUNCATE TABLE EMPLOYEE_PROJECT;
