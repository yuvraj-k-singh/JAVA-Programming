/*
WAP: Minimum element Of All Max Element Of each Row
Date: 14-June-2026
*/

public class MinOfAllMaxElemOfRow {
    public static void main(String[] args) {
        int[][] arr = {{3,5,7},{8,5,2},{4,3,2}};

        int minElem = Integer.MAX_VALUE;
        for(int i=0; i<arr.length; i++){
            int max = Integer.MIN_VALUE;
            for(int j=0; j<arr[0].length; j++){
                max = Math.max(max, arr[i][j]);
            }
            System.out.println(i+" row max element: "+max);
            minElem = Math.min(minElem, max);
        }

        System.out.println("\nThe minimum element among all maximum element of each row: "+minElem);
    }
}
