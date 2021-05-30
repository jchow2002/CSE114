// Jacky Chow CSE114 HW5 Problem2
public class testprogram {
    public static void main(String[] args) {

        Person person = new Person("Joe");
        Student student = new Student("Tom", Student.status0);
        Employee employee = new Employee("Tracy", 100000, "Admin", 5);
        Faculty faculty = new Faculty("Praveen", "1-2 pm", "Professor");
        Staff staff = new Staff("Marisa", "Janitor");

        System.out.println(person.toString());
        System.out.println(student.toString());
        System.out.println(employee.toString());
        System.out.println(faculty.toString());
        System.out.println(staff.toString());

    }
}
