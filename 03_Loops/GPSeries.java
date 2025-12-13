/*
WAP: Print GP Series - 1,2,4,8,16,...
Date: 13-Dec-2025
*/

import java.util.Scanner;

public class GPSeries {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first term: ");
        int a = sc.nextInt();
        System.out.print("Enter common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter number of terms: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(a+" ");
            a *= r;
        }
    }
}
