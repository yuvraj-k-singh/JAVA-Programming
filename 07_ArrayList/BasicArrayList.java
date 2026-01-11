/*
WAP: Basic ArrayList
Date: 11-Jan-2026
*/

import java.util.ArrayList;

public class BasicArrayList {
    public static void main(String[] args){

        //declare ArrayList
        ArrayList<Integer> arr = new ArrayList<>();

        //1. add elements
        arr.add(1);
        arr.add(2);
        arr.add(3);
        arr.add(4);

        //2. print element using index
        System.out.println("ArrayList element of 0 index is: " + arr.get(0));

        //3. print size of ArrayList
        int n = arr.size();
        System.out.println("ArrayList size: " + n);

        //4. update value of ArrayList
        arr.set(0, 0);
        System.out.println("ArrayList element of 0 index after updation: " + arr.get(0));

        //print ArrayList Using for loop
        System.out.println("\nArrayList Using simple For Loop: ");
        for(int i=0; i<arr.size(); i++){
            System.out.print(arr.get(i) + " ");
        }

        //print ArrayList elements using enhanced for loop
        System.out.println("\nArrayList Using enhanced For Loop: ");
        for(int x : arr){
            System.out.print(x + " ");
        }
    }
}
