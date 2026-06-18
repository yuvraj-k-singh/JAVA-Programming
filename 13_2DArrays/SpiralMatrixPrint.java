/*
WAP: Spiral Matrix Print
Date: 18-June-2026
*/

import java.util.ArrayList;

public class SpiralMatrixPrint {
    public static void main(String[] args) {
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer> ans = spiralMatrix(arr);

        System.out.println("Spiral Matrix: "+ans);
    }

    public static ArrayList<Integer> spiralMatrix(int[][] arr){
        int m = arr.length, n = arr[0].length;
        int fRow = 0, fCol=0, lRow = m-1, lCol = n-1;

        ArrayList<Integer> ans = new ArrayList<>();
        int totalElem = m*n;

        while(ans.size()<=totalElem){
            //right
            for(int j=fCol; j<=lCol; j++){
                ans.add(arr[fRow][j]);
            }
            fRow++;
            if(ans.size()==totalElem) break;

            //down
            for(int i=fRow; i<=lRow; i++){
                ans.add(arr[i][lCol]);
            }
            lCol--;
            if(ans.size()==totalElem) break;

            //left
            for(int j=lCol; j>=fCol; j--){
                ans.add(arr[lRow][j]);
            }
            lRow--;
            if(ans.size()==totalElem) break;

            //up
            for(int i=lRow; i>=fRow; i--){
                ans.add(arr[i][fCol]);
            }
            fCol++;
            if(ans.size()==totalElem) break;
        }
        return ans;
    }
}
