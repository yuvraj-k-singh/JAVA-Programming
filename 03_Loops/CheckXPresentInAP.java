/*
WAP: Check X Present In AP
Date: 13-Dec-2025
*/


import java.util.Scanner;

public class CheckXPresentInAP {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common difference: ");
        int d = sc.nextInt();
        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        boolean flag = false;

        System.out.print("Enter the value of x: ");
        int x = sc.nextInt();

        for(int i=1; i<=n; i++) {
            if (x == a) {
                flag = true;
                break;
            }
            a += d;
        }

        System.out.println();
        if(flag){
            System.out.print("The given value "+x+" is present in AP!");
        } else System.out.print("The given value "+x+" is not present in AP!");
    }
}
