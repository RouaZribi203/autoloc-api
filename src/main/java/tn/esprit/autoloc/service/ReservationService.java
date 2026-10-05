package tn.esprit.autoloc.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.entities.Reservation;
import tn.esprit.autoloc.repositories.ReservationRepository;

import java.util.List;
@Service
@AllArgsConstructor

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
