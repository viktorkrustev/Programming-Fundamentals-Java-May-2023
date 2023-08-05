import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Students2_06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] command = scanner.nextLine().split(" ");

        List<Student> students = new ArrayList<>();

        while (!command[0].equals("end")) {
            String firstName = command[0];
            String lastName = command[1];
            int age = Integer.parseInt(command[2]);
            String town = command[3];
            if (!isStudentExist(firstName, lastName, age, town, students)) {
                Student student = new Student(firstName, lastName, age, town);
                students.add(student);
            }


            command = scanner.nextLine().split(" ");
        }

        String townForSearch = scanner.nextLine();
        for (Student el : students) {
            if (el.getTown().equals(townForSearch)) {
                System.out.println(el);
            }
        }
    }
    public static boolean isStudentExist(String firstName, String lastName, int age, String town, List<Student> students){
        for (Student el:students){
            if (el.getFirstName().equals(firstName) && el.getLastName().equals(lastName)){
                el.setTown(town);
                el.setAge(age);
                return true;
            }
        }
        return false;
    }
}
class Student{
    private String firstName;
    private String lastName;
    private int age;
    private String town;

    public Student(String firstName, String lastName, int age, String town){
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.town = town;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town) {
        this.town = town;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getFirstName() {
        return firstName;
    }


    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return firstName + " " + lastName + " is " + age + " years old";
    }
}
