package ExtrA.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Employee {
    @Id
    @GeneratedValue
    private Long employeenumber;

    private String name;

    @ManyToOne(cascade= CascadeType.PERSIST,
                        fetch = FetchType.EAGER
    )
    private Department department;
}
