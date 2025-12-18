// This class represents the attributes of a student such as a name and an ID.

public class Student {

    // instance vars

    String name;
    String ID;


    // Constructor
    public Student (String name, String ID) {
        this.name = name;
        this.ID = ID;

    }

    public String toString() {
        return this.name;
    }
}


