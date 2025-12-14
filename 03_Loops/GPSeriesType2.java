/*
WAP: Print GP Series - 1,4,16,.....
Date: 14-Dec-2025
*/

import java.util.Scanner;

public class GPSeriesType2 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the first term: ");
        int a = sc.nextInt();
        System.out.print("Enter the common ratio: ");
        int r = sc.nextInt();
        System.out.print("Enter the no of terms: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(a+", ");
            a *= r;
        }
    }
}
