/*
WAP: Product Digits Functional
Date: 11-oct-2026
*/

public class ProductDigitsFunctional {
    public static void main(String[] args) {
        int n = 124;
        int ans = product(n);
        System.out.println("Product of digits: "+ans);
    }

    public static int product(int n){
        if(n == 0){
            return 1;
        }
        return (n%10) * product(n/10);
    }
}
