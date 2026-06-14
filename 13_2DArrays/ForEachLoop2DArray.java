/*
WAP: For Each Loop 2DArray
Date: 14-June-2026
*/

public class ForEachLoop2DArray {
    public static void main(String[] args) {
        int[][] arr = {{1,2,4,5,2},{4,2,4,2,5},{5,6,4,2,2},{9,6,4,0,2}};
        int[][] brr = {{4,2,4,5,2},{9,6,4,4,5},{7,4,2,3,3},{1,1,1,3,4}};

        System.out.println("1st Method: ");
        for(int i=0; i<arr.length; i++){
            for(int x: arr[i]){
                System.out.print(x+" ");
            }
            System.out.println();
        }

        System.out.println("\n2nd Method: ");
        for(int[] a: brr){
            for(int x: a){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
