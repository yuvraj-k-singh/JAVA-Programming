/*
WAP: Basic 2D Array
Date: 13-June-2026
*/

public class Basic2dArray {
    public static void main(String[] args){
        int[][] arr = new int[3][3]; //Declare
        int[][] brr = {{1,2,4},{4,2,3},{9,6,4}};

        System.out.println("Arr 2D Arrays elements: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("\nBrr 2D Arrays elements: ");
        for(int i=0; i<brr.length; i++){
            for(int j=0; j<brr[0].length; j++){
                System.out.print(brr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
