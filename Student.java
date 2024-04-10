import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private int grade;
    private List<String> courses;

    // Constructor
    public Student(String name, int grade) {
        this.name = name;
        this.grade = grade;
        this.courses = new ArrayList<>();
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for grade attribute
    public int getGrade() {
        return grade;
    }

    // Method to add a course
    public void addCourse(String course) {
        courses.add(course);
        System.out.println("Course added: " + course);
    }

    // Method to remove a course
    public void removeCourse(String course) {
        if (courses.remove(course)) {
            System.out.println("Course removed: " + course);
        } else {
            System.out.println("Course not found.");
        }
    }

    public static void main(String[] args) {
        // Create a student
        Student student = new Student("John Doe", 10);

        // Display student details
        System.out.println("Student Details:");
        System.out.println("Name: " + student.getName());
        System.out.println("Grade: " + student.getGrade());

        // Add courses
        student.addCourse("Math");
        student.addCourse("Science");
        student.addCourse("English");

        // Remove a course
        student.removeCourse("Science");

        // Display remaining courses
        System.out.println("Remaining Courses:");
        for (String course : student.courses) {
            System.out.println(course);
        }
    }
}
