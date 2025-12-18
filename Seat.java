// Represents a seat in a classroom. Each seat has a row and a column.

public class Seat {

    // instance vars

    int row;
    int col;

    Student studentInSeat;

    // constructor:

    public Seat(int row, int col) {
        this.row = row;
        this.col = col;
    }

    public void putStudentInSeat(Student student) {
        this.studentInSeat = student;
    }


    // returns student location details
    public String toString() {
        return this.row + ", " + this.col + ": " + this.studentInSeat;
    }

}
