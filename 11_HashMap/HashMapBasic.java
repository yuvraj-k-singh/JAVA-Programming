/*
WAP: Basic HashMap
Date: 02-Apr-2026
*/

import java.util.HashMap;

public class HashMapBasic {
    public static void main(String[] args){
        HashMap<String, Integer> map = new HashMap<>();

        //1. Insert
        map.put("Yuvraj", 89);
        map.put("Shivam", 85);
        map.put("Anish", 90);
        map.put("Yogesh", 95);
        map.put("Vivek", 89);
        map.put("Vikash", 89);

        System.out.println(map);
        System.out.println();

        //2. Updating value
        map.put("Yogesh", 86);
        System.out.println(map);
        System.out.println();

        //3. Length
        System.out.println("Size of map: "+map.size());
        System.out.println();

        //4. Remove
        map.remove("Yogesh");
        System.out.println(map);
        System.out.println();

        //5. SearchKey
        System.out.println(map.containsKey("Yuvraj"));
        System.out.println(map.containsKey("Pari"));
        System.out.println();

        //6. SearchValue
        System.out.println(map.get("Yuvraj"));
        System.out.println(map.get("Pari"));
        System.out.println();

        //7.Iteration
        for(String key : map.keySet()){
            System.out.println(key + " "+map.get(key));
        }
    }
}
