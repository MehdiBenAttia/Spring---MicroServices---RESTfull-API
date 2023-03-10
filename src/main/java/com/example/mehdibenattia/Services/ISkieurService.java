package com.example.mehdibenattia.Services;

import com.example.mehdibenattia.entities.Skieur;
import com.example.mehdibenattia.entities.TypeAbonnement;

import java.util.List;

public interface ISkieurService {
    List<Skieur> retrieveAllSkieurs();
    Skieur addSkieur(Skieur skieur);
    Skieur updateSkieur(Skieur skieur);
    void removeSkieur (Long numSkieur);
    Skieur retrieveSkieur (Long numSkieur);

    Skieur assignSkierToPiste(Long numSkieur, Long numPiste);

    Skieur AssignSkierToSubscription(long numSkieur, long numAbon);

    List<Skieur> retrieveSkiersBySubscriptionType(TypeAbonnement typeAbonnement);
}
