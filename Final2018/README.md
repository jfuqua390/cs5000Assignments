### Final Exam
#### 1.	(20 points)
A pet shop wants to give a discount to its clients if they buy one or more pets and at least five other items. The discount is equal to 20 percent of the cost of the other items, but not the pets.

Use a class Item to describe an item, with any needed methods and a constructor public:
```java
Item(double price, boolean isPet, int quantity)
```
An invoice holds a collection of Item objects; use an array or array list to store them. In the Invoice class, implement methods:
```java
public void add(Item anItem)

public double getDiscount()
```
Write a program that prompts a cashier to enter each price and quantity, and then a Y for a pet or N for another item. Use a price of –1 as a sentinel. In the loop, call the add method; after the loop, call the getDiscount method and display the returned value.

#### 2.	(15 points)
Make a class Employee with a name and salary. Make a class Manager inherit from Employee. Add an instance variable, named department, of type String. Supply a method toString that prints the manager’s name, department, and salary. Make a class Executive inherit from Manager. Supply appropriate toString methods for all classes.

Supply a test program that tests these classes and methods.

#### 3.	(15 points)
a)	Implement a class Person that implements the following Measurable interface. A person has a name and height in centimeters.
b)	Supply a test program PersonTester that uses the following Data class to process an array of Person objects. Display the average height and the name of the tallest person.
```Java
public interface Measurable
{
   double getMeasure();
}

public class Data
{
   /**
      Computes the average of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the average of the measures
   */
   public static double average(Measurable[] objects)
   {
      double sum = 0;
      for (Measurable obj : objects)
      {
         sum = sum + obj.getMeasure();
      }
      if (objects.length > 0)
      {
         return sum / objects.length;
      }
      else
      {
         return 0;
      }
   }

   /**
      Computes the maximum of the measures of the given objects.
      @param objects an array of Measurable objects
      @return the maximum of the measures, null if array is empty
   */
   public static Measurable max(Measurable[] objects)
   {
      if (objects.length == 0)
      {
         return null;
      }
      Measurable max = objects[0];
      for (Measurable obj : objects)
      {
         if (obj.getMeasure() > max.getMeasure())
         {
            max = obj;
         }
      }
      return max;
   }
}
```

#### 4.	(20 points)
Modify the BankAccount class to throw the exceptions of the following three exception types that you provide:

•	NegativeBalanceException, when the account is constructed with a negative balance;
•	NegativeAmountException, when a negative amount is deposited; and
•	InsufficientFundsException, when an amount that is not between 0 and the current balance is withdrawn.

Write a test program that causes all three exceptions to occur and that catches them all.

Hint: Rather than using IllegalArgumentException, you need to design your own three exception types:
NegativeBalanceException,
NegativeAmountException,
InsufficientFundsException.

For example, you can design NegativeBalanceException as follows
```Java
/**
   This exception reports a negative initial balance on a bank account.
*/
public class NegativeBalanceException extends RuntimeException
{
   public NegativeBalanceException()
   {
   }

   public NegativeBalanceException(String message)
   {
      super(message);
   }
}
```

#### 5.	(30 points)
Write a program to design an appointment calendar. An appointment includes the date, starting time, ending time, and a description; for example,

**Dentist 2016/10/1 17:30 18:30**

**CS1 class 2016/10/2 08:30 10:00**

Supply a command-line user interface to add appointments, remove canceled appointments, and print out a list of appointments for a particular day. Follow the design process that was described in Chapter 12: Object-Oriented Design. Your solution should at least include a class Appointment and also a class AppointmentCalendar that is not coupled with the Scanner or PrintStream classes.

Supply a test program that tests the designed classes and methods.
