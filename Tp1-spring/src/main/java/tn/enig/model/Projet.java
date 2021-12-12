package tn.enig.model;

public class Projet {
    int id;
    String titre;
    String etat;
    departement departement;
    public Projet(int id, String titre, String etat) {
        this.id = id;
        this.titre = titre;
        this.etat = etat;
    }

    public Projet() {
    }

    public Projet(int id, String titre, String etat, tn.enig.model.departement departement) {
        this.id = id;
        this.titre = titre;
        this.etat = etat;
        this.departement = departement;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public String getEtat() {
        return etat;
    }

    public void setEtat(String etat) {
        this.etat = etat;
    }

    public tn.enig.model.departement getDepartement() {
        return departement;
    }

    public void setDepartement(tn.enig.model.departement departement) {
        this.departement = departement;
    }
}
