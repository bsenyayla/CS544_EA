package partb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Customer {
    @Id
    @GeneratedValue
    private Long id;

    private String firstname;
    private String lastname;


    @ManyToOne(cascade= CascadeType.PERSIST)
    private  Address address;


    @OneToMany(cascade=CascadeType.PERSIST,
               mappedBy = "customer")
    private List<Order> orderList=new ArrayList<Order>();



    public Customer() {
    }

    public Customer(String firstname, String lastname) {
        this.firstname = firstname;
        this.lastname = lastname;
    }
}