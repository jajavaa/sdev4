**Lab 3**

**Exercise 1 Part 1**

Your task is to write the Java program for a new stock control system for a supermarket.

OverMaxException Class

This class is to have a constructor which calls the superclass constructor and passes the appropriate message (String) as a parameter.

# BelowMinException Class

This class is to have a constructor which calls the superclass constructor and passes the appropriate message (String) as a parameter.

# OutOfStockException Class

This class is to have a constructor which calls the superclass constructor and passes the appropriate message (String) as a parameter.

# StockItem Class

The StockItem Class should have variables to store the id number, description, maximum, minimum and inStock figures for the Stock Item.  The maximum figure is the maximum quantity you wish to have in the stores at a time for the item and the minimum is the minimum you must have in the stores at a time.  The inStock figure shows what you actually have in stock.

This class is to have a constructor which takes as parameters values for all the instance variables, plus three methods: takeOnStock(), issueStock  and getInStock().



**takeOnStock()**

- .This allows the user to add new stock to the InStock figure.  The quantity to be added is passed as a parameter to this method.
- .If the new InStock figure generated is greater than the maximum figure, an OverMaxException should be thrown and the amount should not be added to InStock. Otherwise the amount is added to InStock.
- .You should also handle the exception in the method using a try catch block.







issueStock()

- .This allows the user to issue stock from the stores.  The quantity to be deducted from the inStock figure is passed as a parameter to this method.
- .However if the new inStock figure is less than or equal to zero, an OutOfStockException is thrown and the amount **is not** deducted. If the new inStock figure is less than the minimum figure a BelowMinException is thrown which informs the user that the quantity is now below the minimum and the amount **is** deducted.
- .Both exceptions should also be handled inside the method using a try catch block(s).

**getInStock()**

- .This returns the quantity in stock



TestStockItem Class

You are to write an appropriate Test class which demonstrates the use of your two Exception Classes. The Test class should do the following:

- .Create an instance of StockItem with the following values:

id:  123

description Shampoo

max:  100

min:  10

inStock: 25

- .Using the takeOnStock method, try to add a quantity of 80
- .Using the issueStock method try to issue a quantity of 30
- .Using the issueStock method, issue a quantity of 20
- .Display the inStock figure

Sample Output

Warning: Stock is over the maximum allowed limit

Warning: Out of Stock

Warning: Stock below acceptable minimum level

Amount left in stock is:5



**Exercise 1 Part 2**

Create a new version of the solution above and change it so that all the exception handling is done in the test class.

Exercise 2

Do not copy this code into NetBeans – you need to trace through it manually to determine the output. Write your answer in Notepad.

Consider the following code and assume there is an exception class written called InvalidDayException. The checkDay(String) method throws an InvalidDayException if the String given is not an actual day.

package exercise2;

import java.util.Scanner;

public class TestDay {

    public static void main(String[] args) {

        Scanner kb = new Scanner(System.in);

        String day;

        try {

            System.out.println(&quot;Enter a day?&quot;);

            day = kb.nextLine();

            checkDay(day);

            System.out.println(&quot;Thank you&quot;);

        } catch (InvalidDayException ice) {

            System.out.println(ice.getMessage());

        } finally {

            System.out.println(&quot;Bye Bye &quot;);

        }

    }

    public static void checkDay(String p) throws

            InvalidDayException {

        boolean found = false;

        String[] dayList = {&quot;Monday&quot;, &quot;Tuesday&quot;, &quot;Wednesday&quot;,

            &quot;Thursday&quot;, &quot;Friday&quot;, &quot;Saturday&quot;, &quot;Sunday&quot;};

        for (String dayList1 : dayList) {

            if (dayList1.equals(p)) {

                found = true;

            }

        }

        if (found) {

            System.out.println(&quot;Valid&quot;);

        } else {

            throw new InvalidDayException();

        }

    }

}

1. i)On the first run of the program, the user enters &quot;fffff&quot; (which is not a day). Write the text that displays on the screen (input &amp; output), in the order it is printed and typed.



1. ii)On another run of the program, the user enters &quot;Monday&quot; (which is a day). Write the text that displays on the screen (input &amp; output), in the order it is printed and typed.

**Exercise 3**

The following code consists of 2 classes: an Account class and a TestAccount class for an Internet banking system.

package ex3;

public class Account {

    private double balance;

    public Account(double balance) {

        this.balance = balance;

    }

    public void withdraw(double amt) {

        balance -= amt;

    }

    public double getBalance() {

        return balance;

    }

}

class TestAccount {

    public static void main(String[] arg) {

        Account theAccount = new Account(200);

        theAccount.withdraw(-300);

    }

}

1. i)Develop an exception class PositiveWithdrawalException that prints an error message &quot;Withdrawal amount must be positive&quot;.
2. ii)Modify the above code such that: If a negative amount is entered, a PositiveWithdrawalException exception is thrown within the withdrawal method and is caught in the calling method (main).