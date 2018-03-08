
# -- !Ups
INSERT INTO address VALUES (0, '1 Clarinda Avenue West', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AC10', 'Ireland');
INSERT INTO address VALUES (1, '14 Tivoli Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D1853FT', 'Ireland');
INSERT INTO address VALUES (2, '17 Marine Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AA11', 'Ireland');

INSERT INTO department VALUES (0, 'Accounting');
INSERT INTO department VALUES (1, 'Production');

INSERT INTO user (ID, FIRST_NAME, LAST_NAME, password, EMAIL, PHONE, role) VALUES (3, 'Smurdo', 'Kemurdo', 'sealteammick', 'admin@company.com', '0871231422', 'admin');
INSERT INTO user (ID, FIRST_NAME, LAST_NAME, password, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID, role) VALUES ('0', 'Konrad', 'Gladysz', 'ranger', 'konrad@konrad.ie', '0871233567', 0, 1, 'employee');
INSERT INTO user (ID, FIRST_NAME, LAST_NAME, password, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID, role) VALUES ('1', 'Susan', 'Moore', 'rager', 'susan.moore@gmail.com','0879876543', 1, 0, 'employee');
INSERT INTO user (ID, FIRST_NAME, LAST_NAME, password, EMAIL, PHONE, ADDRESS_ID, DEPARTMENT_ID, role ) VALUES ('2', 'Andrew', 'Byrne', 'murod', 'andrew19212@hotmail.com' ,'0859128425', 2, 0, 'employee');

INSERT INTO project (id, name, start, end) VALUES (0, 'Company Books for 17/18', PARSEDATETIME('01-01-18 00:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('31-12-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO project (id, name, start, end) VALUES (1, 'Financial Report Q1', PARSEDATETIME('01-01-18 00:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('31-03-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO project (id, name, start, end) VALUES (2, 'Website remodeling', PARSEDATETIME('05-01-18 08:00:00','dd-MM-yy hh:mm:ss'), PARSEDATETIME('30-06-18 11:59:59','dd-MM-yy hh:mm:ss'));

INSERT INTO project_user VALUES (0, 2);
INSERT INTO project_user VALUES (1, 0);
INSERT INTO project_user VALUES (1, 1);
INSERT INTO project_user VALUES (2, 1);

INSERT INTO USER VALUES ('gladysz.konrad@gmail.com', 'admin', 'Konrad', 'password');

# -- !Downs

TRUNCATE TABLE ADDRESS;
TRUNCATE TABLE DEPARTMENT;
TRUNCATE TABLE EMPLOYEE;
TRUNCATE TABLE PROJECT;
TRUNCATE TABLE EMPLOYEE_PROJECT;
