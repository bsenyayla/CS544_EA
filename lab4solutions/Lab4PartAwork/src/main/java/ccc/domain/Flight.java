package ccc.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Flight {
    @Id
    @GeneratedValue
    private  Long id;

    private  Integer flightnumber;
    @Column(name = "origin")
    private String from;
    @Column(name = "destination")
    private String to;
    private Date date;

    public Flight() {

    }

    public Flight(Integer flightnumber, String from, String to, Date date) {
        this.flightnumber = flightnumber;
        this.from = from;
        this.to = to;
        this.date = date;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Integer getFlightnumber() {
        return flightnumber;
    }

    public void setFlightnumber(Integer flightnumber) {
        this.flightnumber = flightnumber;
    }

    public String getFrom() {
        return from;
    }

    public void setFrom(String from) {
        this.from = from;
    }

    public String getTo() {
        return to;
    }

    public void setTo(String to) {
        this.to = to;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Flight{" +
                "id=" + id +
                ", flightnumber=" + flightnumber +
                ", from='" + from + '\'' +
                ", to='" + to + '\'' +
                ", date=" + date +
                '}';
    }
}
