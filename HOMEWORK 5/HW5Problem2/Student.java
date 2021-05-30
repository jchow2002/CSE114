public class Student extends Person {

    static final String status0 = "Freshman";
    static final String status1 = "Sophomore";
    static final String status2 = "Junior";
    static final String status3 = "Senior";

    private String status;

    Student(String name) {
        super(name);
    }

    Student(String name, String status) {
        super(name);
        this.status = status;
    }

    Student(String name, String address, String phone, String email, String status) {
        super(name, address, phone, email);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    public String toString() {
        return getName() + " is under class: " + getClass().getName();
    }

}
