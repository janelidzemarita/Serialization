import java.io.Serializable;
import java.util.Date;

public class Student extends Person implements Serializable {
    private int course;
    private University university;
    private double gpa;

    public Student(String firstName, String lastName, Date birthdate,
                   Address address, int course, University university) {
        super(firstName, lastName, birthdate, address);
        this.course = course;
        this.university = university;
    }

    @Override
    public String toString() {
        return "Student{" +
                "course=" + course +
                ", university=" + university +
                '}';
    }
}
