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
    
    public String stan;
    
    public Integer ilosc;
    
    public Integer idKlient;
    
    public Integer idProdukt;


    public Integer getIlosc() {
		return ilosc;
	}

	public void setIlosc(Integer ilosc) {
		this.ilosc = ilosc;
	}

	public Integer getIdKlient() {
		return idKlient;
	}

	public void setIdKlient(Integer idKlient) {
		this.idKlient = idKlient;
	}

	public Integer getIdProdukt() {
		return idProdukt;
	}

	public void setIdProdukt(Integer idProdukt) {
		this.idProdukt = idProdukt;
	}

	public String getStan() {
		return stan;
	}

	public void setStan(String stan) {
		this.stan = stan;
	}

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
	

	public void setId(int zam) {
		this.idZamowienia = zam;
		
	}
    
    

}