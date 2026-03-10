/*
WAP: StudentClass
Date: 10-Mar-2026
*/

package ClassObjects;

public class StudentClass {
    public static void main(String[] args){
        Student s1 = new Student();
        s1.setData("Yuvraj", 89, "IIST");
        s1.display();
    }
}

class Student{
    String name;
    int rollNo;
    String collegeName;

    void setData(String n, int rno, String cname){
        name = n;
        rollNo = rno;
        collegeName = cname;
    }

    void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student RollNo: "+rollNo);
        System.out.println("College name: "+collegeName);
    }
}
