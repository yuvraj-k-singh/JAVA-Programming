/*
WAP: Direct Initialize 2D ArrayList
Date: 18-June-2026
*/

import java.util.ArrayList;
import java.util.Arrays;

public class DirectInitialize {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>(
                Arrays.asList(
                        new ArrayList<>(Arrays.asList(1,11,4,2)),
                        new ArrayList<>(Arrays.asList(13)),
                        new ArrayList<>(Arrays.asList(19,5,3,5,4,3,2)),
                        new ArrayList<>(Arrays.asList(10,3,2,1))
                )
        );

        System.out.println(arr);
    }
}
