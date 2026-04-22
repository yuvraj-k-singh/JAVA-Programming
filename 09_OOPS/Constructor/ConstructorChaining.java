/*
WAP: Constructor Chaining
Date: 11-Mar-2026
*/

public class ConstructorChaining {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.print();

        /*
        Student s2 = new Student("Yuvraj");
        s2.print();
        Student s3 = new Student("Yuvraj", 89);
        s3.print();
        */
    }
}

class Student{
    String name;
    int rollNo;
    double marks;

    /*
    Method - 1
    Student(){
        this("Unknown", 0 , 0.00);
    }

    Student(String name){
        this(name, 0 , 0.00);
    }

    Student(String name, int rollNo){
        this(name, rollNo , 0.00);
    }

    Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
    }
    */

    Student(){
        this("Unknown");
        System.out.println("First");
    }

    Student(String name){
        this(name, 0);
        System.out.println("Second");
    }

    Student(String name, int rollNo){
        this(name, rollNo , 0.00);
        System.out.println("Third");
    }

    Student(String name, int rollNo, double marks){
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
        System.out.println("Fourth");
    }

    void print(){
        System.out.println(name + " , " + rollNo + " , " + marks);
    }
}
