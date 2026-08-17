# ⚙️ Mini Automation Framework (OOP)

Welcome to my Object-Oriented Programming (OOP) project! I built this mini-framework to master core Java concepts and apply them to Software Testing.

## 🎯 Project Goal
This project acts as a mini Test Runner. It simulates executing different test cases (like Login and Checkout) while managing test data and generating a final QA Execution Report.

## 🧠 OOP Principles Applied (APIE)
In this framework, I applied the four main pillars of OOP:
* **Encapsulation:** Created a `TestCaseData` class with `private` variables and used Getters/Setters to safely manage test statuses.
* **Abstraction:** Built an `abstract` class named `BaseTest` to define the blueprint of any test case without writing the internal details.
* **Inheritance:** Used `extends` to make `LoginTest` and `PaymentTest` inherit common setup and teardown steps from the `BaseTest`, reducing code duplication.
* **Polymorphism:** Used `@Override` so that the `runTest()` method behaves differently depending on whether it is running a Login test or a Payment test.

## 💻 Expected Output
When executing the main runner, the console prints:

=================================
QA TEST EXECUTION REPORT
Tester: Youssef Hebish
=================================
Opening Browser and navigating to URL...
Executing Login: Entering username and password.
Closing Browser...
Test Name: Login Functionality | Status: PASSED
---------------------------------
Opening Browser and navigating to URL...
Executing Payment: Processing credit card details.
Closing Browser...
Test Name: Checkout Process | Status: Failed
---------------------------------

## 👨‍💻 About Me
I am currently learning Java to improve my skills in Test Automation and build reliable testing frameworks.
