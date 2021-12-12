package tn.enig.model;

import java.util.ArrayList;
import java.util.List;

public class departement {
    int id;
    String nom;

    public departement(int id, String nom) {
        this.id = id;
        this.nom = nom;
    }

    public departement() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
