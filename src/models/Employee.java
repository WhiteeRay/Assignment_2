package models;

public class Employee extends Person {
    private String position;
    private double salary;

    public Employee(String name, String surname) {
        super(name, surname);
        this.position = "unknown";
        this.salary = 0.0;

    }

    public Employee(String name, String surname,
                    String position, double salary) {
        super(name, surname);
        this.position = position;
        this.salary = salary;
    }

    public String getPosition() {
        return "Employee";
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    @Override
    public String toString(){
        return "Employee" + super.toString();
    }

    @Override
    public double getPaymentAmount(){
        return salary;
    }
}
