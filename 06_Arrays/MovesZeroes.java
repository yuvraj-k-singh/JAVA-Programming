/*
WAP: Moves Zeroes
Date: 10-Jan-2026
*/

public class MovesZeroes {
    public static int[] moves(int[] nums){
        int nonZero = 0;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 0) {
                int temp = nums[nonZero];
                nums[nonZero] = nums[i];
                nums[i] = temp;
                nonZero++;
            }
        }
        return nums;
    }

    public static void main(String[] args){
        int[] arr = {0,1,0,3,12};
        int[] result = moves(arr);

        for(int x: result){
            System.out.print(x+ " ");
        }
    }
}
