package com.example.mehdibenattia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Piste;

public interface PisteRepository extends JpaRepository<Piste,Long > {
}
