/*
WAP: Input Output Using Loop ArrayList
Date: 11-Jan-2026
*/

import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputUsingLoop {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter ArrayList elements: ");
        for(int i=0; i<5; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println();
        System.out.println("ArrayList elements are: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
