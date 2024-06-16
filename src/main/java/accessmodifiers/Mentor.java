package accessmodifiers;

public class Mentor {
    public static void main(String[] args) {
        Student shm = new Student();
        shm.name = "Shubham"; //public
        shm.age = 24; //protected
        shm.email = "shubhi@gmail.com";//default
        //shm.psp = 10.23; //private , so cannot be accessed though it is in the same package



    }
}
