# Rental Bike
Test of a rental bike in java

## Getting Started
* Donwload the main file
* Look inside of src file for the classes (main, account and customer) class 
* Look inside of test file for the test classes (account and customer)

## Design
My design was in two classes to managment the rental transaction. One of them named account. It has the information of the transaction. Also each account can load until 5 customer. The account give automatically a discount when it has between three (3) and five (5) customer in the same account. The another class is named customer. It set the information for each customer and this information is load in the account. 
I developed a simple console application to give you an idea about the process. 

## Development practices
* Used code format 
* Classes with polymorphism in constructor to set default values or setup specific values.
* right size of variable to reduce memory size.
* Comment of build Javadoc
* General comment of the code
* Exception 

## Running the tests
Each class has a test class with similar name

account test
  * testAddCustomer() = it is true until 5 customer. After that must be false.
  * testDelCustomer() = it is true more then 0 customer. If the account does not have customer must be false.
  * testGetTotal() = return the total of account. Take the value of all the customer.
  * testCountCustomer() =  retunr the number of customer in that account.
  * testRestart() = Set the intial value.
  
customer test
  * testSetHour() = increase the total. The value will be (price x number of hours)
  * testSetDay() = increase the total. The value will be (price x number of days)
  * testSetWeek() = increase the total. The value will be (price x number of weeks)
  * testGetTotal() = return the total of customer. It depends of what kind of plan the customer choice it.

## Built With
* NetBeans IDE
* Junit framework
 

## Authors
* Jesus Nieto

## License
This project is licensed under the MIT License - see the [LICENSE.md](LICENSE.md) file for details

