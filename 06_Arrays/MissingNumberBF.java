/*
WAP: Missing Number Brutal Force
Date: 09-Jan-2026
*/

public class MissingNumberBF {
    public static int missing(int[] arr) {
        for (int i = 1; i <= arr.length; i++) {
            boolean flag = false;
            for (int x : arr) {
                if (x == i) {
                    flag = true;
                    break;
                }
            }
            if(!flag) return i;
        }
        return -1;
    }

    public static void main(String[] args){
        int[] arr = {0,1,2};
        System.out.print("Missing number is: " + missing(arr));
    }
}
