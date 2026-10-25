package uk.ac.westminster.products_api;

import com.fasterxml.jackson.annotation.JsonSubTypes;
import com.fasterxml.jackson.annotation.JsonTypeInfo;


@JsonTypeInfo(use = JsonTypeInfo.Id.DEDUCTION)
@JsonSubTypes({
        @JsonSubTypes.Type(DigitalProduct.class),
        @JsonSubTypes.Type(PhysicalProduct.class)
})


public class Product {

    private Long id;
    private String name;
    private double price;

    public Product() {
    }
    public Product(Long id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }
    public Long getId() {
        return id;
    }

    // Tutorial02 - Activity 3: Removing getName() caused the name field to disappear from JSON.
    // Getter restored after testing successfully.

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}