/*
WAP: Input Output Using Loops
Date: 18-June-2026
*/

import java.util.ArrayList;
import java.util.Scanner;

public class InputOutputUsingLoops {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();
        int rows = 3, cols = 3;

        System.out.println("Enter elements: ");
        for(int i=0; i<rows; i++){
            ArrayList<Integer> row = new ArrayList<>();
            for(int j=0; j<cols; j++){
                row.add(sc.nextInt());
            }
            arr.add(row);
        }

        /*
        System.out.println("2D arrayList elements: ");
        for(int i=0; i<arr.size(); i++){
            for(int j=0; j<arr.get(i).size(); j++){
                System.out.print(arr.get(i).get(j)+" ");
            }
            System.out.println();
        }
        */

        System.out.println("\n2D arrayList elements: ");
        for(ArrayList<Integer> list: arr){
            for(int x: list){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
