package models;

public class Student extends Person {
    private double gpa;


    public Student(String name, String surname) {
        super(name, surname);
        this.gpa = 0.0;
    }

    public Student(String name, String surname, double gpa) {
        super(name,surname);
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    @Override
    public String getPosition() {
        return "Student";
    }

    @Override
    public String toString() {
        return "Student" + super.toString();
    }

    @Override
    public double getPaymentAmount() {
        return gpa > 2.67 ? 36660.00 : 0.0;
    }


}
