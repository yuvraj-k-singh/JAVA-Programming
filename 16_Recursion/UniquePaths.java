/*
WAP: Unique Paths
Date: 16-oct-2026
*/

public class UniquePaths {
    public static void main(String[] args){
        int m = 3, n = 2;
        int ans = uniquePath(m,n);
        System.out.println("Number of unique paths: "+ans);
    }

    private static int uniquePath(int m, int n){
        if(m == 1 || n == 1){
            return 1;
        }
        return uniquePath(m-1, n) + uniquePath(m, n-1);
    }
}
