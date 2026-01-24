/*
WAP: Duplicate Element V2
Date: 24-Jan-2026
*/

public class DuplicateElementV2 {
    public static void main(String[] args) {
        int[] arr = {1,2,4,3,5,3};

        System.out.println("Array elements: ");
        for(int x : arr){
            System.out.print(x+" ");
        }

        int ans = dublicateElement(arr);
        System.out.println();
        System.out.print("\nDublicate element is: "+ans);
    }

    public static int dublicateElement(int[] arr){
        boolean[] flag = new boolean[arr.length+1];

        for(int x : arr){
            if(flag[x] == true){
                return x;
            }else{
                flag[x] = true;
            }
        }
        return -1;
    }
}
