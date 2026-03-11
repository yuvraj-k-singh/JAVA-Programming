/*
WAP: Final Variable
Date: 11-Mar-2026
*/

package FinalKeyword;

public class FinalVariable {
    public static void main(String[] args){
        A a1 = new A(2, 4);
        double area = a1.area();

        System.out.println("Area is: "+area);
    }
}

class A{
    int length;
    int breadth;
    final double PI = 3.14;

    A(int length, int breadth){
        this.length = length;
        this.breadth = breadth;
    }

    double area(){
        return PI*length*breadth;
    }
}
