package bank.domain;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Borrowing {
/*
*
Borrowing functionality.
A customer can checkout books from the library
A customer can return books to the library
A customer can have a maximum of 4 books at home at the same time (this number is configurable).
Books can be checked out for a maximum of 3 weeks (this number is configurable).
For every day that a book is returned too late, the customer needs to pay a fee of 50 cents per day
(this amount is configurable).
The system keeps track of the outstanding (unpaid) fees for customers.
Customers can pay their fees to the librarian. The librarian will enter all payments into the system.
We can retrieve the following information:
- Get all data from a customer(including checked-out books, returned books, current fee
balance, payments made)
- Get all books that are currently borrowed and are returned too late.
* */
    @Id
    @GeneratedValue
    private long id;

   // @ManyToOne(cascade={CascadeType.ALL})
   // @JoinColumn(name="customerNumber")
    //Customer borrowingCustomer;

    Date startDate;
    Date retunDate;
    int delayDay;
    double delayDebt;
    double paid;
    double remaininDebt;

    public Borrowing() {
    }

    public Borrowing(Customer borrowingCustomer, Date startDate, Date retunDate, int delayDay, double delayDebt, double paid, double remaininDebt) {
        //this.borrowingCustomer = borrowingCustomer;
        this.startDate = startDate;
        this.retunDate = retunDate;
        this.delayDay = delayDay;
        this.delayDebt = delayDebt;
        this.paid = paid;
        this.remaininDebt = remaininDebt;
    }

    public long getId() {
        return id;
    }

    @Override
    public String toString() {
        return "Borrowing{" +
                "id=" + id +
               // ", borrowingCustomer=" + borrowingCustomer +
                ", startDate=" + startDate +
                ", retunDate=" + retunDate +
                ", delayDay=" + delayDay +
                ", delayDebt=" + delayDebt +
                ", paid=" + paid +
                ", remaininDebt=" + remaininDebt +
                '}';
    }





    public Date getStartDate() {
        return startDate;
    }

    public void setStartDate(Date startDate) {
        this.startDate = startDate;
    }

    public Date getRetunDate() {
        return retunDate;
    }

    public void setRetunDate(Date retunDate) {
        this.retunDate = retunDate;
    }

    public int getDelayDay() {
        return delayDay;
    }

    public void setDelayDay(int delayDay) {
        this.delayDay = delayDay;
    }

    public double getDelayDebt() {
        return delayDebt;
    }

    public void setDelayDebt(double delayDebt) {
        this.delayDebt = delayDebt;
    }

    public double getPaid() {
        return paid;
    }

    public void setPaid(double paid) {
        this.paid = paid;
    }

    public double getRemaininDebt() {
        return remaininDebt;
    }

    public void setRemaininDebt(double remaininDebt) {
        this.remaininDebt = remaininDebt;
    }
}
