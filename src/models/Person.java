package models;

public abstract class Person implements Payable, Comparable <Payable> {


    private final int id;
    static int id_gen = 1;
    String name;
    String surname;

    public Person(String name, String surname){
       this.name = name;
       this.surname = surname;
       id = ++id_gen;

    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }


    public abstract String getPosition();


    @Override
    public String toString(){
        return id +  " " + name + " " + surname;
    }

    @Override
    public double getPaymentAmount(){
        return 0.0;
    }

    @Override
    public int compareTo(Payable other){
        return Double.compare(this.getPaymentAmount(), other.getPaymentAmount());
    }

}
