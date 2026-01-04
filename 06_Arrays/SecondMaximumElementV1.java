/*
WAP: Second Maximum Element V1
Date: 04-Jan-2026
*/

public class SecondMaximumElementV1 {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,3,7,5};
        int max = arr[0], smax = arr[0];

        for(int i=0; i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }

        for(int i=0; i<arr.length; i++){
            if(smax < arr[i] && arr[i] != max){
                smax = arr[i];
            }
        }

        System.out.print("Second maximum element: "+smax);
    }
}
