package partb.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
@Table(name="order_table")

/*
* @Table(name="order_table")
* */
public class Order {
    @Id
    @GeneratedValue
    private Long id;

    private String ordernr;
    private String date;
    private String status;

    @OneToMany(cascade = CascadeType.PERSIST,
               fetch = FetchType.EAGER
                )
    //@JoinColumn(name="")
    private Collection<OrderLine> orderlines=new ArrayList<OrderLine>();
    //private List<OrderLine> orderLineList=new ArrayList<OrderLine>();

     @ManyToOne(cascade = CascadeType.PERSIST)
     private Customer customer;


    public Order() {
    }

    public Order(String ordernr, String date, String status) {
        this.ordernr = ordernr;
        this.date = date;
        this.status = status;
    }
}
