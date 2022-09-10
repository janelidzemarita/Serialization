import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class SomeMethods implements java.io.Serializable {

    public static void main(String[] args){
        copyObject();
    }

    public static Person copyObject(){
        Address adr = new Address("Georgia", "Kutaisi", "Zastava");
        University uni = new University("TBC_Academy", adr);
        Date s = new Date();
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("f.txt"))) {
            // Creating the object
            Student s1 = new Student("Marita", "Janelidze", s, adr, 3, uni);
            Person p1 = new Person("Marita1", "Janelidze1", s, adr);
//             writing the object
            out.writeObject(s1);
            out.writeObject(p1);
            System.out.println("success");
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Opps!");
        }

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("f.txt"))) {
            // Creating the object
            Student s1 = (Student) in.readObject();
            Person p1 = (Person) in.readObject();
            System.out.println("Student: " + s1 + " Person: " + p1);
        } catch (Exception e) {
            System.err.println(e.getMessage());
            System.err.println("Oh NO!");
        }
        return null;
    }
}
