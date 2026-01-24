/*
WAP: Duplicate Element V1
Date: 24-Jan-2026
*/

public class DuplicateElementV1 {
     public static void main(String[] args) {
        int[] arr = {1,2,4,4,5,3};

         System.out.println("Array elements: ");
         for(int x : arr){
             System.out.print(x+" ");
         }

         int ans = dublicateElement(arr);
         System.out.println();
         System.out.print("\nDublicate element is: "+ans);
    }

    public static int dublicateElement(int[] arr){
         for(int i=0; i<arr.length; i++){
             for(int j=i+1; j<arr.length; j++){
                 if(arr[i]==arr[j]){
                     return arr[i];
                 }
             }
         }
         return -1;
    }
}
