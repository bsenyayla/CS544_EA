package partb.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Product {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    private String description;
    private double price;

    public Product() {
    }

    public Product(String name, String description, double price) {
        this.name = name;
        this.description = description;
        this.price = price;
    }


}