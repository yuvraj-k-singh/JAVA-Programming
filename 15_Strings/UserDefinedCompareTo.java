/*
WAP: User Defined Compare To
Date: 23-july-2026
*/

public class UserDefinedCompareTo {
    public static void main(String[] args){
        String s1 = "harshita";
        String s2 = "harsh";

        int ans = compareTo(s1, s2);

        System.out.println(ans);
        System.out.println(s1.compareTo(s2));
    }

    public static int compareTo(String s1, String s2){
        int i=0, j=0;
        while(i<s1.length() && j<s2.length()){
            char ch1 = s1.charAt(i), ch2 = s2.charAt(j);
            if((int)ch1 == (int)ch2){
                i++;
                j++;
            }else{
                return ((int)ch1 - (int)ch2);
            }
        }

        return (s1.length() - s2.length());
    }
}
