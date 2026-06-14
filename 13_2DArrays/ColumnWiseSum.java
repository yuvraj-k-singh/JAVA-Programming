/*
WAP: Column Wise Sum
Date: 14-June-2026
*/

public class ColumnWiseSum {
    public static void main(String[] args) {
        int[][] arr = {{3,5,2},{2,5,3},{7,5,3}};

        for(int j=0; j<arr[0].length; j++){
            int sum = 0;
            for(int i=0; i<arr.length; i++){
                sum += arr[i][j];
            }
            System.out.println(j+" column with sum: "+sum);
        }
    }
}
