/*
WAP: Two Sum
Date: 04-Jan-2026
*/

import java.util.Scanner;

public class TwoSum {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int[] arr = {1,3,6,2,3,5};

        System.out.print("Enter the sum target: ");
        int target = sc.nextInt();
        boolean flag = false;

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr.length; j++){
                if(arr[i] + arr[j] == target){
                    System.out.print("("+arr[i]+","+arr[j] + ") ");
                    flag = true;
                }
            }
        }

        if(!flag) System.out.print("\nThe given "+target+" target of sum pair is not found!");
    }
}
