/*
WAP: Star Rectangle
Date: 16-Dec-2025
*/


import java.util.Scanner;

public class StarRectangle {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter no of rows: ");
        int rows = sc.nextInt();
        System.out.print("Enter no of columns: ");
        int col = sc.nextInt();

        System.out.println();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=col; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
