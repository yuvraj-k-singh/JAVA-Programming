/*
WAP: Missing Number Using XOR
Date: 09-Jan-2026
*/

public class MissingNumberXOR {
    public static int missing(int[] arr) {
        int result = 0;
        for(int i=0; i<arr.length; i++){
            result = result ^ arr[i] ^ i;
        }
        return result ^ arr.length;
    }

    public static void main(String[] args) {
        int[] arr = {9,6,4,2,3,5,7,0,1};
        System.out.print("Missing number is: " + missing(arr));
    }
}
