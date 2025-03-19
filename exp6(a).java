import java.util.*;

class Employee {
    String name;
    int age;
    double salary;

    public Employee(String name, int age, double salary) {
        this.name = name;
        this.age = age;
        this.salary = salary;
    }

    
    public String toString() {
        return "Employee{name='" + name + "', age=" + age + ", salary=" + salary + "}";
    }
}

public class EmployeeSorter {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>();
        employees.add(new Employee("Rahul", 30, 60000));
        employees.add(new Employee("Abhishek", 25, 50000));
        employees.add(new Employee("Sarthak", 35, 70000));
        employees.add(new Employee("Danish", 40, 65000));
        
        employees.sort(Comparator.comparing(e -> e.name));
        System.out.println("Sorted by name:");
        employees.forEach(System.out::println);
        
        employees.sort(Comparator.comparingInt(e -> e.age));
        System.out.println("\nSorted by age:");
        employees.forEach(System.out::println);
        
        employees.sort(Comparator.comparingDouble(e -> e.salary));
        System.out.println("\nSorted by salary:");
        employees.forEach(System.out::println);
    }
}

