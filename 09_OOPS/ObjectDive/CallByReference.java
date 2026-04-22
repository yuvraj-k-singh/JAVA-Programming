/*
WAP: Call By Reference
Date: 22-Apr-2026
*/

public class CallByReference {
    public static void main(String[] args){
        Demo d1 = new Demo(2, 5);
        d1.print();
        addTen(d1);
        d1.print();
    }

    public static void addTen(Demo d){
        d.x += 10;
        d.y += 10;
    }
}

class Demo{
    int x;
    int y;

    Demo(int x, int y){
        this.x = x;
        this.y = y;
    }

    void print(){
        System.out.println(x + " , "+y);
    }
}
