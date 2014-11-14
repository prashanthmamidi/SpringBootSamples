package demo.repository;

import demo.model.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.Collection;

/**
 * Created by mamidi on 14/11/2014.
 */
@RepositoryRestResource(path = "reservations")
public interface ReservationRepository extends JpaRepository<Reservation, Long> {

    //select * from reservations where reservation_name = :name

    Collection<Reservation> findByReservationName(@Param("name") String name);


}