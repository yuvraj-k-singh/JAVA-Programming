/*
WAP: Deep Copy
Date: 22-Apr-2026
*/

public class DeepCopy {
    public static void main(String[] args) {
        Employee s1 = new Employee("Yuvraj", 89);
        s1.print();
        Employee s2 = new Employee(s1);
        s2.ID = 99;
        s2.print();
    }
}

class Employee{
    String name;
    int ID;

    Employee(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    Employee(Employee e){
        this.name = e.name;
        this.ID = e.ID;
    }

    void print(){
        System.out.println(name + " , "+ID);
    }
}
