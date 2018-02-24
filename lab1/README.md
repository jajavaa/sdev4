# Lab 10

Exercise 1

The aim of this exercise is for you to calculate the cost of decorating a house using different kinds of materials. The materials we focus on here are flooring, paint and wallpaper. The walls and floors of the house are represented by a class called Surface. You need to spend some time working out the calculations for the getReqMaterial() method in each of the sub classes.



Surface Class

- This class has 3 private member variables:
  - name (String) – name of the surface
  - length (double) - length of the surface
  - width (double) - width of the surface
- Constructor which initialises the 3 member variables using a parameter list
- Appropriate Getter() methods
- A calcArea() method which calculates and returns the area as a double

Material Class (abstract)

- .This class has 2 private member variables:
  - .name (String) - name of the material
  - .price (double) - price per unit

- .Constructor which initialises member variables using a parameter list
- .Appropriate Getter() methods
- .An abstract method getReqMaterial() which takes an object reference of type surface as a parameter and returns a double.
- .A method called calcTotalPrice() which takes an object reference of type Surface as a parameter and calculates and returns a double representing the total price. The total price is calculated by multiplying the price by the required material (call the getReqMaterial method)



**Paint Class (type of material)**

- .This class has 2 private member variables:
  - .numCoats (int) - number of coats required
  - .coverage (double) - number of sq meters per litre
- .Constructor which initialises appropriate member variables using a parameter list
- .Appropriate Getter()methods
- .Overide the getReqMaterial() method in the Material class which takes an object reference of type Surface  and returns a double representing the number of litres of paint required.
  - .Note 1: Windows and doors account for 20% of the wall surface.
  - .Note  2: A room has 4 walls - you need to bear this in mind when doing the calculation.
  - .Note 3: The length member variable (defined in Surface class) can be used to represent the height of the surface

**Wallpaper Class (type of material)**

- .This class has 2 private member variables:
  - .length per roll (double)
  - .width per roll (double)
- .Constructor which initialises appropriate member variables using a parameter list
- .Appropriate Getter() methods
- .Overide the getReqMaterial() method in the Material class which takes an object reference of type Surface as a parameter and returns a double representing the number of rolls of wallpaper required. Notes 1,2,3 from above apply here also for your calculations.

**Flooring Class (type of material)**

- .This class has 1 private member variable:
  - .coverage per pack
- .Constructor which initialises appropriate member variables using a parameter list
- .Appropriate Getter() methods
- .Overide the getReqMaterial() method in the Material class which takes an object reference of type Surface as a parameter and calculates and returns a double representing the number of packs of flooring required.



Test Class

Create an arrayList of type **Material to** hold 5 different Material object references



| Material | Name | Price | Number Coats | Coverage |
| --- | --- | --- | --- | --- |
| Paint | &quot;Dulux Soft Sheen&quot; | €11.52 per litre | 2 | 12 sq m per litre |
| Paint | &quot;Crown White&quot; | €10 per litre | 3 | 10 sq m per litre |
| Material | Name | Price | Length per roll **Width per roll** |   |
| Wallpaper | &quot;Shand Kydd&quot; | €50 per roll | 10.06m | 0.52m |
|   |   |   |   |   |
| Material | Name | Price |   | Coverage per pack |
| Flooring | &quot;Quick-Step Planked Oak&quot; | €65 per pack |   | 1.65 m sq |
| Flooring | &quot;Elka Classic Walnut&quot; | €80 per pack |   | 1.65 m sq |

Create a Surface object called &quot;testSurface&quot; with length 5.7 and width 5.7

Call all appropriate methods inside a For loop to generate output similar to that shown below:



Sample Output

Name: Dulux Soft Sheen, Requirement: 17.33 units, Price €199.62

Name: Crown White, Requirement: 31.19 units, Price €311.9

Name: Shand Kydd, Requirement: 19.87 units, Price €993.73

Name: Quick-Step Planked Oak, Requirement: 19.69 units, Price €1,279.91

Name: Elka Classic Walnut, Requirement: 19.69 units, Price €1,575.27

Exercise 2

Write code to sort the objects by name in ascending order as follows:

Sample Output:

Sorted Collection

Name: Crown White, Requirement: 31.19 units, Price €311.9

Name: Dulux Soft Sheen, Requirement: 17.33 units, Price €199.62

Name: Elka Classic Walnut, Requirement: 19.69 units, Price €1,575.27

Name: Quick-Step Planked Oak, Requirement: 19.69 units, Price €1,279.91

Name: Shand Kydd, Requirement: 19.87 units, Price €993.73
