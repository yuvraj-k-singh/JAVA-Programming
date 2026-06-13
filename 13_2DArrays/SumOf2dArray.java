/*
WAP: Sum Of 2d Array
Date: 13-June-2026
*/

public class SumOf2dArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,2},{5,3,2}};

        int sum = 0;

        System.out.println("\n2D arrays elements: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
                sum += arr[i][j];
            }
            System.out.println();
        }

        System.out.print("\nThe sum of 2d array elements are: "+sum);
    }
}
