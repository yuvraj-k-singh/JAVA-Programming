/*
WAP: Pascal Triangle ArrayList
Date: 18-June-2026
*/

import java.util.ArrayList;

public class PascalTriangleArrayList {
    public static void main(String[] args) {
        int rowNum = 5;

        ArrayList<ArrayList<Integer>> ans = pascalsTriangle(rowNum);

        for(ArrayList<Integer> arr : ans){
            for(int x: arr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }

    public static  ArrayList<ArrayList<Integer>> pascalsTriangle(int rowNum){
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();

        for(int i=1; i<=rowNum; i++){
            ArrayList<Integer> row = new ArrayList<>();
            int x = 1;
            for(int j=1; j<=i; j++){
                row.add(x);
                x = x*(i-j)/j;
            }
            ans.add(row);
        }
        return ans;
    }
}
