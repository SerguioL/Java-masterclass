package section3;

public class CharAndBoolean {

    public static void main(String[] args) {

        char myChar = 'E';
        char myUnicodeChar = '\u0045';
        System.out.println(myChar + "\n" + myUnicodeChar);
        //char = occupies 16 bits and hase width of 16
        //The reason it's not just a single byte is that it allows you to store Unicode characters

        //Unicode is an international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is assigned a unique numeric value that applies across different platforms and programs

        //In the English alphabet, we have the letters A through Z. Meaning only 26 characters are needed in total to represent the entire English alphabet. But other languages need more characters, and often a lot more

        //Unicode allows us to represent these languages and the way it works is that by using a combination of the two bytes that a char takes up in memory it can represent and one of 65535 different types of characters

        //Boolean Primitive Type

        //A boolean value allows for two choices True or False, yes or no, 1 or 0. in Java terms we have a boolean primitive type and it can be set two valuse only. ture or false thye are actually pretty useful and will use them a lot when programming

        boolean booleanTrue = true;
        boolean booleanFalse = false;

        boolean isCustomerOverTwentyOne = true;



    }

}
