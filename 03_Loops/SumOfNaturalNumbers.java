import java.util.Scanner;

public class SumOfNaturalNumbers {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        int sum = 0;

        System.out.println("\nAll natural numbers from 1 to "+n+" are: ");
        for(int i=1; i<=n; i++){
            System.out.print(i+" ");
            sum += i;
        }

        //System.out.print("\nThe sum of " +n+ " numbers is: "+sum);
    }
}
