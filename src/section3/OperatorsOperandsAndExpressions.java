package section3;

public class OperatorsOperandsAndExpressions {

    //What are Operators?

    //Operators in Java special symbols that perform specific operations on one, two, or three operands, and then return a result. As an example, we used the + (addition) operator to sum the value of two variables in a previous video.

    //An operand is a term used to describe any object that is manipulated by an operator

    //An expression is formed by combing variables, literals, method return values

    public static void main(String[] args) {

        int result = 1 + 2;
        System.out.println("1 + 2 = " + result);

        int previousResult = result;
        System.out.println("previousResult = " + previousResult);

        result = result -1;
        System.out.println("3 - 1 = " + previousResult);

        result = result *10;
        System.out.println("2 * 10 = " + result);

        result = result / 5;
        System.out.println("20 / 5 = " + result);

        result = result % 3; //the remainder pf (4 % 3) = 1
        System.out.println("4 % 3 = " + result);

        result++; //1 + 1 = 2
        System.out.println("1 + 1 = " + result);

        result--; //2 - 1 = 1
        System.out.println("2 - 1 = " + result);

        //result = result + 2;
        result += 2; //1 + 2 = 3;
        System.out.println("1 + 2 = " + result);

        //result = result * 10;
        result *= 10; // 3 * 10 = 30
        System.out.println("3 * 10 = " + result);

        //result = result / 3
        result /= 3;
        System.out.println("30 / 3 = " + result);

        //result = result - 2
        result -= 2;
        System.out.println("10 - 2 = " + result);

        //The if-then statement is the most basic of all the control flow statements. It tells your program to execute a certain section of code only if a particular test evaluates to true

        //Conditional logic uses specific statements in Java to allow us to check a condition and execute certain code based on whether that condition (the expression) is true or false

        //Code block allows more than one statement to be executed
//        if(){
//            code block
//        }

        boolean isAlien = false;
        if ( isAlien == false){
            System.out.println("It is not an alien");
        }

        int topScore = 80;
        if (topScore < 100){
            System.out.println("You got the high score");
        }

        int secondTopScore = 81;
        if ((topScore > secondTopScore) && (topScore < 100)){
            System.out.println("Greater than second top score and less then 100");
        }

        boolean isCar = false;
        if (isCar){
            System.out.println("this not supposed to happen");
        }

        //The ternary operator is a shortcut to assigning one of two values to a variable depending on a given condition

        boolean wasCar = isCar ? true : false;
        if (wasCar){
            System.out.println("wasCar is true");
        }

        //challenge

        double firstVal = 20.00d;
        double secondVal = 80.00d;
        double total = (firstVal + secondVal) * 100.00d;
        System.out.println("total = " + total);

        double remainder = total % 40.00d;
        System.out.println("Remainder = " + remainder);

        boolean isNotRemainder = (remainder == 0) ? true : false;
        System.out.println("isNotRemainder = " + isNotRemainder);

        if (!isNotRemainder){
            System.out.println("Remainder");
        }

    }

}
