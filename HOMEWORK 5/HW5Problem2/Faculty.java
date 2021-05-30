public class Faculty extends Employee {
    private String officeHours;
    private String rank;

    Faculty(String name) {
        super(name);
    }

    Faculty(String name, String officeHours, String rank) {
        super(name);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    Faculty(String name, String address, String phone, String email, double salary, String office, int experience,
            String officeHours, String rank) {
        super(name, address, phone, email, salary, office, experience);
        this.officeHours = officeHours;
        this.rank = rank;
    }

    public String getOfficeHours() {
        return officeHours;
    }

    public void setOfficeHours(String officeHours) {
        this.officeHours = officeHours;
    }

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String toString() {
        return getName() + " is under class: " + getClass().getName();
    }

}