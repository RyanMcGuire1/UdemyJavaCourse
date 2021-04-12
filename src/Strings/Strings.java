package Strings;

public class Strings {
    public static void main(String[] args) {
        //Primitive data types
        //Byte
        //Short
        //Int
        //Long
        //Float
        //double
        //Char
        //Boolean

        //String is not a Primitive Type. It's a Class.
        String myString = "This is a string";
        System.out.println("myString is equal to " + myString);
        myString = myString + ", and this is more.";
        System.out.println("myString is equal to " + myString);
        myString = myString + "\u00a9 2021";
        System.out.println("myString is equal to " + myString);
        String numberString = "250.55";
        numberString = numberString + "49.95";
        System.out.println(numberString);
        String lastString = "10";
        int myInt = 50;
        lastString = lastString + myInt;
        System.out.println("LastString is equal to " + lastString);
        double doubleNumber = 120.47d;
        lastString = lastString + doubleNumber;
        System.out.println("LastString is equal to " + lastString);

    }
}
