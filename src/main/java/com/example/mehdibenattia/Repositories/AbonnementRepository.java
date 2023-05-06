package com.example.mehdibenattia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Abonnement;
import com.example.mehdibenattia.entities.TypeAbonnement;
import java.time.LocalDate;
import java.util.List;
public interface AbonnementRepository extends JpaRepository<Abonnement,Long > {
    List<Abonnement> findByTypeAbonOrderByDateDebut(TypeAbonnement typeAbonnement);
    List<Abonnement> findAbonnementByDateDebutAndDateFin(LocalDate startDate, LocalDate endDate);
}
