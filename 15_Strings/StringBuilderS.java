/*
WAP: StringBuilder and Methods
Date: 03-Sep-2026
*/

public class StringBuilderS {
    public static void main(String[] args){
        StringBuilder sb = new StringBuilder("Yuvraj");

        //Methods

        //1. Length
        System.out.println("1. Length: "+sb.length());

        //2. charAt
        System.out.println("2. Character at 3 index: "+sb.charAt(3));

        //3. set Character
        sb.setCharAt(0, 'P');
        System.out.println("3.Set character at 0 index: "+sb);

        //4. delete Character
        System.out.println("4. Delete character at 2 index: "+sb.deleteCharAt(2));

        //5. Insert
        sb.insert(2, 'v');
        System.out.println("5. Insert v at 2 index: "+sb);
        sb.insert(6, " Kumar");
        System.out.println("5. Insert Kumar in last: "+sb);

        //6. Append
        sb.append(" Singh");
        System.out.println("6. Append Singh: "+sb);

        //7. Delete
        sb.delete(6, sb.length());
        System.out.println("7. Delete char from 6 to last: "+sb);

        //8. Reverse
        sb.reverse();
        System.out.println("8. Reverse string: "+sb);
    }
}
