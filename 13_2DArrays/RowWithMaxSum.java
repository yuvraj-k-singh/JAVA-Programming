/*
WAP: Row With Max Sum
Date: 13-June-2026
*/

public class RowWithMaxSum {
    public static void main(String[] args) {
        int[][] arr = {{11,2,2},{15,3,21},{11,3,9}};

        int max = Integer.MIN_VALUE;
        int row = -1;

        for(int i=0; i<arr.length; i++){
            int sum = 0;
            for(int j=0; j<arr[0].length; j++){
                sum += arr[i][j];
            }
            System.out.println(i+" row with sum: "+sum);
            if(max < sum){
                max = sum;
                row = i;
            }
        }

        System.out.println("\n2D arrays elements: ");
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

        System.out.print("\nThe row with max sum are: "+row);
    }
}
