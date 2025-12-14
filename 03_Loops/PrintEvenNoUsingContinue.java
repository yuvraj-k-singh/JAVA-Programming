/*
WAP: Print Even No Using Continue
Date: 14-Dec-2025
*/

public class PrintEvenNoUsingContinue {
    public static void main(String[] args) {

        System.out.println("All even numbers from 1 to 100 are: ");
        for(int i=0; i<=100; i++){
            if(i%2 != 0){
                continue;
            }
            System.out.print(i+ " ");
        }
    }
}
