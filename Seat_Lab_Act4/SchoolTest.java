
public class SchoolTest {
    public static void main(String[] args) {
        // Create a Student object with name, ID, and grade level
        Student student = new Student("kyle", 101, "1st Grade");
        System.out.println("Student Details:");
        student.displayInfo(); // Display student details

        // Create a Teacher object with name, ID, and subject
        Teacher teacher = new Teacher("Mr. majon", 201, "Mathematics");
        System.out.println("\nTeacher Details:");
        teacher.displayInfo(); // Display teacher details

        // Create a Staff object with name, ID, and department
        Staff staff = new Staff("Mrs. kirbs", 301, "Administration");
        System.out.println("\nStaff Details:");
        staff.displayInfo(); // Display staff details
    }
}