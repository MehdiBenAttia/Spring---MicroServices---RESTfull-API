package com.example.mehdibenattia.Services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.example.mehdibenattia.Repositories.CoursRepository;
import com.example.mehdibenattia.entities.Cours;

import java.util.List;
import java.util.Optional;

@Service
public class ICoursServiceImp implements ICoursService{

    @Autowired
    CoursRepository coursRepository;
    @Override
    public List<Cours> retrieveAllCours() {
        return  coursRepository.findAll();
    }

    @Override
    public Cours addCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Cours updateCours(Cours cours) {
        return coursRepository.save(cours);    }

    @Override
    public Optional<Cours> retrieveCours(Long numCours) {
        return coursRepository.findById(numCours);
    }

    @Override
    public void removeCours(Long numCours) {
        coursRepository.deleteById(numCours);
    }
}
