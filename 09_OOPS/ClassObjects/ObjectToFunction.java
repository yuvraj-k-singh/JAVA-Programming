/*
WAP: Pass Object To Function
Date: 10-Mar-2026
*/

package ClassObjects;

public class ObjectToFunction {
    public static void display(Animal a){
        System.out.println("Animal name: "+a.name);
        System.out.println("Total Legs: "+a.legs);
    }

    public static void main(String[] args){
        Animal a1 = new Animal();
        a1.setData("DOG", 4);

        Animal a2 = new Animal();
        a2.setData("CAT", 4);

        display(a2);
    }
}

class Animal{
    String name;
    int legs;

    void setData(String n, int l){
        name = n;
        legs = l;
    }
}