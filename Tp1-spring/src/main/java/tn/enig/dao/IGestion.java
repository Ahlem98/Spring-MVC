package tn.enig.dao;

import tn.enig.model.Projet;
import tn.enig.model.departement;
import tn.enig.model.employe;

import java.util.List;

public interface IGestion {
	public List<departement> getAllDepartment();

	public void addProjet(Projet c);
	public void addEmployee(employe v);
	public List<Projet> getProjectByID(int id);
	public List<employe> getEmployeByID(int id);
	public List<employe> getEmployeByIDepar(int id);
    public departement getDepartbyID(int id);
	public Projet getProjetbyID(int id);



}
