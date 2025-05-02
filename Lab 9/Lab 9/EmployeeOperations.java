import java.util.*;

class Employee {
    String name;
    int id;
    double salary;

    Employee(String name, int id, double salary) {
        this.name = name;
        this.id = id;
        this.salary = salary;
    }

    public String toString() {
        return "Name: " + name + ", ID: " + id + ", Salary: " + salary;
    }
}

public class EmployeeOperations {
    public static void main(String[] args) {
        ArrayList<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Aman", 1, 50000));
        employees.add(new Employee("Varchasv", 2, 60000));
        employees.add(new Employee("Sourabh", 3, 55000));

        // Update salary of employee with ID 2
        for (Employee emp : employees) {
            if (emp.id == 2) {
                emp.salary = 65000;
            }
        }

        // Remove employee with ID 1
        employees.removeIf(emp -> emp.id == 1);

        // Print remaining employees
        for (Employee emp : employees) {
            System.out.println(emp);
        }
    }
}