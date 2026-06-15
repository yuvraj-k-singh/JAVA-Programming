/*
WAP: Print Transpose Matrix
Date: 15-June-2026
*/

public class PrintTranspose {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        System.out.println("Transpose of matrix: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[j][i]+" ");
            }
            System.out.println();
        }
    }
}
