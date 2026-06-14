

public class ReverseRow {
    public static void main(String[] args){
        int[][] arr = {{1,2,3},{4,5,6},{7,8,9}};

        for(int i=0; i<arr.length; i++){
            for(int j=0, k=arr[0].length-1; j<k; j++, k--){
                int temp = arr[i][j];
                arr[i][j] = arr[i][k];
                arr[i][k] = temp;
            }
        }

        System.out.println("Reversed row Matrix: ");
        for(int[] brr : arr){
            for(int x: brr){
                System.out.print(x+" ");
            }
            System.out.println();
        }
    }
}
