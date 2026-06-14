/*
WAP: Snake Pattern Print
Date: 14-June-2026
*/

public class SnakePatternPrint {
    public static void main(String[] args){
        int[][] arr = {{2,3,2,1},{5,3,3,2},{5,3,2,4},{1,9,4,9}};

        System.out.println("Snake Pattern: ");
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                for(int j=0; j<arr[0].length; j++){
                    System.out.print(arr[i][j]+" ");
                }
            }else{
                for(int j=arr[0].length-1; j>=0; j--){
                    System.out.print(arr[i][j]+" ");
                }
            }
            System.out.println();
        }
    }
}
