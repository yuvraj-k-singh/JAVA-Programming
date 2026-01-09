/*
WAP: Moves Zeroes BF
Date: 10-Jan-2026
*/

public class MovesZeroesBF {
    public static int[] moves(int[] arr){
        int[] temp = new int[arr.length];
        int index = 0;

        //create array and store all non zeroes values
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                temp[index++] = arr[i];
            }
        }

        //copy back to main array
        for(int i=0; i<arr.length; i++){
            arr[i] = temp[i];
        }

        return arr;
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int[] result = moves(arr);

        for(int x: result){
            System.out.print(x+ " ");
        }
    }
}
