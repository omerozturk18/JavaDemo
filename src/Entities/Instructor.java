package Entities;

public class Instructor extends User{

    private String department;
    private double salary;

    public Instructor(int id, String firstName, String lastName, String email, String password, String department, double salary) {
        super(id, firstName, lastName, email, password);
        this.department = department;
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }
}
