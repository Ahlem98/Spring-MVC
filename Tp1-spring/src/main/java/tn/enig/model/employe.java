package tn.enig.model;

public class employe {
    private int id;
    private String nom;
    private String fonction;
    private Projet projet;
    private departement departement;
    public employe(int id, String nom, Projet projet) {
        this.id = id;
        this.nom = nom;
        this.projet = projet;
    }

    public employe() {
    }

    public employe(int id, String nom, String fonction, Projet projet, tn.enig.model.departement departement) {
        this.id = id;
        this.nom = nom;
        this.fonction = fonction;
        this.projet = projet;
        this.departement = departement;
    }

    public employe(int id, String nom, Projet projet, tn.enig.model.departement departement) {
        this.id = id;
        this.nom = nom;
        this.projet = projet;
        this.departement = departement;
    }

    public employe(int id, String nom) {
        this.id = id;
        this.nom = nom;
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

    public Projet getProjet() {
        return projet;
    }

    public void setProjet(Projet projet) {
        this.projet = projet;
    }

    public String getFonction() {
        return fonction;
    }

    public void setFonction(String fonction) {
        this.fonction = fonction;
    }

    public tn.enig.model.departement getDepartement() {
        return departement;
    }

    public void setDepartement(tn.enig.model.departement departement) {
        this.departement = departement;
    }
}
