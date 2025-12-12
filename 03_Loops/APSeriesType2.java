/*
WAP: AP Series Type2 - 99,95,91,87...
Date: 12-Dec-2025
*/


import java.util.Scanner;

public class APSeriesType2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of nth term: ");
        int n = sc.nextInt();

        System.out.println("AP series of nth term is: ");
//      for(int i = 99; i>=103-4*n; i-=4){
//            System.out.print(i+" ");
//      }

        int a = 99, d = 4;
        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a -= d;
        }

    }
}
