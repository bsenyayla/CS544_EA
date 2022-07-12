package partb.domain;

import javax.persistence.*;

@Entity
public class OrderLine {
    @Id
    @GeneratedValue
    private Long id;

    private int quantity;

    //@JoinColumn(cascade={CascadeType.PERSIST})
    @OneToOne(cascade=CascadeType.PERSIST)
    private Product product;


    @ManyToOne(cascade = CascadeType.PERSIST,
                fetch = FetchType.LAZY)
    private Order order;
}
