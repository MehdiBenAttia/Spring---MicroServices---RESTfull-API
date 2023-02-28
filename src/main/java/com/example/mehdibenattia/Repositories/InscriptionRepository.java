package com.example.mehdibenattia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Inscription;

public interface InscriptionRepository extends JpaRepository<Inscription,Long > {
}
