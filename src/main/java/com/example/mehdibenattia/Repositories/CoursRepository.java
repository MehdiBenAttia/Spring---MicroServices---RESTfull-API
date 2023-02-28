package com.example.mehdibenattia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Cours;

public interface CoursRepository extends JpaRepository<Cours,Long > {
}
