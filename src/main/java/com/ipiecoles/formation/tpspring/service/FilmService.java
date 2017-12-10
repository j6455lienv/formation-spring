package com.ipiecoles.formation.tpspring.service;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.model.Type;
import com.ipiecoles.formation.tpspring.repository.FilmRepository;

import java.util.List;

public class FilmService {

    private FilmRepository filmRepository;

    public List<Film> findNouveautesParType(Type type) {
        return filmRepository.findParType(type);
    }

    public void setFilmRepository(FilmRepository filmRepository) {
        this.filmRepository = filmRepository;
    }


}
