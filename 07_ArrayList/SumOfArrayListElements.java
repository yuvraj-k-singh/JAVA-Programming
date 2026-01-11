/*
WAP: Sum Of ArrayList Elements
Date: 11-Jan-2026
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SumOfArrayListElements {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter ArrayList elements: ");
        for(int i=0; i<5; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        int sum = 0;
        for(int x : arr){
            sum += x;
        }

        System.out.println();
        System.out.println("\nSum of elements of ArrayList: "+sum);
    }
}
