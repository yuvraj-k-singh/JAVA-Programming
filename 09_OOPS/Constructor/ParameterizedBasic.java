/*
WAP: Parameterized Constructor Basic
Date: 10-Mar-2026
*/

package Constructor;

public class ParameterizedBasic {
    public static void main(String[] args) {
        parameterized p1 = new parameterized(112);
        p1.display();
    }
}

class parameterized{
    int id;
    parameterized(int i){
        id = i;
    }

    void display(){
        System.out.println("ID: "+id);
    }
}
