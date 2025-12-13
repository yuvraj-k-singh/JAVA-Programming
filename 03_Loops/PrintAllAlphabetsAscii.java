/*
WAP: Print All Alphabets along with Ascii values
Date: 13-Dec-2025
*/

public class PrintAllAlphabetsAscii {
    public static void main(String[] args){

        System.out.println("All Capital Alphabets along with their ascii values: ");
        for(int i=65; i<=90; i++){
            System.out.print((char)i+" ("+i+"), ");
        }

        System.out.println();
        System.out.println("\nAll Small Alphabets along with their ascii values: ");
        for(int i=97; i<=122; i++){
            System.out.print((char)i + " ("+i+"), ");
        }

    }
}
