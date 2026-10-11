/*
WAP: a Raised to Power b Linear
Date: 11-oct-2026
*/

public class aRaisedPowerb {
    public static void main(String[] args){
        int a = 3, b = 3;

        int ans = power(a,b);
        System.out.println(a+" raised power "+b+" is: "+ans);
    }

    public static int power(int a, int b){
        if(b == 0){
            return 1;
        }
        return a * power(a,b-1);
    }
}
