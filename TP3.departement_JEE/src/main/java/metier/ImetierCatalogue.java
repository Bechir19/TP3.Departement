package metier;

import java.util.List;

public interface ImetierCatalogue {
	public List<Departement> getDepartementParMotCle(String mc);
	public void addDepartement(Departement p);

}
