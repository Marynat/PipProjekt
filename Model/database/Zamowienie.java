package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class Zamowienie {

    /**
     * Default constructor
     */
    public Zamowienie() {
    }

    /**
     * 
     */
    public Integer idZamowienia = 0;


    /**
     * @param produkty
     */
    public void nowyProdukt(Produkty produkty) {
        // TODO implement here
    }

    /**
     * @param produkty
     */
    public void staryProdukt(Produkty produkty) {
        // TODO implement here
    }

	public Integer getIdZamowienia() {
		return idZamowienia;
	}

	public void setIdZamowienia() throws Exception {
		
		Statement st = ConnectToDB.con.createStatement();
		ResultSet rs2 = st.executeQuery("select * from zamowienie");
		while (rs2.next()) {
			this.idZamowienia++;
		}
	}
	

	public static void setId() {
		
		
	}
    
    

}