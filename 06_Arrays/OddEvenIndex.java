public class OddEvenIndex {
    public static void  main(String[] args){
        int[] arr = {2,5,6,7,9,3,5};

        System.out.println("Arrays elements are: ");
        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        System.out.println();
        System.out.println("\nArray elements after changes: ");
        for(int i=0; i<arr.length; i++){
            if(i%2==0){
                arr[i] = arr[i] + 10;
            } else arr[i] = arr[i] * 2;

            System.out.print(arr[i] + " ");
        }
    }
}
