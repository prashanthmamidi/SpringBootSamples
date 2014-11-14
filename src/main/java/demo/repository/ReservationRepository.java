package demo.repository;

import demo.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Collection;

/**
 * Created by mamidi on 14/11/2014.
 */
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    //select * from reservations where reservation_name = :name
    Collection<Reservation> findByReservationName(String name);

}