/*
WAP: For Each Loop
Date: 08-Jan-2026
*/

public class ForEachLoop {
    public static void main(String[] args){
        int[] arr = {1,2,3,4,5,6};

        System.out.println("Arrays elements are: ");
        for(int x : arr){
            System.out.print(x+ " ");
        }

        //In for each loop we cannot modify the elements of array, bcz it create pf actual array elements, so they
        //are independent to each other.
    }
}
