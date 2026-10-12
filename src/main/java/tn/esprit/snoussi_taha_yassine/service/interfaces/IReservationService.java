package tn.esprit.snoussi_taha_yassine.service.interfaces;


import tn.esprit.snoussi_taha_yassine.entities.Reservation;

import java.util.Set;

public interface IReservationService {
    public Set<Reservation> retrieveAllReservations();
    public Reservation retrieveReservation(Long ReservationId);
    public Reservation addReservation(Reservation c);
    public void removeReservation(Long ReservationId);
    public Reservation modifyReservation(Reservation Reservation);
}
