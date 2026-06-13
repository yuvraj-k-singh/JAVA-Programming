/*
WAP: Maximum Element Of Matrix
Date: 13-June-2026
*/

public class MaximumElementOfMatrix {
    public static void main(String[] args) {
        int[][] arr = {{11,2,2},{5,3,21}};

        int max = Integer.MIN_VALUE;

        System.out.println("\n2D arrays elements: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
                max = Math.max(max, arr[i][j]);
            }
            System.out.println();
        }

        System.out.print("\nThe maximum element of 2d array are: "+max);
    }
}
