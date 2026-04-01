import java.util.HashSet;

public class DistinctElements {
    public static void main(String[] args) {
        int[] arr = {1,1,4,2,4,3,5,6};

        int size = distinctElement(arr);

        System.out.println("The total distinct Elements: "+size);
    }

    public static int distinctElement(int[] arr){
        HashSet<Integer> set = new HashSet<>();

        for(int x : arr) set.add(x);
        return set.size();
    }
}
