**Lab 5**

Download lab5Skeleton.zip from Moodle, extract and open in NetBeans.

**Exercise 1 – This is based on the files in the package called exercise1Skeleton**

Create a folder called files and a text file called contacts.txt with the following data:

Pat

m

0876876543

John

m

0862345678

Paul

m

0839876543

Kate

f

0987654321

Mary

f

08756676778

George

m

0879878765

Kyle

m

0839800543

You need to change the code in the fillList() method in the AddressBook class to read in the data from the file instead of the keyboard. Write exception handling code inside this method. The file contains 7 contacts and your code should use the Scanner class to read in all the contacts.

**Sample Output**

Enter the owner of address book

John

Address Book belongs to:John

Pat,m,0876876543

John,m,0862345678

Paul,m,0839876543

Kate,f,0987654321

Mary,f,08756676778

George,m,0879878765

Kyle,m,0839800543

Number of male friends are:5

Total Contacts:7

**Exercise 2 -**  **This is based on the files in the package called exercise2Skeleton**

Download the file ex2.zip from Moodle. Extract and copy these files into a new package in NetBeans.

Note the code to create the objects has been removed from the test class as you are now going to create the objects using data read in from various text files. The data for all the text files is given below.

You are required to write 3 private static methods in the test class (outside the main method) to do the following:

Method1

The method accepts the materials arraylist as a parameter. Inside this method you need to use the Scanner class to read the data from the file paint.txt and use this data to create Paint objects and add them to the arraylist. Create a text file with the following data. Write exception handling code inside this method.

Dulux Soft Sheen

11.52

2

12

Crown White

10

3

10

Dulux Matt Emulsion

15.70

3

11

ColorTrend Always Neutral

23.99

2

9

Method 2

The method accepts the materials arraylist as a parameter. Inside this method you need to use the Scanner class to read the data from the file wallpaper.txt and use this data to create Wallpaper objects and add them to the arraylist. Create a text file with the following data. Write exception handling code inside this method.

Shand Kydd

50

10.06

0.52

Graham &amp; Brown

19.99

9.5

.52

Super Fresco

24.99

12.5

.52



Method 3

The method accepts the materials arraylist as a parameter. Inside this method you need to use the Scanner class to read the data from the file flooring.txt and use this data to create Flooring objects and add them to the arraylist. Create a text file with the following data. Write exception handling code inside this method.

Quick-Step Planked Oak

65

1.65

French Oak Renoir

90

1.8

Express Clic

40

1.4

Reflections

50

1.3

You then need to call these three methods inside the main method (after line 12)



**Sample Output**

Name: Dulux Soft Sheen, Requirement: 17.33 units, Price €199.62

Name: Crown White, Requirement: 31.19 units, Price €311.9

Name: Dulux Matt Emulsion, Requirement: 28.35 units, Price €445.17

Name: ColorTrend Always Neutral, Requirement: 23.1 units, Price €554.26

Name: Shand Kydd, Requirement: 19.87 units, Price €993.73

Name: Graham &amp; Brown, Requirement: 21.05 units, Price €420.71

Name: Super Fresco, Requirement: 16 units, Price €399.72

Name: Quick-Step Planked Oak, Requirement: 19.69 units, Price €1,279.91

Name: French Oak Renoir, Requirement: 18.05 units, Price €1,624.5

Name: Express Clic, Requirement: 23.21 units, Price €928.29

Name: Reflections, Requirement: 24.99 units, Price €1,249.62