/*
WAP: Strings Functions
Date: 07-july-2026
*/

public class StringsFunctions {
    public static void main(String[] args){
        String name = "Yuvraj Kumar Singh";
        String str = "  Yuvraj   kumar singh";
        String test  = "Test";

        //1. str length
        System.out.println("1. Length: "+name.length());

        //2. str equals
        System.out.println("2. Is equal(case sensitive): "+name.equals(str));

        //3. str euqlasIgnoreCase
        System.out.println("3. Is equal(Ignore Case): "+name.equalsIgnoreCase(str));

        //4. LowerCase
        System.out.println("4. LowerCase: "+name.toLowerCase());

        //5. UpperCase
        System.out.println("5. UpperCase: "+name.toUpperCase());

        //6. Character
        System.out.println("6. Character at 2: "+str.charAt(5));

        //7. Remove space (trim)
        System.out.println("7. Remove space: "+str.trim());

        //8. Contains word
        System.out.println("8. Contains Yuvraj: "+str.contains("Yuvraj"));

        //9. Index of char
        System.out.println("9. Index of Y: "+name.indexOf("Y"));

        //10. Is empty
        System.out.println("10. Is empty: "+str.isEmpty());

        //11. Is blank
        System.out.println("11. Is blank: "+str.isBlank());

        //12. Replace
        System.out.println("12. Replace space with no space: "+str.replace(" ", ""));

        //13. Concat
        System.out.println("13. Concat: "+name.concat(" ").concat(test));

        //14. Split
        String[] str1 = name.split(" ");
        System.out.println("14. Split with space: ");
        for(String x: str1) System.out.println(x);

        //15. To char array
        char[] ch = name.toCharArray();
        System.out.println("15. To char array: ");
        for(char c: ch) System.out.print(c+" ");

        //16. Substring
        System.out.println("\n16. Substring: "+name.substring(5, 13));
    }
}
