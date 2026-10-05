package tn.esprit.autoloc.service;

import tn.esprit.autoloc.entities.Reservation;

import java.util.List;

public interface IReservationService {
    Reservation AddReservation (Reservation reservation);
    Reservation Updateeservation (Reservation reservation);
    void deleteReservation(Long idReservation);
    List<Reservation> FindAll ();
}
