/*
WAP: Transpose Matrix
Date: 15-June-2026
*/

public class TransposeMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,9},{4,5,6,8},{7,8,9,7},{8,4,3,5}};

        System.out.println("Original matrix: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        int[][] ans = transposeMatrix(arr);

        System.out.println("\nTranspose of matrix: ");
        for(int i=0; i<ans.length; i++){
            for(int j=0; j<ans[0].length; j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int[][] transposeMatrix(int[][] arr){
        int row = arr.length, col = arr[0].length;
        int[][] brr = new int[row][col];

        for(int i=0; i<brr.length; i++){
            for(int j=0; j<brr[0].length; j++){
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }
}
