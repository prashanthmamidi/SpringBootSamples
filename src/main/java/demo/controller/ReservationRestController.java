package demo.controller;

import demo.model.Reservation;
import demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collection;
import java.util.List;

/**
 * Created by mamidi on 14/11/2014.
 */
@RestController
public class ReservationRestController {
    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping("/reservation")
    Collection<Reservation> reservations() {
        return reservationRepository.findAll();

    }
}
