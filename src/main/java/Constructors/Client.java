package Constructors;

public class Client {

    public static void main(String[] args) {

        Mentor m = new Mentor(); //Since in the mentor class we didn't mentioned any function, this is a default constructor because we are able to create object
        System.out.println(m.name);
        System.out.println(m.age);
        System.out.println(m.gender);
        System.out.println(m.rating);

        Mentor m2 = new Mentor("Shubham" , "Male");
        System.out.println(m2.name);
        System.out.println(m2.age);
        System.out.println(m2.gender);
        System.out.println(m2.rating);


        Mentor m3 = new Mentor(24 , 4.2);
        System.out.println(m3.name);
        System.out.println(m3.age);
        System.out.println(m3.gender);
        System.out.println(m3.rating);


    }
}
