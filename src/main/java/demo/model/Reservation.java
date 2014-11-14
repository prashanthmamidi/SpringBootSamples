package demo.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

/**
 * Created by mamidi on 14/11/2014.
 */
@Entity
public class Reservation {

    @Id
    @GeneratedValue
    private Long id;

    public String getReservationName() {
        return reservationName;
    }

    private String reservationName;

    Reservation() {
    }

    Reservation(String reservationName) {
        this.reservationName = reservationName;
    }

    public Long getId() {
        return id;
    }



    @Override
    public String toString() {
        return "Reservation{" +
                "id=" + id +
                ", reservationName='" + reservationName + '\'' +
                '}';
    }
}
