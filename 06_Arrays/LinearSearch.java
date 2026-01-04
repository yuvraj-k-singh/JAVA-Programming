/*
WAP: Linear Search
Date: 04-Jan-2026
*/

import java.util.Scanner;

public class LinearSearch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {4,2,5,6,4,3,7};

        System.out.print("Enter element to search: ");
        int x = sc.nextInt();
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            if(x == arr[i]){
                flag = true;
            }
        }

        if(flag == true) System.out.print("\n" +x+ " element is present in given array!");
        else System.out.print("\n" +x+ " element is not present in given array!");
    }
}
