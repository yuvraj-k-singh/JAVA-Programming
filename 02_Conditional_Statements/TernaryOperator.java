/*
WAP: Ternary Operator
Date: 11-Dec-2025
*/

import java.util.Scanner;

public class TernaryOperator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        //Ternary Operator is short hand of if else statement. condition ? sach : jhooth

        System.out.print(n + " is "+((n>0) ? "postive number!" : "negative number!"));
    }
}
