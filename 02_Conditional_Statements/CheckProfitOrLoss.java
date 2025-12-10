/*
WAP: Check Profit Or Loss
Date: 10-Dec-2025
*/


import java.util.Scanner;

public class CheckProfitOrLoss {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the cost price: ");
        double cp = sc.nextDouble();

        System.out.print("Enter the selling price: ");
        double sp = sc.nextDouble();

        System.out.println();
        double check = sp - cp;
        if(check>0){
            System.out.print("The seller has made profit of amount: "+check);
        } else if(check == 0){
            System.out.print("The seller has made no loss and profit!");
        } else{
            System.out.print("The seller has made loss of amount: "+ (check*-1));
        }
    }
}
