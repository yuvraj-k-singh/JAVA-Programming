/*
WAP: Product Digits Parameterized
Date: 11-oct-2026
*/

public class ProductDigitsParameterized {
    public static void main(String[] args) {
        int n = 124;
        int ans = product(n, 1);
        System.out.println("Product of digits: "+ans);
    }

    public static int product(int n, int prd){
        if(n == 0){
            return prd;
        }
        return product(n/10, prd*(n%10));
    }
}
