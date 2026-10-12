package tn.esprit.snoussi_taha_yassine.web.controllers;

import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import tn.esprit.snoussi_taha_yassine.entities.Reservation;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IReservationService;

import java.util.Set;

@RestController
@AllArgsConstructor
@RequestMapping("/Reservation")

public class ReservationController {
    IReservationService Reservationservice;


    // http://localhost:8089/Reservation/retrieve-all-Reservations
    @GetMapping("/retrieve-all-Reservations")
    public Set<Reservation> getReservations(){
        return Reservationservice.retrieveAllReservations();
    }

    // http://localhost:8089/Reservation/retrieve-Reservation/8
    @GetMapping("/retrieve-Reservation/{Reservation-id}")
    public Reservation retrieveReservation(@PathVariable("Reservation-id") Long ReservationId){
        return Reservationservice.retrieveReservation(ReservationId);
    }

    // http://localhost:8089/Reservation/add-Reservation
    @PostMapping("/add-Reservation")
    public Reservation addReservation(@RequestBody Reservation a){
        return Reservationservice.addReservation(a);
    }

    // http://localhost:8089/Reservation/remove-Reservation/{Reservation-id}
    @DeleteMapping("/remove-Reservation/{Reservation-id}")
    public void deleteReservation(@PathVariable("Reservation-id") Long ReservationId){
        Reservationservice.removeReservation(ReservationId);
    }

    // http://localhost:8089/Reservation/modify-Reservation
    @PutMapping("/modify-Reservation")
    public Reservation modifyReservation(@RequestBody Reservation a) {
        return Reservationservice.modifyReservation(a);
    }



}
