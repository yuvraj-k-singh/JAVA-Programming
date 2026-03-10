/*
WAP: Copy Constructor
Date: 11-Mar-2026
*/

package Constructor;

public class CopyConstructor {
    public static void main(String[] args) {
        Teacher s1 = new Teacher("Yuvraj", 89);
        s1.display();
        Teacher s2 = new Teacher(s1);
        s2.display();
    }
}

class Teacher {
    String name;
    int marks;

    Teacher(String name, int marks){
        this.name = name;
        this.marks = marks;
    }

    Teacher(Teacher obj){
        name = obj.name;
        marks = obj.marks;
    }

    void display(){
        System.out.println("\n--------Teacher Details---------");
        System.out.println("Teacher name: "+name);
        System.out.println("Teacher marks: "+marks);
    }
}
