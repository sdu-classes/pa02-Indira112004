import java.util.Scanner;
import java.util.Stack;

public class Main1 {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter name: ");
        String name = sc.next();

        System.out.println("Enter address: ");
        String address = sc.next();

        Person person = new Person(name, address);
        Student student = new Student(person.getName(), person.getAddress(), "", 1, 0.1 );
        System.out.println("Enter program: ");
        student.setProgram(sc.next());
        System.out.println("Enter year: ");
        student.setYear(sc.nextInt());
        System.out.println("Enter fee: ");
        student.setFee(sc.nextDouble());
        System.out.println(student);
        Staff staff= new Staff(person.getName(), person.getAddress(), "", 0.1 );
        System.out.println("Enter school: ");
        staff.setSchool(sc.next());
        System.out.println("Enter pay: ");
        staff.setPay(sc.nextDouble());
        System.out.println(staff.toString());
    }
}
