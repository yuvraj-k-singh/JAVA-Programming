/*
WAP: Reverse ArrayList
Date: 11-Jan-2026
*/

import java.util.ArrayList;
import java.util.Scanner;

public class ReverseArrayList {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();

        System.out.println("Enter ArrayList elements: ");
        for(int i=0; i<5; i++){
            int x = sc.nextInt();
            arr.add(x);
        }

        System.out.println("\nArrayList elements before reverse are: ");
        for(int x : arr) System.out.print(x + " ");

        for(int i = 0, j = arr.size()-1; i<j; i++, j--){
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);
        }

        System.out.println("\nArrayList elements after reverse are: ");
        for(int x : arr) System.out.print(x + " ");
    }
}
