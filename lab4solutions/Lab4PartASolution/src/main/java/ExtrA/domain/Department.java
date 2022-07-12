package ExtrA.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

@Entity
public class Department {
    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @OneToMany(cascade = CascadeType.PERSIST,
            mappedBy = "department",
            fetch =FetchType.EAGER
                )
    private List<Employee> employeeList=new ArrayList<Employee>();
}
