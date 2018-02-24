**Software Development 4**

**Lab 2 – Revision Inner Classes**

In this exercise you are required to write a set of classes to stSore passenger details about a flight.

Read this document through in full before you start coding the solution in Java.

The Flight class contains an inner class called Passenger. The requirements for each of the classes you need to create are documented below.

**Passenger class (Inner Class)**

The Passenger class has 4 members: name (String), age (int), weight of bags (double array), size of bags (char array)

Create a suitable constructor to initialise all 4 members using a parameter list.

Create a calcBaggageCharge() method which calculates the charges for a passenger&#39;s combined set of luggage using the information provided below:

There are two sizes of Bag – medium which has a weight of 15kg and large which has a weight of 20kg.

The charge for a medium bag is €30.

The charge for a large bag is €40.

Any overweight luggage for a passenger is charged at the additional rate of €10 for every 1kg over.

These 5 values should be defined in an interface.

**Flight class (Outer Class)**

The Flight class has 3 member variables:

- capacity (int) and duration (double) of the flight
- a list of passengers (ArrayList)

Create a suitable constructor to:

- initialise the capacity and duration using a parameter list
- initialise the array list

Create a void method fillList() that takes a reference variable of type Passenger as a parameter and adds it to the list.

Create a void print() method that prints the name, age and baggage charge for each passenger.

Create a method checkAvailability() that calculates and returns the number of seats (int) still available on the flight.

Create a method calcOldestPassenger() that calculates and returns the name and age of the oldest person on the flight as a string – see sample output.

**Test Class**

There is no keyboard entry required in the test class.

There are no loops required.

Create a Flight object with a capacity of 200 and a duration of 3.5 hours.

Create each Passenger object and add it to the arraylist using a separate block of code for each one. Use the data provided below to create the passenger objects.

The passenger details are given below. For Bag Size shown in the table below, m represents Medium and l represents Large

| Passenger Name | Passenger Age | Bag 1 Weight | Bag 2 Weight | Bag 3 Weight | Bag 1 Size | Bag 2 Size | Bag 3 Size |
| --- | --- | --- | --- | --- | --- | --- | --- |
| John | 52 | 12 | 16 | 22 | m | m | l |
| Ken | 26 | 12 | 13 |   | m | m |   |
| Kate | 89 | 22 | 23 | 24 | l | l | l |
| Peter | 40 | 16 | 18 | 23 | m | m | l |

Call the relevant methods to display the details as shown in the sample output below:

**Sample Output**

Passenger List for Flight

John 52 Baggage Charge:€100.00

Ken 26 Baggage Charge:€60.00

Kate 89 Baggage Charge:€210.00

Peter 40 Baggage Charge:€170.00

Number seats available:196

Oldest Person on the flight is:Kate age:89