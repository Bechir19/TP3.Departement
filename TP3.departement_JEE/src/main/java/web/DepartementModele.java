package web;

import java.util.ArrayList;
import java.util.List;

import metier.Departement;

public class DepartementModele {
	private String motCle;
	List<Departement> Departements = new ArrayList<>();
	public String getMotCle() {
		return motCle;
	}
	public void setMotCle(String motCle) {
		this.motCle = motCle;
	}
	public List<Departement> getDepartements() {
		return Departements;
	}
	public void setDepartements(List<Departement> departements) {
		Departements = departements;
	}


}
