
import java.util.*;
class Student {
    String name, id;
    int age;
    Student(String id, String name, int age) {
        this.id = id; this.name = name; this.age = age;
    }
}

public class StudentManagement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Student> list = new ArrayList<>();
        while (true) {
            System.out.println("\n1. Add  2. View  3. Search  4. Exit");
            int ch = sc.nextInt(); sc.nextLine();
            if (ch == 1) {
                System.out.print("Enter ID, Name, Age: ");
                list.add(new Student(sc.next(), sc.next(), sc.nextInt()));
            } else if (ch == 2) {
                for (Student s : list)
                    System.out.println(s.id + " " + s.name + " " + s.age);
            } else if (ch == 3) {
                System.out.print("Enter ID to search: ");
                String id = sc.next();
                list.stream().filter(s -> s.id.equals(id))
                    .forEach(s -> System.out.println("Found: " + s.name));
            } else break;
        }
    }
}
