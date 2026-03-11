/*
WAP: Static Method
Date: 11-Mar-2026
*/

package StaticKeyword;

public class StaticMethod {
    public static void main(String[] args) {
        Animal myAnimal = new Animal("Dog");
        Animal.legs = 4;
        Animal.increment();
        Animal.increment();
        myAnimal.display();
        Animal.increment();
        Animal.displayCount();
    }
}

class Animal{
    String type;
    static int legs;
    static int animalCount = 0;

    Animal(String type){
        this.type = type;
    }

    static void increment(){
        animalCount++;
    }

    static void displayCount(){
        System.out.println();
        System.out.println("Animal count: "+animalCount);
    }

    void display(){
        System.out.println();
        System.out.println("Animal type: "+type);
        System.out.println("Animal legs: "+legs);
        System.out.println("Animal count: "+animalCount);
    }
}
