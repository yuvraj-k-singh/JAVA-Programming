/*
WAP: Shallow Copy
Date: 22-Apr-2026
*/

public class ShallowCopy {
    public static void main(String[] args) {
        Manager m1 = new Manager("Yuvraj", 89);
        m1.print();
        Manager m2 = m1;
        m2.print();
        m2.ID = 72;
        m1.print();
    }
}

class Manager{
    String name;
    int ID;

    Manager(String name, int ID){
        this.name = name;
        this.ID = ID;
    }

    void print(){
        System.out.println(name + " , "+ID);
    }
}
