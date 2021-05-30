public class Employee extends Person {
    private double salary;
    private String office;
    private int experience;

    Employee(String name) {
        super(name);
    }

    Employee(String name, double salary, String office, int experience) {
        super(name);
        this.salary = salary;
        this.office = office;
        this.experience = experience;
    }

    Employee(String name, String address, String phone, String email, double salary, String office, int experience) {
        super(name, address, phone, email);
        this.salary = salary;
        this.office = office;
        this.experience = experience;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getOffice() {
        return office;
    }

    public void setOffice(String office) {
        this.office = office;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String toString() {
        return getName() + " is under class: " + getClass().getName();
    }

}
