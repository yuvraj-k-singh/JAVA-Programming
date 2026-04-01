/*
WAP: Basic HashSet
Date: 01-Apr-2026
*/

import java.util.HashSet;
public class BasicHashSet {
    public static void main(String[] args){
        HashSet<Integer> set = new HashSet<>();

        //1. Insertion
        set.add(1);
        set.add(10);
        set.add(0);
        set.add(10);    //duplicates are not allowed
        set.add(11);
        set.add(50);

        //2. size
        System.out.print("Size: "+set.size());

        //3. Print
        System.out.println();
        System.out.println("\nSet elements: ");
        for(int x : set) System.out.print(x+" ");

        //4. Delete
        set.remove(10);
        System.out.println();
        System.out.println("\nSet elements: ");
        for(int x : set) System.out.print(x+" ");

        //5. Search
        System.out.println("\n");
        System.out.println(set.contains(11));
        System.out.print(set.contains(10));
    }
}
