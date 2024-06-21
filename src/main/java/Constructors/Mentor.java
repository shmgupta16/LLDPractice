package Constructors;

public class Mentor {
    String name;
    int age;
    String gender;
    double rating;

    //These are custom constructor
    public Mentor(){

    }

    public Mentor(String inputName , String inputGender){
        name = inputName;
        gender = inputGender;
    }

    public Mentor(int inputAge , double inputRating){
        age = inputAge;
        rating = inputRating;
    }

    /*Note-
    *1. If we hava custom constructor, we cannot have default constructor
    * 2. we can have more than one constructor
    * 3. Constructors don't have a return type.
    * 4. They basically help create objects
    * 5. name should be same as the class name.
    */
}
