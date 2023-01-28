package bank.domain;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import javax.persistence.*;

@Entity
public class Customer implements Serializable {
	@Id
	@GeneratedValue
	private long customerNumber;
	private String name;
	private String email;

	@OneToMany(mappedBy="customerNumber")
	private Collection<Reservation> reservationlist=new ArrayList<Reservation>();


	public Customer() {
	}

	public Customer(String name, String email) {
		this.name = name;
		this.email = email;
	}


/*
	@OneToMany(
			mappedBy = "customer"	)
	private Collection<Borrowing> borrowinglist=new ArrayList<Borrowing>();
*/

	public Collection<Reservation> getReservationlist() {
		return reservationlist;
	}

	public void setReservationlist(Collection<Reservation> reservationlist) {
		this.reservationlist = reservationlist;
	}

	public void AddReservation(Reservation reservation) {
		this.reservationlist.add(reservation);
	}



	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getCustomerNumber() {
		return customerNumber;
	}

	public void setCustomerNumber(long customerNumber) {
		this.customerNumber = customerNumber;
	}
	/*


            public Collection<Borrowing> getBorrowinglist() {
                return borrowinglist;
            }

            public void setBorrowinglist(Collection<Borrowing> borrowinglist) {
                this.borrowinglist = borrowinglist;
            }
        */
	@Override
	public String toString() {
		return "Customer{" +
				"customerNumber=" + customerNumber +
				", name='" + name + '\'' +
				", email='" + email + '\'' +
				", reservationlist=" + reservationlist +
				//", borrowinglist=" + borrowinglist +
				'}';
	}
}
