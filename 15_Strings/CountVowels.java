/*
WAP: Count Vowels
Date: 02-Sep-2026
*/

public class CountVowels {
    public static void main(String[] args){
        String str = "Yuvraj Kumar Singh";

        int count = countVowels(str);
        System.out.println("Total vowels in "+str+" is: "+count);
    }

    private static int countVowels(String str){
        int cnt = 0;
        for(int i=0; i<str.length(); i++){
            char ch = str.charAt(i);

            if(ch=='A' || ch=='E' || ch=='I' || ch=='O' || ch=='U' || ch=='a' || ch=='e'
                    || ch=='i' || ch=='o' || ch=='u'){
                cnt++;
            }
        }
        return cnt;
    }
}
