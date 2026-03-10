/*
WAP: This Keyword
Date: 10-Mar-2026
*/

package Constructor;

public class ThisKeyword {
    public static void main(String[] args) {
       student s1 = new student("Yuvraj", 89, "IIST", 90.65);
       s1.display();
       student s2 = new student("Anish", 05, "IIST", 91.70);
       s2.display();
    }
}

class  student{
    String name;
    int id;
    String collegeName;
    double marks;

    student(String name, int id, String collegeName, double marks){
        this.name = name;
        this.collegeName = collegeName;
        this.id = id;
        this.marks = marks;
    }

    void display(){
        System.out.println("\nStudent Details-");
        System.out.println("Student name: "+name);
        System.out.println("College Name: "+collegeName);
        System.out.println("Student ID: "+id);
        System.out.println("Student Marks: "+marks);
    }
}
