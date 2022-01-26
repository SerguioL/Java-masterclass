package section3;

public class FloatAndDouble {

    //Floating Point Numbers

    //Unlike whole numbers, floating point numbers have fractional parts that we express with a decimal point. 3.14159 is an example.

    //Floating point numbers are also known as real numbers. we use floating point number when we need more precision calculations.

    //Single and Double Precision

    //Precision refers to the format and amount of space occupied by the type. Single precision occupies 32 bits(so has a width of 32) and a Double precision occupies 64 bits ( and has a with of 64)

    //As a result the float has a range form 1.4E-45 to 3.4028235E+38 and the double is much more precise with a range form 4.9E-324 to 1.797693148623157E+308

    public static void main(String[] args) {

        float myMinFloatValue = Float.MIN_VALUE;
        float myMaxFloatValue = Float.MAX_VALUE;
        System.out.println("Float Minimum Value = " + myMinFloatValue + "\nFloat Maximum Value = " + myMaxFloatValue);

        double myMinDoubleValue = Double.MIN_VALUE;
        double myMaxDoubleValue = Double.MAX_VALUE;
        System.out.println("Double Minimum Value = " + myMinDoubleValue + "\nDouble Maximum Value = " + myMaxDoubleValue);

        int myIntValue = 5 / 3;
        float myFloatValue = 5f / 3f;
        double myDoubleValue = 5d / 3d;
        System.out.println("MyIntValue = " + myIntValue + "\nMyFloatValue = " + myFloatValue + "\nMyDoubleValue = " + myDoubleValue);

        double numberOfPounds = 200d;
        double convertedKilograms = numberOfPounds * 0.45359237d;
        System.out.println("Converted kilograms = " + convertedKilograms);

        //In general floating and double are great for general floating point operations. But both are not great to use where precise calculations are required - this is due to a limitation with how floating point numbers are stored, and not a Java problem as such.

        //Java has a class called BigDecimal that overcomes this. Keep in mind that when precise calculations are necessary, such as when performing currency calulations, floating -point types should not be used.

        //But for general calculations float and double are fine.

    }

}
