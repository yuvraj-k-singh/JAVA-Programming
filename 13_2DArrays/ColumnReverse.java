/*
WAP: Reverse Column Print
Date: 14-June-2026
*/

public class ColumnReverse {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int j=0; j<arr[0].length; j++){
            for(int i=0, k=arr.length-1; i<k; i++, k--){
                int temp = arr[i][j];
                arr[i][j] = arr[k][j];
                arr[k][j] = temp;
            }
        }

        System.out.println("Reversed column Matrix: ");
        for(int[] brr : arr){
            for(int x: brr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
