package com.ipiecoles.formation.tpspring.service;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.model.User;
import com.ipiecoles.formation.tpspring.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RecommandationService {

	@Autowired
	private FilmService filmService;

//	@Autowired
	private UserRepository userRepository = new UserRepository();

	@Autowired
	public RecommandationService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}

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

//	@Autowired
//	public void setFilmService(FilmService filmService) {
//		this.filmService = filmService;
//	}
//
//	@Autowired
//	public void setUserRepository(UserRepository userRepository) {
//		this.userRepository = userRepository;
//	}
}
