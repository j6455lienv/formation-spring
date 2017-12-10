package com.ipiecoles.formation.tpspring.service;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.model.User;
import com.ipiecoles.formation.tpspring.repository.UserRepository;

import java.util.List;

public class RecommandationService {

	private FilmService filmService;
	private UserRepository userRepository;

	public Film getRecommandation(Long idUser) {
		User user = userRepository.findById(idUser);
		for (Film film : user.getFilmsAVoir()) {
			return film;
		}
		List<Film> nouveautes = filmService.findNouveautesParType(user.getType());
		for (Film film : nouveautes ) {
			if(!user.getDejaVus().contains(film)) {
				return film;
			}
		}
		return null;
	}

	public void setFilmService(FilmService filmService) {
		this.filmService = filmService;
	}

	public void setUserRepository(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
}
