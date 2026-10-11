/*
WAP: Sum Digit Functional
Date: 11-oct-2026
*/

public class SumDigitFunctional {
    public static void main(String[] args) {
        int n = 123;
        int ans = sumDigit(n);
        System.out.println("Sum of digits: "+ans);
    }

    public static int sumDigit(int n){
        if(n == 0){
            return 0;
        }
        return (n%10) + sumDigit(n/10);
    }
}
