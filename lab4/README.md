**Lab 4**

Exception Handling

A system is required to manage rubbish collection by a refuse truck.  A refuse truck can carry rubbish up to a maximum number of bins. The user enters (keyboard input) the maximum number of bins a truck can carry and the cost per kilo of rubbish collection.  The user also enters the weight of each bin being collected.  The truck will continue collecting bins until the maximum number of bins the truck can carry is exceeded.

1. Your solution should have **two classes** (RefuseTruck and TestRefuseTruck).
2. RefuseTruck will require member **five variables** (maxBins, noOfBinsDeclined, noOfBinsCollected, ratePerKg and totalWeight;).
3. RefuseTruck will require **a constructor** and **four methods** (collectBin, getCurrentTruckWeight getMaxBins and printStats)
4. TestRefuseTruck is the driver program to test your class.

Write a program adhering to the specification below:

1. 1.RefuseTruck Class

#### Constructor

A Constructor that accepts 2 parameters and uses these to set the maximum number of bins a truck can carry and the cost per kilo of rubbish.  The number of bins collected and the number of bins declined can be set to 0.

**getNoOfBinsCollected**** method**

- .Returns the number of bins collected.

**getMaxBins**** method**

- .Returns the maximum number of bins the truck can collect.

**collectBin**** method**

- .Accepts the weight of the bin to be collected as a parameter.

- .The refuse truck will weigh each bin and If the weight is less than 100kg and the number of bins collected is less than or equal to the maximum then this method updates the number of bins actually collected and the total weight of rubbish in the truck as appropriate.

- .If the bin weight is over 100 Kg the method will throw a user defined **BinOverWeightException** and update the number of overweight bins that were not collected.





**printStats**** method**

- .This method prints the number of bins collected, the number of bins not collected, the average weight of bins collected and the average cost per collected bin.

1. 2.TestRefuseTruck Class

1. TestRefuseTruck initially requires (from the keyboard) **the maximum number of bins a truck can carry and** the **cost**** per kilo of rubbish ****.** These can be represented as (maxBins, ratePerKg).
2. The program continually prompts the user to enter the bin weight (binWeight) from the keyboard for each bin **until** the maximum number of bins a truck can carry has been exceeded.
3. It should then print the statistics for the truck as shown below:

You need to add exception handling code to the test class to validate the user input. If the user enters non numeric data, the program will throw an exception. You need to handle the exception for all the keyboard input that may be affected.

Sample Output

Enter number of bins the truck can collect:w

Error with Input

Enter number of bins the truck can collect:3

Enter cost per kilo:e

Error with Input

Enter cost per kilo:3

 Enter the weight for  bin 1 :

e

Error with Input

 Enter the weight for  bin 1 :

3

 Enter the weight for  bin 2 :

101

Bin is over the 100Kg weight - Collection declined

 Enter the weight for  bin 2 :

2

 Enter the weight for  bin 3 :

3

No of bins Collected: 3 bins

No. of bins not collected: 1 bins

Average Weight of bins collected is: 2.67 kg

Average cost of bins collected is €8.00