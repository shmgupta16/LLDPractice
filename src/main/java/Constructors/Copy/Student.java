package Constructors.Copy;

public class Student {
    String name;
    double psp;
    String emailId;

    public Student(Student old){
        name=old.name;
        psp=old.psp;
        emailId=old.emailId;
    }

    public Student(){

    }
}
