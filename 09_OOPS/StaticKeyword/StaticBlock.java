/*
WAP: Static Block
Date: 11-Mar-2026
*/

package StaticKeyword;

public class StaticBlock {
    public static void main(String[] args){
        Dog mydog = new Dog("Neon", "lebra");
        mydog.display();
    }
}

class Dog{
    String name;
    String type;
    static int legs;
    static int tail;

    Dog(String name, String type){
        this.name = name;
        this.type = type;
    }

    static{
        legs = 4;
        tail = 1;
    }

    void display(){
        System.out.println();
        System.out.println("Dog name: "+name);
        System.out.println("Dog type: "+type);
        System.out.println("Dog legs: "+legs);
        System.out.println("Dog tail: "+tail);
    }
}
