/*
WAP: Print Column Wise Element
Date: 14-June-2026
*/

public class PrintElemColumnWise {
    public static void main(String[] args) {
        int[][] arr = {{3,5,2},{2,5,3},{7,5,3}};

        for(int j=0; j<arr[0].length; j++){
            for(int i=0; i<arr.length; i++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }
}
