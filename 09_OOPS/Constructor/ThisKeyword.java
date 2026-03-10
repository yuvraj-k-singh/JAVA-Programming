/*
WAP: This Keyword
Date: 11-Mar-2026
*/

package Constructor;

public class ThisKeyword {
    public static void main(String[] args) {
       Student s1 = new Student("Yuvraj", 89, "IIST", 90.65);
       s1.display();
       Student s2 = new Student("Anish", 05, "IIST", 91.70);
       s2.display();
    }
}

class Student {
    String name;
    int id;
    String collegeName;
    double marks;

    Student(String name, int id, String collegeName, double marks){
        this.name = name;
        this.collegeName = collegeName;
        this.id = id;
        this.marks = marks;
    }

    void display(){
        System.out.println("\nStudent Details-");
        System.out.println("Student name: "+name);
        System.out.println("Student Name: "+collegeName);
        System.out.println("Student ID: "+id);
        System.out.println("Student Marks: "+marks);
    }
}
