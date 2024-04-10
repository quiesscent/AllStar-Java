public class Employee {
    private String name;
    private String jobTitle;
    private double salary;

    // Constructor
    public Employee(String name, String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for jobTitle attribute
    public String getJobTitle() {
        return jobTitle;
    }

    // Getter for salary attribute
    public double getSalary() {
        return salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12;
    }

    // Method to update salary
    public void updateSalary(double newSalary) {
        salary = newSalary;
        System.out.println("Salary updated for " + name + ": " + salary);
    }

    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John Doe", "Software Engineer", 60000.0);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Job Title: " + employee.getJobTitle());
        System.out.println("Salary: " + employee.getSalary());

        // Calculate and display annual salary
        System.out.println("Annual Salary: " + employee.calculateAnnualSalary());

        // Update salary and display updated salary
        employee.updateSalary(65000.0);
    }
}
