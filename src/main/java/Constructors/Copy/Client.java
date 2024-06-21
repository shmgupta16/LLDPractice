package Constructors.Copy;

public class Client {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Shubham";
        s1.emailId = "shubham@gmail.com";
        s1.psp = 78.2;

        //Our requirement is to create a diff object s2 with same values of s1
        Student s2 = new Student(s1);

        Student s3 = s1;
        //here s3 and s1 will refer to same address
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
    }

}
