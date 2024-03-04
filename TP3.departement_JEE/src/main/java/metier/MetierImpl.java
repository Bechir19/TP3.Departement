package metier;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class MetierImpl  implements ImetierCatalogue {
	@Override
	public List<Departement> getDepartementParMotCle(String mc) {
	List<Departement> prods= new ArrayList<Departement>();
	Connection conn=SingletonConnection.getConnection();
	try {

	PreparedStatement ps= conn.prepareStatement("select * from Departement  where NOM_departement LIKE ?");

	ps.setString(1, "%"+mc+"%");
	ResultSet rs = ps.executeQuery();
	while (rs.next()) {
		Departement p = new Departement();
	p.setID_departement(rs.getLong("ID_departement"));
	p.setNOM_departement(rs.getString("NOM_departement"));
	p.setNb_employee(rs.getInt("Nb_employee"));
	prods.add(p);
	}
	} catch (SQLException e) {
	e.printStackTrace();
	}
	return prods;
	}

	@Override
	public void addDepartement(Departement p) {
		// TODO Auto-generated method stub
		
	}

}
