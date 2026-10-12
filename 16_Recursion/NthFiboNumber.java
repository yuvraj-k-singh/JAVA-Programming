/*
WAP: Nth Fibonacci Number
Date: 12-oct-2026
*/

public class NthFiboNumber {
    public static void main(String[] args) {
        int n = 3;
        int ans = fibo(n);
        System.out.println("Answer: "+ans);
    }

    public static int fibo(int n){
        if(n == 0 || n == 1){
            return n;
        }
        return fibo(n-1) + fibo(n-2);
    }
}
