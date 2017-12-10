package com.ipiecoles.formation.tpspring;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.repository.FilmRepository;
import com.ipiecoles.formation.tpspring.repository.UserRepository;
import com.ipiecoles.formation.tpspring.service.FilmService;
import com.ipiecoles.formation.tpspring.service.RecommandationService;

public class SansSpring {
	public static void main(String... args) {
		RecommandationService recommandationService = null;//to complete
		Film recommandation = recommandationService.getRecommandation(1L);
		System.out.println(recommandation);
	}
}
