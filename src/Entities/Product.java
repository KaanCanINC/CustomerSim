package Entities;

public class Product {
    private int id;
    private String name;
    private String description;
    private String brand;
    private double unitPrice;

    public Product(){
        
    }
    
    public Product(int id, String name, String description, String brand, double unitPrice) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.brand = brand;
        this.unitPrice = unitPrice;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }
    
}
