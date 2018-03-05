INSERT INTO Address (id, lineOne, lineTwo, city, county, zip, country) VALUES ('konrad@konrad.ie', '1 Clarinda Avenue West', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AC10', 'Ireland');
INSERT INTO Address (id, lineOne, lineTwo, city, county, zip, country) VALUES ('susan.moore@gmail.com', '14 Tivoli Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D1853FT', 'Ireland');
INSERT INTO Address (id, lineOne, lineTwo, city, county, zip, country) VALUES ('andrew19212@hotmail.com', '17 Marine Road', 'Dun Laoghaire', 'Dublin', 'Co. Dublin', 'D18AA11', 'Ireland');

INSERT INTO Departments (id, title) VALUES (1, 'Accounting');
INSERT INTO Departments (id, title) VALUES (2, 'Production');

INSERT INTO Employees (email, firstName, lastName, salary, dob, phone, department) VALUES ('konrad@konrad.ie', 'Konrad', 'Gladysz', '38000', '1996/10/05', '0871233567', 2);
INSERT INTO Employees (email, firstName, lastName, salary, dob, phone, department) VALUES ('susan.moore@gmail.com', 'Susan', 'Moore', '70000', '1982/08/1','0879876543', 1);
INSERT INTO Employees (email, firstName, lastName, salary, dob, phone, department) VALUES ('andrew19212@hotmail.com', 'Andrew', 'Byrne', '50000', '1991/05/29', '0859128425', 1);

INSERT INTO Projects (id, title, ended) VALUES (1, 'Company Books for 17/18', PARSEDATETIME('31-12-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO Projects (id, title, ended) VALUES (2, 'Finantial Report Q1', PARSEDATETIME('31-03-18 11:59:59','dd-MM-yy hh:mm:ss'));
INSERT INTO Projects (id, title, ended) VALUES (3, 'Website remodeling', PARSEDATETIME('30-06-18 11:59:59','dd-MM-yy hh:mm:ss'))

INSERT INTO EmployeeProjects VALUES ('konrad@konrad.ie', 3);
INSERT INTO EmployeeProjects VALUES ('susan.moore@gmail.com', 1);
INSERT INTO EmployeeProjects VALUES ('susan.moore@gmail.com', 2);
INSERT INTO EmployeeProjects VALUES ('andrew19212@hotmail.com', 2);