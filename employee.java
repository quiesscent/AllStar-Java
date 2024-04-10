import java.time.LocalDate;
import java.time.Period;

public class employee {
    private String name;
    private double salary;
    private LocalDate hireDate;

    // Constructor
    public Employee(String name, double salary, LocalDate hireDate) {
        this.name = name;
        this.salary = salary;
        this.hireDate = hireDate;
    }

    // Getter for name attribute
    public String getName() {
        return name;
    }

    // Getter for salary attribute
    public double getSalary() {
        return salary;
    }

    // Getter for hireDate attribute
    public LocalDate getHireDate() {
        return hireDate;
    }

    // Method to calculate years of service
    public int calculateYearsOfService() {
        LocalDate currentDate = LocalDate.now();
        Period period = Period.between(hireDate, currentDate);
        return period.getYears();
    }

    public static void main(String[] args) {
        // Create an employee
        LocalDate hireDate = LocalDate.of(2010, 7, 15); // Assuming hire date is 15th July 2010
        Employee employee = new Employee("John Doe", 60000.0, hireDate);

        // Display employee details
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: " + employee.getSalary());
        System.out.println("Hire Date: " + employee.getHireDate());

        // Calculate and display years of service
        int yearsOfService = employee.calculateYearsOfService();
        System.out.println("Years of Service: " + yearsOfService);
    }
}
