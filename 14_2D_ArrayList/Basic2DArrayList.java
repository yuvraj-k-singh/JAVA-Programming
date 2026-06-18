/*
WAP: Basic 2D ArrayList
Date: 18-June-2026
*/

import java.util.ArrayList;

public class Basic2DArrayList {
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> arr = new ArrayList<>();

        //1. Add
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        arr.add(new ArrayList<>());
        System.out.println("ADD element: ");
        System.out.println(arr);

        arr.get(0).add(19); arr.get(0).add(1); arr.get(0).add(10);
        arr.get(1).add(10);
        arr.get(2).add(100);  arr.get(2).add(100);  arr.get(2).add(100);  arr.get(2).add(100);  arr.get(2).add(100);

        //2. remove
        arr.get(1).remove(0);
        System.out.println("\nRemove element: ");
        System.out.println(arr);

        //3. set
        arr.get(2).set(2,200);
        System.out.println("\nSet element: ");
        System.out.println(arr);

        //4. Row & Column size
        System.out.println("\nSize row and column: ");
        System.out.println(arr.size());
        System.out.println(arr.get(2).size());

        //5.Contain element
        System.out.println("\nContain Element: ");
        System.out.println(arr.get(0).contains(100));
    }
}
