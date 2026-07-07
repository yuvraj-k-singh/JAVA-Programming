/*
WAP: Strings Access Characters
Date: 07-july-2026
*/

public class AccessCharacters {
    public static void main(String[] args){
        String name = "Yuvraj Kumar Singh";

        System.out.println("Each Character inside String: ");
        for(int i=0; i<name.length(); i++){
            System.out.print(name.charAt(i)+" ");
        }
    }
}
