package database;

import java.util.*;

/**
 * 
 */
public class Kasa extends Apteka {

    /**
     * Default constructor
     */
    public Kasa() {
    }

    /**
     * 
     */
    public Boolean stanKasy;

    /**
     * 
     */
    protected Float pieniadze;

    /**
     * 
     */
    public Date data = new Date();

    /**
     * 
     */
    public List<Dzien> dzien = new ArrayList<Dzien>();


    /**
     * @param stanKasy 
     * @param dzien 
     * @return
     */
    public Date otworzZamknijKase(Boolean stanKasy) {
    	String str = "Kasa zostala ";
        if(!stanKasy) {
        	this.stanKasy = true;
        	str += "Otwarta";
        }else {
        	this.stanKasy = false;
        	str += "Zamknieta";
        }
        
        System.out.println(str);
        return data;
    }

    /**
     * @param kwotaOtrzymana 
     * @param kwotaRachunku 
     * @return
     */
    public void zaplac(Integer kwotaOtrzymana, Integer kwotaRachunku) {
    	
    	
    }

    /**
     * @param Rachunki rachunek 
     * @return
     */
    public Integer utworzRachunek(Rachunki rachunek) {
        // TODO implement here
        return null;
    }

	public Boolean getStanKasy() {
		return stanKasy;
	}

	public void setStanKasy(Boolean stanKasy) {
		this.stanKasy = stanKasy;
	}

	public Float getPieniadze() {
		return pieniadze;
	}

	public void setPieniadze(Float pieniadze) {
		this.pieniadze = pieniadze;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}
    
}