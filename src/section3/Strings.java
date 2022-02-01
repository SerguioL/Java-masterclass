package section3;

public class Strings {

    public static void main(String[] args) {

        //8 Primitive Types

        //byte
        //short
        //int
        //long
        //float
        //double
        //char
        //boolean

        //String

        //The String is a datatype in Java, which is not a primitive type. It's actually a Class, but it enjoys a bit of favoritism in Java to make it easier to use than a regular class

        //A Sting can contain a sequence of characters. A large number of characters.

        String myString = "This a string";
        System.out.println("myString is equal to " + myString);

        myString = myString + ", and this more";
        System.out.println("myString is equal to " + myString);

        myString = myString + " \u00A9 2019";
        System.out.println("myString is equal to " + myString);

        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);

        String lastSting = "10";
        int myInt = 50;
        lastSting = lastSting + myInt;
        System.out.println("LastSting is equal to " + lastSting);

        double doubleNum = 120.47d;
        lastSting = lastSting + doubleNum;
        System.out.println("LastSting is equal to " + lastSting);

        //Strings in Java are immutable which mean you can't change a String after it's created. Instead, what happens is a new String is created.

        //As a result of a String being created, appending values like this is inefficient and not recommended. Instead, you should use StringBuffer

    }

}
