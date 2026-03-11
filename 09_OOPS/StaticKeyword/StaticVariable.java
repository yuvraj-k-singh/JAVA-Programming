/*
WAP: Static variable
Date: 11-Mar-2026
*/

package StaticKeyword;

public class StaticVariable {
    public static void main(String[] args){
        Cat mycat = new Cat("Laila", 8);
        Cat.legs = 4;
        mycat.display();

        Cat cat2 = new Cat("Neon", 5);
        cat2.display();
    }
}

class Cat{
    String name;
    int age;
    static int legs;

    Cat(String name, int age){
        this.name = name;
        this.age = age;
    }

    void display(){
        System.out.println();
        System.out.println("Cat name: "+name);
        System.out.println("Cat age: "+age);
        System.out.println("Cat legs: "+legs);
    }
}
