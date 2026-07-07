/*
WAP: Strings Memory Allocation
Date: 07-july-2026
*/

public class StringsMemoryAllocation {
    public static void main(String[] args) {
        //Using String literals
        String str1 = "Hello";
        String str2 = "Hello";

        System.out.println("1. String literals: ");
        if(str1 == str2) System.out.println("Both strings are same!");
        else System.out.println("Both strings are different!");

        /*
        Here, == used to compare reference variable, means is both pointing to same string or not
        equals() is used to compare strings values!
        */

        //Using new keyword
        String str3 = new String("Hello");
        String str4 = new String("Hello");

        System.out.println("\n2. String new Keyword: ");
        if(str3 == str4) System.out.println("Both strings are same!");
        else System.out.println("Both strings are different!");
    }
}
