# CA1 (26%)

## Software Development 4

### Hand Out Date: 11am, Monday, 5th  February 2018

### Hand In Date: 9am, Monday, 5 March 2018

- **Requirements**
  - One upload to Git is required per team
  - Each team will demo their system during the labs on
      - Monday 5th March
      - Tuesday 6th March
      - Friday 9th March

### Preamble

This assignment must be completed in teams of two people.

Please register your team on the CA1 forum page on Moodle.

### Implementation

You are required to develop a website using the Java Play Framework. This website should incorporate both client and server side functionality for the management of employees in a company, the projects they work on and the department they work in.

The following are the minimum set of mappings required in the system:

- Employee – Address (One To One mapping)
- Employee – Project (Many To Many mapping)
- Employee – Department (One To Many mapping)

The system should also cater for different types of users where at least one of the user types should be able to log in and access parts of the website not accessible by other users. For example, a manager can update the projects that an employee works on but the employee can only view their projects – no update/deletes allowed. This is just one example of different levels of access, you must decide on the different user types that your system will cater for.

### Grading

- **20%**
  - Web site structure &amp; design
- **80%**
  - Log In with different user types
  - Allow for upload of an image (could be an employee image)
  - Use of forms for performing add/update
  - Use of tables for display of data
  - Dynamic generation of links
  - Dynamic generation of content
  - Mappings working correctly in terms of add/update/delete
  - Incorporation of application logic
