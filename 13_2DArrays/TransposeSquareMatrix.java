/*
WAP: Transpose Square Matrix
Date: 15-June-2026
*/

public class TransposeSquareMatrix {
    public static void main(String[] args){
        int[][] arr = {{1,2,3,9},{4,5,6,8},{7,8,9,7},{8,4,3,1}};


        System.out.println("Original matrix: ");
        for(int[] a : arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        System.out.println("\nTranspose of matrix: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
