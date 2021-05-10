package entities.concretes;

import entities.abstracts.Entity;

public class Product implements Entity {
    private int id;
    private int categoryId;
    private String name;
    private double unitPrice;
    private int unitInStock;

    public Product() {}

    public Product(int id, int categoryId, String name, double unitPrice, int unitInStock) {
        this.setId(id);
        this.setCategoryId(categoryId);
        this.setName(name);
        this.setUnitPrice(unitPrice);
        this.setUnitInStock(unitInStock);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(int categoryId) {
        this.categoryId = categoryId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    public int getUnitInStock() {
        return unitInStock;
    }

    public void setUnitInStock(int unitInStock) {
        this.unitInStock = unitInStock;
    }
}
