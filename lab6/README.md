**Lab 6**

In this exercise you are required to write a set of classes to store details about athletics races and the athletes that take part.

You are required to write code for a class called Race and an inner class called Athlete. To test your program you will need to write the code for a class called TestRace.

The requirements for each of the classes you need to create are documented below.

After you create the bare structure for the Race class, it would be a good idea to write the inner class first.

**Race class (Outer Class)**

- The class has 3 member variables:
  - distance (int)
  - competition e.g. Olympics (String)
  - a list of athletes (ArrayList)
- Create a suitable constructor to initialise the 1st two member variables using a parameter list.
- Create a method addRunners()  that takes the athlete details from a text file using either Scanner or FileReader &amp; BufferedReader. Here is some sample data:

Usain Bolt

Jamaica

9.2

9.3

9.4

Maurice Greene

USA

10.2

10.3

10.4

Warren Gatland

USA

9.5

9.6

9.4

- In this method you will use the data read in from the file to create Athlete objects and add them to the array list.
- Create a method called calculateFavourite()  that returns a string containing the name, country and average race time for the athlete who is favourite to win the race. The athlete with the lowest average race time is the favourite. The average race time is calculated in a method in the inner class.
- Create a toString() method to display appropriate details for the class along with the average race time as shown in the sample output. Note that the time is formatted to one decimal place.

**Athlete class (Inner Class)**

- The Athlete class has three member variables:
  - name (String)
  - country (String)
  - times (array of type double which holds the 3 best times the athlete has ran)
- Create a suitable constructor to initialise all 3 member variables using the parameter list.
- Create a method called calcAverage() that calculates and returns the average race time (double) for the athlete.
- Create a toString() method to display appropriate details for the class.

**Test Class**

- Create and initialise just one Race object reference as follows:
- Race r = new Race(100, &quot;Olympics 2017&quot;);
- Call the addRunners() method
- Call on the methods toString() and calcFavourite() to display the output as shown below.

**Sample Output:**

Race: Olympics 2017    Distance: 100m

Athlete Name: Usain Bolt

Country: Jamaica

Time 1: 9.2  Time 2: 9.3  Time 3: 9.4

Average race Time:9.30

Athlete Name: Maurice Greene

Country: USA

Time 1: 10.2  Time 2: 10.3  Time 3: 10.4

Average race Time:10.30

Athlete Name: Warren Gatland

Country: USA

Time 1: 9.5  Time 2: 9.6  Time 3: 9.4

Average race Time:9.50

The favourite for race is: Usain Bolt  from Jamaica  Average Time: 9.30