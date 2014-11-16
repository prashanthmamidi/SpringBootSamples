package demo.controller;

import demo.repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by mamidi on 16/11/2014.
 */
@Controller
public class ReservationMvcController {

    @Autowired
    private ReservationRepository reservationRepository;

    @RequestMapping("/reserved.php")
    String reservations( Model model) {
        model.addAttribute("reservations", reservationRepository.findAll());
        return "reservations";
    }

}
