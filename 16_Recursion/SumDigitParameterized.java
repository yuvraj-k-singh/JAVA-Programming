/*
WAP: Sum Digit Parameterized
Date: 11-oct-2026
*/

public class SumDigitParameterized {
    public static void main(String[] args) {
        int n = 123;
        int ans = sumDigit(n, 0);
        System.out.println("Sum of digits: "+ans);
    }

    public static int sumDigit(int n, int sum){
        if(n == 0){
            return sum;
        }
        return sumDigit(n/10, sum + n%10);
    }
}
