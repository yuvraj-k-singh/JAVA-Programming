/*
WAP: Determine Youngest Amongs Three
Date: 10-Dec-2025
*/


import java.util.Scanner;

public class DetermineYoungest {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Age of Ram: ");
        int a = sc.nextInt();
        System.out.print("Enter Age of Shyam: ");
        int b = sc.nextInt();
        System.out.print("Enter Age of Raju: ");
        int c = sc.nextInt();

        System.out.println();
        if(a<b && a<c){
            System.out.print("Ram is younger among's three!");
        } else if(b<a && b<c){
            System.out.print("Shyam is younger among's three!");
        } else{
            System.out.print("Raju is younger among's three!");
        }
    }
}
