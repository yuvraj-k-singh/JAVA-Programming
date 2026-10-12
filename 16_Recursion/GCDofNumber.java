/*
WAP: GCD Of Numbers
Date: 12-oct-2026
*/

public class GCDofNumber {
    public static void main(String[] args){
        int a = 24, b = 25;
        int ans = gcd(a,b);
        System.out.println("Ans: "+ans);
    }

    public static int gcd(int a, int b){
        if(a == 0){
            return b;
        }
        return gcd(b%a, a);
    }
}
