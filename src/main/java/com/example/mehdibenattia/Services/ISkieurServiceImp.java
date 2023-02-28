package com.example.mehdibenattia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mehdibenattia.Repositories.AbonnementRepository;
import com.example.mehdibenattia.Repositories.PisteRepository;
import com.example.mehdibenattia.Repositories.SkieurRepository;
import com.example.mehdibenattia.entities.Abonnement;
import com.example.mehdibenattia.entities.Piste;
import com.example.mehdibenattia.entities.Skieur;

import java.util.List;

@Service
public class ISkieurServiceImp implements ISkieurService{

   @Autowired
    SkieurRepository skieurRepository;
   @Autowired
    PisteRepository pisteRepository;
    @Autowired
    AbonnementRepository abonnementRepository;
    @Override
    public List<Skieur> retrieveAllSkieurs() {
        return skieurRepository.findAll();
    }

    @Override
    public Skieur addSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public Skieur updateSkieur(Skieur skieur) {
        return skieurRepository.save(skieur);
    }

    @Override
    public void removeSkieur(Long numSkieur) {
    skieurRepository.deleteById(numSkieur);
    }

    @Override
    public Skieur retrieveSkieur(Long numSkieur) {
        return skieurRepository.findById(numSkieur).orElse(null);
    }
    @Override
    public Skieur assignSkierToPiste(Long numSkieur, Long numPiste){
        //récupération des données
        Skieur skieur= skieurRepository.findById(numSkieur).orElse(null);
        Piste piste= pisteRepository.findById(numPiste).orElse(null);
        if(skieur !=null && piste !=null){
            //traitement
            List<Piste>pistes=skieur.getPistes();
            piste.getSkieurs().add(skieur);
            pisteRepository.save(piste);
            skieur.setPistes(pistes);
        }

        return skieurRepository.findById(numSkieur).orElse(null);
    }
    @Override
    public Skieur AssignSkierToSubscription(long numSkieur, long numAbon){
        Skieur skieur= skieurRepository.findById(numSkieur).orElse(null);
        Abonnement abonnement= abonnementRepository.findById(numAbon).orElse(null);
        if(skieur !=null && abonnement !=null){
            //traitement
            skieur.setAbonnement(abonnement);
            skieurRepository.save(skieur);

        }
        return null;
    }

}
