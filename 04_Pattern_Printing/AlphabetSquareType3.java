import java.util.Scanner;

public class AlphabetSquareType3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the value of n: ");
        int n = sc.nextInt();
        char ch = 'A';

        System.out.println();
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                if(i%2==0){
                    System.out.print(ch+" ");
                } else System.out.print((char)(ch+32)+" ");
            }
            System.out.println();
            ch++;
        }
    }
}
