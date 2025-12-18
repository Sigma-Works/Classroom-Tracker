// This class represents a classroom with students

import java.util.ArrayList;

public class Classroom {

    // instance vars
    String buildingName;
    String roomName;
    ArrayList<Student> students;

    Seat[][] seats;

    public Classroom(String buildingName, String roomName, int rows, int cols) {
        this.buildingName = buildingName;
        this.roomName = roomName;
        this.seats = new Seat[rows][cols];

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                seats[i][j] = new Seat(i, j);
            }
        }

        this.students = new ArrayList<Student>();
    }

    public void addStudent(Student student) {
        this.students.add(student);
    }

    public void assignStudentASeat(Student student) {
        int rows = this.seats.length;
        int cols = this.seats[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (this.seats[i][j].studentInSeat == null) {
                    this.seats[i][j].putStudentInSeat(student);
                    return;
                }
            }
        }
    }

    public void printAllStudents() {
        System.out.println("Students in class: ");
        for (Student student : this.students) {
            System.out.println(student);
        }
    }

    public String toString() {
        String s = "\n";
        int rows = this.seats.length;
        int cols = this.seats[0].length;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                s+= this.seats[i][j] + "\t";
            }
            s+= "\n";
        }
        return s;
    }

    public static void main(String[] args) {

        // Making the classroom
        Classroom huntsman = new Classroom("HH" , "105", 10, 5);


        // Making two students
        Student bob = new Student("bob", "roberts");
        Student ali = new Student("ali", "ali");


        // Adding the students to the classroom
        huntsman.addStudent(bob);
        huntsman.addStudent(ali);

        // Assigning students their seats in the classroom
        huntsman.assignStudentASeat(bob);
        huntsman.assignStudentASeat(ali);


        // printing out details of the classroom
        huntsman.printAllStudents();

        System.out.println(huntsman);

    }

}


