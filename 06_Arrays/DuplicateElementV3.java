/*
WAP: Duplicate Element V3
Date: 24-Jan-2026
*/

public class DuplicateElementV3 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,2,5,3};

        System.out.println("Array elements: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        int ans = dublicateElement(arr);
        System.out.println();
        System.out.print("\nDublicate element is: "+ans);
    }

    public static int dublicateElement(int[] arr){

        int sum = (arr.length*(arr.length-1))/2;
        int sumArr = 0;

        for(int x : arr){
            sumArr+=x;
        }
        return sumArr-sum;
    }
}
