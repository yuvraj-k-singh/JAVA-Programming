/*
WAP: Count Terms In AP
Date: 13-Dec-2025
*/

import java.util.Scanner;

public class CountTermsInAP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int a = 5, d = 3, limit = 50, count = 0;
        for(int i=a; i<=limit; i+=d){
            count++;
        }
        System.out.println("First term: "+a+"\nCommon difference: "+d);
        System.out.print("The totals numbers of terms in AP is: "+count);
    }
}
