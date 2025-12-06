/*
WAP: Data Types
Date: 06-Dec-2025
*/

public class DataTypes {
    public static void main(String[] args){
        //In java there are two types of data types - 1. Primitive Data type and 2. Non-primitive Data type.
        //Primitive data type is inbuilt data type which comes along with program, in java there 8 P datatypes.

        System.out.println("1. Integers Datatypes: ");
        //1. Byte (INT) Data types - It takes 1 Byte in memory.
        byte a1 = 5;
        System.out.println("Value of byte: "+a1);

        //2. Short (INT) Data types - It takes 2 Byte in memory.
        short a2 = 65;
        System.out.println("Value of short: "+a2);

        //3. Int (INT) Data types - It takes 4 Byte in memory.
        int a3 = -6555;
        System.out.println("Value of int: "+a3);

        //4. Long (INT) Data types - It takes 8 Byte in memory.
        long a4 = -6565486l;     //during long declaration we need to add L or l in the last to instruct complier about long datatype.
        System.out.println("Value of long: "+a4);

        System.out.println();

        System.out.println("2. Float Datatypes: ");
        //5. Float (Decimal) Data types - It takes 4 Byte in memory.
        float a5 = 65.828f;   //we need to add f or F in last during declaration of float bcz by default it is double.
        System.out.println("Value of float: "+a5);

        //6. Double (Decimal) Data types - It takes 8 Byte in memory.
        double a6 = -98565.828;
        System.out.println("Value of float: "+a6);

        System.out.println();

        System.out.println("3. Character Datatype: ");
        //7. Char (CHAR) Data types - It takes 2 Byte in memory, and it is different from char in c/c++ bcz
        // java support unicode to represent Characters. Unicode is collection of all international character set
        // which spoken by humans.
        char ch = 'P';
        System.out.println("Value of char: "+ch);

        System.out.println();

        System.out.println("4. Boolean Datatype: ");
        //8. Boolean (Bool) Data types - It takes 1 Byte in memory & it stores only True or False.
        boolean flag = true;
        System.out.print("Value of boolean: "+flag);
    }
}
