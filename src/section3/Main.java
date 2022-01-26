package section3;

public class Main {

    public static void main(String[] args) {
        int myValue = 100;

        //Wrapper Classes

        // Java uses the concept of a Wrapper class for all eight primitive types - In the case of an int, we can use Integer, and by doing that it gives us ways to perform operations on int

        //In this case, we are using  the MIN_VALUE and MAX_VALUE to get Java to tell us the minimum and maximum ranges of numbers that can be stored.

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;

        //Overflow and Underflow in Java

        //If you try and put a value Larger than the maximum value in Java, or a value smaller than the minimum value in Java, then you will get an Overflow in the of maximum value or an Underflow in the case of the minimum

        //The computer just skips back to minimum number or the maximum number, which is usually not what you want. It's an important concept to be aware of

        System.out.println("Integer Minimum Value = " + myMinIntValue + "\nInteger Maximum Value = " + myMaxIntValue);//Overflow
        System.out.println("Busted Max value = " + (myMaxIntValue + 1) + "\nBusted Max value = " + (myMinIntValue -1));//UnderFlow

        int myMaxIntTest = 2_147_483_647;//you can also use underscores (Java 7 or higher)

        byte myMinByteValue = Byte.MIN_VALUE;
        byte myMaxByteValue = Byte.MAX_VALUE;

        System.out.println("Byte Minimum Value = " + myMinByteValue + "\nByte Maximum Value = " + myMaxByteValue);//This used for performance and to save memory. it's not necessary any more because of modern computers

        //edit -> find -> replace || command r
        //use this to change some of your code

        short myMinShortValue = Short.MIN_VALUE;
        short myMaxShortValue = Short.MAX_VALUE;

        System.out.println("Short Minimum Value = " + myMinShortValue + "\nShort Maximum Value = " + myMaxShortValue);

        long myLongValue = 100L;

        long myMinLongValue = Long.MIN_VALUE;
        long myMaxLongValue = Long.MAX_VALUE;

        System.out.println("Long Minimum Value = " + myMinLongValue + "\nLong Maximum Value = " + myMaxLongValue);

        long bigLongLiteralValue = 2147483647234L;
        System.out.println(bigLongLiteralValue);

        //Size of Primitive Types and Width

        //short = occupies 16 bits and hase width of 16
        //int = occupies 32 bits and hase width of 32
        //long = occupies 64 bits and hase width of 64

        short myShortLiteralValue = 32767;

        //Casting in Java

        //Casting means to treat or convert a number from one type to another. We put the type we want the number to be in parentheses like this
        //(byte)(myMinByteValue/2)

        int myTotal = (myMaxIntValue / 2);

        byte myNewByteValue = (byte) (myMinByteValue /2);

        short myNewShortValue = (short) (myMinLongValue / 2);



        
    }
}
