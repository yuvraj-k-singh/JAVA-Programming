import java.util.Scanner;

public class Permutation {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of N: ");
        int n = sc.nextInt();
        System.out.print("Enter the value of R: ");
        int r = sc.nextInt();

        int npr = fact(n)/fact(n-r);

        System.out.printf("\nThe permutation of %d");
    }
}
