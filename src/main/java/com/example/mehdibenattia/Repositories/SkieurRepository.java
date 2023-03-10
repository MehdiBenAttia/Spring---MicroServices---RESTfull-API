package com.example.mehdibenattia.Repositories;

import com.example.mehdibenattia.entities.TypeAbonnement;
import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Skieur;

import java.util.List;

public interface SkieurRepository extends JpaRepository<Skieur,Long> {

    List<Skieur> findSkieurByAbonnement_TypeAbon(TypeAbonnement typeAbonnement);

}
