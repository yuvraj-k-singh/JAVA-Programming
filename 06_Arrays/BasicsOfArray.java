/*
WAP: Basics Of Array
Date: 03-Jan-2026
*/


public class BasicsOfArray {
    public static void main(String[] args){
        //declare and initialise array
        int[] arr = {1,2,3,4,5};

        //accessing value or index
        System.out.println("Index 0 element: "+arr[0]);
        System.out.println("Index 2 element: "+arr[2]);
        System.out.println("Index 4 element: "+arr[4]);

        //updating value
        arr[4] = 40;
        System.out.print("\nAfter update index 4 element: "+arr[4]);
    }
}
