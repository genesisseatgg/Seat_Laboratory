public class Staff extends Person {
    private String department;

    // Constructor to initialize name, id, and department
    public Staff(String name, int id, String department) {
        super(name, id); // Call the parent constructor
        this.department = department;
    }

    // Getter and Setter for department
    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    // Override displayInfo to include department
    @Override
    public void displayInfo() {
        super.displayInfo(); // Call the parent displayInfo
        System.out.println("Department: " + department);
    }
}