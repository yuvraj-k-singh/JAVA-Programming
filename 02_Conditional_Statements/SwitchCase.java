/*
WAP: Switch Case
Date: 11-Dec-2025
*/


import java.util.Scanner;

public class SwitchCase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter day number (1-7): ");
        int choice = sc.nextInt();

        switch(choice){
            case 1:
                System.out.print(choice + " is Monday!");
                break;
            case 2:
                System.out.print(choice + " is Tuesday!");
                break;
            case 3:
                System.out.print(choice + " is Wednesday!");
                break;
            case 4:
                System.out.print(choice + " is Thursday!");
                break;
            case 5:
                System.out.print(choice + " is Friday!");
                break;
            case 6:
                System.out.print(choice + " is Saturday!");
                break;
            case 7:
                System.out.print(choice + " is Sunday!");
                break;
            default:
                System.out.print("Invalid choice, Please try again!");
        }
    }
}
