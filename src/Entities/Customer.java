package Entities;

public class Customer extends Person{
    String email;
    public Customer() {
        
    }

    public Customer(String email) {
        this.email = email;
    }

    public Customer(int id, int age, String firstname, String lastName, String email) {
        super(id, age, firstname, lastName);
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
