/*
WAP: Nested Ternary Operator
Date: 11-Dec-2025
*/


import java.util.Scanner;

public class NestedTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the three different values: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        System.out.println();
        System.out.print(((a>b) ? ((a>c) ? "A is greater number!" : "C is greater number!") : ((b>c) ? "B is greater number!" : "C is greater number!")));
    }
}
