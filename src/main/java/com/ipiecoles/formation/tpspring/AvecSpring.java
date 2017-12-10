package com.ipiecoles.formation.tpspring;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.ipiecoles.formation.tpspring.model.Film;
import com.ipiecoles.formation.tpspring.service.RecommandationService;

public class AvecSpring {
	public static void main(String... args) {
		ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml");
		RecommandationService recommandationService = applicationContext.getBean(RecommandationService.class);
		Film recommandation = recommandationService.getRecommandation(1L);
		System.out.println(recommandation);
		applicationContext.close();
	}
}
