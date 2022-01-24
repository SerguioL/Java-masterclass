package section3;

public class Hello {

//The public Java keyword is an access modifier. An access modifier allows us to define the scope or how other parts of your code or even some else's code can access this code.

//What is a method? It's a collection of statements (one or more) that performs an operation. The main method is the entry point of any Java code and what it looks for when running a program.

//What are Variables?
//Variables are a way to store information in our computer. Variables that we define in a program can be accessed by a name we give them, and the computer does the hard work of figuring out where they get stored in th computers random access memory(RAM)

//Expression
//This is a construct that evaluates to a single value

//Java Operators-
//Java operators or just operators perform an operation on a variable or value. +, -, / and * are four common ones

//Primitive Types
//In Java primitive types are the most basic data types. The int is one of th eight primitive
//The eight primitive data types in Java are boolean, byte, char, short, int, long, float and double

//

    public static void main(String[] args) {
        //Statements- this a complete command to be executed and can include one or more expression
        System.out.println("Hello World");

        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = 6;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = myTotal - 1000;
        System.out.println(myFirstNumber);
        System.out.println(myTotal);
        System.out.println(myLastOne);
    }


}
