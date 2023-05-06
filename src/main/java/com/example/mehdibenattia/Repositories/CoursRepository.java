package com.example.mehdibenattia.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.mehdibenattia.entities.Cours;
import org.springframework.data.jpa.repository.Query;

import java.util.Set;

public interface CoursRepository extends JpaRepository<Cours,Long > {

    @Query(value = "SELECT * " +
            "FROM cours c" +
            "ORDER BY (SELECT COUNT * FROM inscription i WHERE i.cours_num_cours = c.num_cours)", nativeQuery = true)
    Set<Cours> getAllOrderByInscriptionNumberSQL();
    @Query(value = "SELECT c FROM Cours c ORDER BY c.inscriptions.size")
    Set<Cours> getAllOrderByInscriptionNumberJPQL();
}
