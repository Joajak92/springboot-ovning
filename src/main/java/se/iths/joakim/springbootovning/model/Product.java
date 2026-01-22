package se.iths.joakim.springbootovning.model;

public class Product {
    private String name;
    private double price;
    private String descrpition;

    public Product(String name, double price, String descrpition) {
        this.name = name;
        this.price = price;
        this.descrpition = descrpition;
    }

    public Product() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getDescrpition() {
        return descrpition;
    }

    public void setDescrpition(String descrpition) {
        this.descrpition = descrpition;
    }
}
