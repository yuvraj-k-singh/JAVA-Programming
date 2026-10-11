/*
WAP: a Raised to Power b Logarithmic
Date: 11-oct-2026
*/

public class aRaisedPowerbLogarithmic {
    public static void main(String[] args){
        int a = 3, b = 3;

        int ans = power(a,b);
        System.out.println(a+" raised power "+b+" is: "+ans);
    }

    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        int call = power(a,b/2);
        if(b % 2 == 0){
            return call*call;
        }else{
            return a*call*call;
        }
    }
}
