/*
WAP: Data Type Casting
Date: 09-Dec-2025
*/

public class DataTypeCasting {
    public static void main(String[] args){
        //Data Type Casting - is method use to convert one datatype to another.

        char ch = 'A';
        int x = ch;   //implicit typecasting
        System.out.println("Ascii value of " + ch + " is: "+ x);

        char chh = '0';
        int y = (int)chh;  //explicit typecasting
        System.out.println("Ascii value of " + chh + " is: "+ y);

        char chhh = 'a';
        System.out.println("Ascii value of " + chhh + " is: "+ (int)chhh);

        char th = 'z';
        // here (th+0) means in th container value of z is stored not the z thats why when we perform int
        //operation on it, it print ascii value of z.
        System.out.println("Ascii value of " + th + " is: "+ (th+0));

        int z = 76;
        char thh = (char)z;
        System.out.print("Character value of " + z + " is: "+ thh);
    }
}
