/*
WAP: Rotate Matrix ClockWise
Date: 15-June-2026
*/

public class RotateMatrixClockWise {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Matrix Before: ");
        for(int[] a: arr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        int[][] ans = rotateClockWise(arr);

        System.out.println("\nMatrix After: ");
        for(int[] b: ans){
            for(int x: b){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    private static int[][] rotateClockWise(int[][] arr){
        //1. Transpose
        for(int i=0; i<arr.length; i++){
            for(int j=i+1; j<arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        //2. Reverse each row
        for(int i=0; i< arr.length; i++){
            for(int j=0, k=arr[0].length-1; j<k; j++, k--){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }
        return arr;
    }
}
