package com.ipiecoles.formation.tpspring.model;

public class Film {

	private String titre;
	private Type type;

	public String getTitre() {
		return titre;
	}

	public void setTitre(String titre) {
		this.titre = titre;
	}

	public Type getType() {
		return type;
	}

	public void setType(Type type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return titre;
	}
}
