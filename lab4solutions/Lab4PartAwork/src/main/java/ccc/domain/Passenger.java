package ccc.domain;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
public class Passenger {
    @Id
    @GeneratedValue
    private Long id;
    private  String name;

    @OneToMany(cascade = CascadeType.PERSIST,
                fetch=FetchType.EAGER)
    @JoinColumn(name="rel_passenger_is")
    @OrderColumn(name="flightsequence_id")
    List<Flight> flightlist =new ArrayList<Flight>();


    public Passenger() {
    }

    public Passenger(String name) {
        this.name = name;
    }
    public boolean addFlight(Flight flight) {
        return flightlist.add(flight);
    }

    public Long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Passenger{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", flightlist=" + flightlist +
                '}';
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Flight> getFlightlist() {
        return flightlist;
    }

    public void setFlightlist(List<Flight> flightlist) {
        this.flightlist = flightlist;
    }
}
