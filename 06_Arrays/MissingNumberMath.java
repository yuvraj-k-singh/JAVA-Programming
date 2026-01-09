/*
WAP: Missing Number Using Math
Date: 09-Jan-2026
*/

public class MissingNumberMath {
    public static int missing(int[] arr){
        int actualSum = (arr.length*(arr.length+1))/2;
        int sum = 0;
        for(int x : arr){
            sum+=x;
        }
        return actualSum - sum;
    }

    public static void main(String[] args){
        int[] arr = {0,1,3};
        System.out.print("Missing number is: " + missing(arr));
    }
}
