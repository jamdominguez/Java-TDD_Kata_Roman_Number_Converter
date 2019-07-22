# Java-TDD_Kata_Roman_Number_Converter
Simple java local application, using Test Driven Development methodology.

Setup:
 - JDK 1.8.0_191
 - IDE IntelliJ Idea
 - Maven (IntellliJ Idea)

Reference to check numbers correctly converted: [Online Roman Number Converter](https://es.calcuworld.com/calculadoras-matematicas/numeros-romanos/)



# 1. Introduction
  TDD is a methodology that let implement efficient code. To use TDD in a project, all team members musth think in TDD mode, from functional analist to junior developer.
  The TDD paradigm consist in:
  1. Take funtional requirements like technical test cases
  2. Implement an basic unit test case
  3. Write the minimun code to pass the test case
  4. Refactoring the code
  5. Repeat the poings 2, 3 and 4 to cover all requirements.

In this example I will develop a simple application using TDD. Imagine you take the next requirements:
___
Develop a application to convert decimals number to roman numbers (0-1000):

- 1 -- I, 2 -- II, 3 -- III... 50 -- L, etc <br/>
- 0 is allowed, must return emtpy string
- negative numbers not are allowed, return Exception
___
Now we must think in basic unit test to cover every cases...
