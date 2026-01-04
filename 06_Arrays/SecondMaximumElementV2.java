/*
WAP: Second Maximum Element V2
Date: 04-Jan-2026
*/

public class SecondMaximumElementV2 {
    public static void main(String[] args){
        int[] arr = {2,3,5,7,3,7,5};
        int max = Integer.MIN_VALUE, smax = Integer.MIN_VALUE;

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]){
                smax = max;
                max = arr[i];
            } else if(smax<arr[i] && arr[i]!=max){
                smax = arr[i];
            }
        }

        System.out.print("Second maximum element: "+smax);
    }
}
