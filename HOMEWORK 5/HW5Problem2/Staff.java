public class Staff extends Employee {
    private String title;

    Staff(String name) {
        super(name);
    }

    Staff(String name, String title) {
        super(name);
        this.title = title;
    }

    Staff(String name, String address, String phone, String email, double salary, String office, int experience,
            String title) {
        super(name, address, phone, email, salary, office, experience);
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String toString() {
        return getName() + " is under class: " + getClass().getName();
    }
}
