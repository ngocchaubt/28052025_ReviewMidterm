package com.btnc.reiviewmidterm.models;

public class Product {
    private int ID;
    private String ProductCode;
    private String ProductName;
    private double UnitPrice;
    private String ImageLink;


    public Product(int ID, String productCode, String productName, double unitPrice, String imageLink) {
        this.ID = ID;
        ProductCode = productCode;
        ProductName = productName;
        UnitPrice = unitPrice;
        ImageLink = imageLink;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getProductCode() {
        return ProductCode;
    }

    public void setProductCode(String productCode) {
        ProductCode = productCode;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public double getUnitPrice() {
        return UnitPrice;
    }

    public void setUnitPrice(double unitPrice) {
        UnitPrice = unitPrice;
    }

    public String getImageLink() {
        return ImageLink;
    }

    public void setImageLink(String imageLink) {
        ImageLink = imageLink;
    }
}
