package tn.esprit.autoloc.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import tn.esprit.autoloc.enumerations.CategorieVehicule;
import tn.esprit.autoloc.enumerations.StatutVehicule;

import java.math.BigDecimal;
import java.util.HashSet;
import java.util.Set;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class Vehicule {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long idVehicule;
    String immatriculation;
    String marque;
    String modele;
    @Enumerated(EnumType.STRING)
    CategorieVehicule categorie;
    @Enumerated(EnumType.STRING)
    StatutVehicule statut;
    BigDecimal tarifJournalier;
    @ManyToOne(fetch = FetchType.LAZY)
    private Agence agence;

    @ManyToMany(fetch = FetchType.LAZY)
    private Set<Equipement> equipements = new HashSet<>();

}
