/*
WAP: Copy Constructor
Date: 11-Mar-2026
*/

package Constructor;

public class CopyConstructor {
    public static void main(String[] args){

    }
}

class Student {
    int marks;
    String name;
    Student(int marks, String name){
        this.name = name;
        this.marks = marks;
    }

    Student(Student obj){

    }
}
