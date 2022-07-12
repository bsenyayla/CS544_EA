package ddd.domain;

import javax.persistence.*;
import java.util.HashMap;
import java.util.Map;

@Entity
public class School {
    @Id
    @GeneratedValue
    private Long id;

    private String name;
    @OneToMany(cascade = CascadeType.PERSIST,
               fetch=FetchType.EAGER)
    @JoinColumn(name="rel_student_id")
    @MapKey(name="studentid")
    private Map<Long,Student> studentMap=new HashMap<Long,Student>();

/*
	@OneToMany(cascade = CascadeType.PERSIST, fetch = FetchType.EAGER)
	@JoinColumn(name = "student")
	@MapKey(name = "studentid")
	Map<Long, Student> studentmap = new HashMap<Long, Student>();
* */
}
