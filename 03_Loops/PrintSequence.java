/*
WAP: Print Sequence - 1, n, 2, n-1, 3, n-2, 4, n-3, ....
Date: 13-Dec-2025
*/

import java.util.Scanner;

public class PrintSequence {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the number of terms: ");
        int n = sc.nextInt();

        for(int i=1; i<=n; i++){
            System.out.print(i + ", "+ n +", ");
            n -= 1;
        }
    }
}
