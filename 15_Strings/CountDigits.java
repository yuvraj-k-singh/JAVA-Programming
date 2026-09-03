/*
WAP: Count Digits
Date: 03-Sep-2026
*/

public class CountDigits {
    public static void main(String[] args) {
        int x = 1224;

        int count = digitsCount(x);

        System.out.println("Total digits in value "+x+" is: "+count);
    }

    public static int digitsCount(int x){
        String s = "";
        s = Integer.toString(x);
        return s.length();
    }
}
