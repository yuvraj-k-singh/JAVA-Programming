/*
WAP: Strings Values Comparision
Date: 07-july-2026
*/

public class ValueComparision {
    public static void main(String[] args) {
        String str1 = "Yuvraj";
        String str2 = "yuvraj";
        String str3 = "YuVrAJ";
        String str4 = "Yuvraj";

        //1. == Method used to compare, is two reference variables pointing to same literal.
        System.out.println("1. == Method: ");
        if(str1 == str4) System.out.println("Yes both Strings are same!");
        else System.out.println("No both Strings are same!");

        //2. equals() Method are used to compare actual two strings values and it is case sensitive.
        System.out.println("\n2. equals() Method: ");
        if(str1.equals(str2)) System.out.println("Yes both Strings are same!");
        else System.out.println("No both Strings are same!");


        //3. equalsIgnoreCase() Method are used to compare two strings values and ignore upper or lower case
        System.out.println("\n2. equalsIgnoreCase() Method: ");
        if(str1.equalsIgnoreCase(str3)) System.out.println("Yes both Strings are same!");
        else System.out.println("No both Strings are same!");
    }
}
