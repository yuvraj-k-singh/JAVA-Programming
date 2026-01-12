/*
WAP: Convert Array to Int
Date: 11-Jan-2026
*/

public class ConvertArrayToINT {
    public static void main(String[] args){
        int[] arr = {1,2,3,4};
        long num = 0;

        for(int i=0; i<arr.length; i++){
            num = num*10 + arr[i];
        }

        System.out.println("Arrays elements are: ");
        for(int x : arr){
            System.out.print(x + " ");
        }

        System.out.println();
        System.out.print("\nNumber is: " + num);
    }
}
