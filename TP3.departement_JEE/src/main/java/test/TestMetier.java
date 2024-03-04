package test;

import java.util.List;

import metier.Departement;
import metier.MetierImpl;

public class TestMetier {

	public static void main(String[] args) {
		MetierImpl metier= new MetierImpl();
		List<Departement> Depa = metier.getDepartementParMotCle("informatique");
		for (Departement p : Depa)
		System.out.println(p.getNOM_departement());
		}
	

}

