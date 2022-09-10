import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.Date;

public class Person implements Serializable {
    private String firstName, lastName;

    private java.util.Date birthdate;
    private transient Address address;

    public Person(String firstName, String lastName, Date birthdate, Address address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdate = birthdate;
        this.address = address;
    }

    private void writeObject(ObjectOutputStream ois) throws IOException {
        ois.defaultWriteObject();
    }
    private void readObject(ObjectInputStream ois) throws IOException, ClassNotFoundException {
        ois.defaultReadObject();
//        this.fullName = firstName + " " + lastName;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthdate=" + birthdate +
                ", address=" + address +
                '}';
    }
}
