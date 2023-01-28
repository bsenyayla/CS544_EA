package bank.domain;
import java.util.*;
import javax.persistence.*;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;

@Entity
public class Reservation {
/*
Reservation functionality:
A customer can reserve multiple books.
When a customer returns a book that is reserved by another customer, then this customer should
receive an email (let the EmailSender just do a System.out.println()).
*/
    @Id
    @GeneratedValue
    private long rezervationId;

    private long bookId;
    private Date reservationDate;
/*
    @ManyToOne
    @JoinColumn(name="cust_id")
    private Customer customer;
*/


    public Reservation() {
    }

    public Reservation(long bookId, Date reservationDate) {
        //this.customer = customer;
        this.bookId = bookId;
        this.reservationDate = reservationDate;
    }



    @Override
    public String toString() {
        return "Reservation{" +
                "rezervationId=" + rezervationId +
               // ", customer=" + customer +
                ", bookId=" + bookId +
                ", reservationDate=" + reservationDate +
                '}';
    }

    public long getRezervationId() {
        return rezervationId;
    }

    public void setRezervationId(long rezervationId) {
        this.rezervationId = rezervationId;
    }
/*
    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }*/

    public long getBookId() {
        return bookId;
    }

    public void setBookId(long bookId) {
        this.bookId = bookId;
    }

    public Date getReservationDate() {
        return reservationDate;
    }

    public void setReservationDate(Date reservationDate) {
        this.reservationDate = reservationDate;
    }
}

