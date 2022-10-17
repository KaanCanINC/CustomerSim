package Entities;
public class Person {
    private int id;
    private int age;
    private String firstname;
    private String lastName;

    public Person(){
        
    }
    
    public Person(int id, int age, String firstname, String lastName) {
        this.id = id;
        this.age = age;
        this.firstname = firstname;
        this.lastName = lastName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public String getFirstname() {
        return firstname;
    }
    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }
    public String getLastName() {
        return lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
}
