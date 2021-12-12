package tn.enig.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tn.enig.dao.IGestion;
import tn.enig.model.Projet;
import tn.enig.model.departement;
import tn.enig.model.employe;

@Service
public class LocationService implements ILocationService {
	
	@Autowired
	IGestion dao;
	
	public void setDao(IGestion dao) {
		this.dao = dao;
	}


	@Override
	public void addProjet(Projet c) {
          dao.addProjet(c);
	}

	@Override
	public void addEmployee(employe v) {
dao.addEmployee(v);
	}

	@Override
	public List<Projet> getProjectByID(int id) {
		return dao.getProjectByID(id);
	}

	@Override
	public List<employe> getEmployeByID(int id) {
		return dao.getEmployeByID(id);
	}

	@Override
	public List<employe> getEmployeByIDepar(int id) {
		return dao.getEmployeByIDepar(id);
	}

	@Override
	public departement getDepartbyID(int id) {
		return dao.getDepartbyID(id);
	}

	@Override
	public Projet getProjetbyID(int id) {
		return dao.getProjetbyID(id);
	}

	@Override
	public List<departement> getAllDepartment() {
		return dao.getAllDepartment();
	}

}
