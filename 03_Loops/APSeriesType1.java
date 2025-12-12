/*
WAP: AP Series Type1 - 2,5,8,11...
Date: 12-Dec-2025
*/

import java.util.Scanner;

public class APSeriesType1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of nth term: ");
        int n = sc.nextInt();

        System.out.println("AP series of nth term is: ");
//        for(int i=2; i<=3*n-1; i+=3){
//            System.out.print(i+" ");
//        }

        int a = 2, d = 3;
        for(int i = 1; i<=n; i++){
            System.out.print(a+" ");
            a += d;
        }
    }
}
