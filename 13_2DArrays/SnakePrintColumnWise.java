/*
WAP: Snake Print Column Wise
Date: 14-June-2026
*/

public class SnakePrintColumnWise {
    public static void main(String[] args){
        int[][] arr = {{2,3,2,1},{5,3,3,2},{5,3,2,4},{1,9,4,9}};

        System.out.println("Snake Pattern ColumnWise: ");
        for(int j=0; j<arr[0].length; j++){
            if(j%2==0){
                for(int i=0; i<arr.length; i++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int i=arr.length-1; i>=0; i--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
