package tn.enig.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import tn.enig.model.Projet;
import tn.enig.model.departement;
import tn.enig.model.employe;
import tn.enig.service.ILocationService;

@Controller
public class AppLocation {

	@Autowired
	ILocationService service;
	
	public void setService(ILocationService service) {
		this.service = service;
	}
	
	@GetMapping("/home")
	public String getAllDepartment(Model m) {
		List<departement> liste= service.getAllDepartment();
		m.addAttribute("liste",liste);
		return "home";		
	}
	@RequestMapping(value = "/employes/proj/{num}", method = RequestMethod.GET)
	public String getProjetByDeparID(Model m, @PathVariable("num") int num) {
		List<employe>list=service.getEmployeByID(num);
		m.addAttribute("list",list);
		return "/employe";

	}
	@RequestMapping(value = "/employes/dept/{num}", method = RequestMethod.GET)
	public String getemployeeByDeparID(Model m, @PathVariable("num") int num) {
		List<employe>list=service.getEmployeByIDepar(num);
		m.addAttribute("list",list);
		return "/employe";

	}
	@RequestMapping(value = "/projets/{num}", method = RequestMethod.GET)
	public String getProjetsByID(Model m, @PathVariable("num") int num) {
		List<Projet>list=service.getProjectByID(num);
		m.addAttribute("list",list);
		return "/projet";

	}
	@RequestMapping(value="/ajoutProjet", method = RequestMethod.GET)
	public String addProjet(Model model) {
		Projet projet = new Projet() ;
		List<departement> listD = service.getAllDepartment();
		model.addAttribute("projet", projet);
		model.addAttribute("departements", listD);
		return ("addprojet");
	}
	@RequestMapping(value="/saveProjet", method = RequestMethod.POST)
	public String saveProjet(Model model, @ModelAttribute("projet") Projet p) {
		service.addProjet(p);
		return ("redirect:/home");
	}
	@RequestMapping(value="/ajoutEmploye", method = RequestMethod.GET)
	public String addEmploye(Model model) {
		employe employee = new employe();
		List<departement> listd = service.getAllDepartment();
		List<Projet> listp = service.ge();
		model.addAttribute("projets", listp);
		model.addAttribute("departements", listd);
		model.addAttribute("employe", employee);
		return ("addemploye");
	}
	@RequestMapping(value="saveEmploye", method = RequestMethod.POST)
	public String saveEmploye(Model model, @ModelAttribute("employe") employe e) {
		service.addEmployee(e);
		return ("redirect:/home");
	}
	}
