package tn.esprit.snoussi_taha_yassine.service.impl;

import org.springframework.stereotype.Service;
import tn.esprit.snoussi_taha_yassine.entities.Reservation;
import tn.esprit.snoussi_taha_yassine.repository.ReservationRepository;
import tn.esprit.snoussi_taha_yassine.service.interfaces.IReservationService;

import java.util.HashSet;
import java.util.Set;

@Service
public class ReservationServiceImpl implements IReservationService {

    ReservationRepository ReservationRepository;

    @Override
    public Set<Reservation> retrieveAllReservations(){
        return new HashSet<>(ReservationRepository.findAll());
    };

    @Override
    public Reservation retrieveReservation(Long ReservationId){
        return ReservationRepository.findById(ReservationId).get();
    };


    @Override
    public Reservation addReservation(Reservation Reservation){
        return ReservationRepository.save(Reservation);
    };


    @Override
    public void removeReservation(Long ReservationId){
        ReservationRepository.deleteById(ReservationId);
    };


    @Override
    public Reservation modifyReservation(Reservation Reservation){
        return ReservationRepository.save(Reservation);
    };

}
