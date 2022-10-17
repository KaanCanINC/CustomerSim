package Entities;

public class Employee extends Person{
    double salary;
    
    public Employee() {

    }

    public Employee(double salary) {
        this.salary = salary;
    }

    public Employee(int id, int age, String firstname, String lastName, double salary) {
        super(id, age, firstname, lastName);
        this.salary = salary;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
