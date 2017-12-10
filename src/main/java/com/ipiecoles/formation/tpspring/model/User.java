package com.ipiecoles.formation.tpspring.model;

import java.util.*;

public class User {

    private Long id;
    private String login;
    private Type type;
    private Set<Film> filmsAVoir = new HashSet<>();
    private Set<Film> dejaVus = new HashSet<>();

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Set<Film> getFilmsAVoir() {
        return filmsAVoir;
    }

    public void setFilmsAVoir(Set<Film> filmsAVoir) {
        this.filmsAVoir = filmsAVoir;
    }

    public Set<Film> getDejaVus() {
        return dejaVus;
    }

    public void setDejaVus(Set<Film> dejaVus) {
        this.dejaVus = dejaVus;
    }

    @Override
    public String toString() {
        return login;
    }
}
