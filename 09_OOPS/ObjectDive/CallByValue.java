/*
WAP: Call By Value
Date: 22-Apr-2026
*/

public class CallByValue {
    public static void main(String[] args){
        int x = 2, y = 4;

        System.out.println(x + " , "+y);
        addTen(x, y);
        System.out.println(x + " , "+y);
    }

    public static void addTen(int x, int y){
        x+=10;
        y+=10;
    }
}
