package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;

public class ReservationService implements IReservationService{
    ReservationRepository reservationrepo ;
    @Override
    public Reservation AddReservation(Reservation reservation) {
        return reservationrepo.save(reservation);
    }

    @Override
    public Reservation Updateeservation(Reservation reservation) {
        return reservationrepo.save(reservation);
    }

    @Override
    public void deleteReservation(Long idReservation) {
        reservationrepo.deleteById(idReservation);

    }

    @Override
    public List<Reservation> FindAll() {
        return reservationrepo.findAll();
    }
}
