package database;

import java.sql.ResultSet;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class Kierownik extends Uzytkownik {

    /**
     * Default constructor
     */
    public Kierownik() {
    }

    /**
     * @param Farmaceuta farmaceuta
     */
    public void podsumowanieZmiany(Farmaceuta farmaceuta) {
        // TODO implement here
    }

    /**
     * @throws Exception 
     * 
     */
    public void podsumowanie() throws Exception {
    	ConnectToDB.polacz();
    	Kasa kasa = new Kasa();
    	
    	Statement st = ConnectToDB.con.createStatement();
    	
    	if(kasa.getStanKasy()) {
    		ResultSet rs = st.executeQuery("insert into dzien");
    		kasa.getPieniadze();
    		kasa.setPieniadze(0.0f);
    	}
    	
    	ConnectToDB.rozlacz();
    }

    /**
     * @param farmaceuta
     */
    public void zatrudnijFarmaceute(Farmaceuta farmaceuta) {
        // TODO implement here
    }

    /**
     * @param farmaceuta
     */
    public void zwolnijFaremaceute(Farmaceuta farmaceuta) {
        // TODO implement here
    }

    /**
     * @param farmaceuta
     */
    public void modyfikujFaremaceute(Farmaceuta farmaceuta) {
        // TODO implement here
    }

    /**
     * @param zamowienie
     */
    public void zlozZamowienie(Zamowienie zamowienie) {
        // TODO implement here
    }
    
    
}