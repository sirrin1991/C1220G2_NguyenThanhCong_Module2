package _17_binary_file_and_serialization.bai_tap.product_manager;

import java.io.Serializable;

public class Product implements Serializable {
    private String productCode;
    private String productName;
    private String factory;
    private float price;
    private String color;

    public Product(String productCode, String productName, String factory, float price, String color) {
        this.productCode = productCode;
        this.productName = productName;
        this.factory = factory;
        this.price = price;
        this.color = color;
    }

    public Product() {

    }

    public String getProductCode() {
        return productCode;
    }

    public void setProductCode(String productCode) {
        this.productCode = productCode;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public String getFactory() {
        return factory;
    }

    public void setFactory(String factory) {
        this.factory = factory;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productCode='" + productCode + '\'' +
                ", productName='" + productName + '\'' +
                ", factory='" + factory + '\'' +
                ", price=" + price +
                ", color='" + color + '\'' +
                '}';
    }

    public String getProductInformation() {
        return productCode + "," + productName + "," + factory + "," + price + "," + color;
    }
}
