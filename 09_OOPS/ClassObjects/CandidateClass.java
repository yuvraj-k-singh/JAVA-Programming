/*
WAP: Student Candidate
Date: 10-Mar-2026
*/

package ClassObjects;

public class CandidateClass {
    public static void main(String[] args){
        StudentCandidate s1 = new StudentCandidate();
        s1.setData(89, "Yuvraj", 98.65);
        s1.display();
    }
}

class StudentCandidate{
    int rollNo;
    String name;
    double score;
    String remark;

    void setData(int rno, String n, double m){
        rollNo = rno;
        name = n;
        score = m;
        getRemark();
    }

    void getRemark(){
        if(score >= 50){
            remark = "Selected";
        }else if(score < 50){
            remark = "Not Selected";
        }else{
            remark = "NULL";
        }
    }

    void display(){
        System.out.println("Student name: "+name);
        System.out.println("Student Roll No: "+rollNo);
        System.out.println("Student Score: "+score);
        System.out.println("Student Remark: "+remark);
    }
}
