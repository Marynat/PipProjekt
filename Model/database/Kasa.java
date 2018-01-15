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
    public Date data;

    /**
     * 
     */
    public List dzien;


    /**
     * @param stanKasy 
     * @param dzien 
     * @return
     */
    public Date otworzZamknijKase(Boolean stanKasy, List dzien) {
        // TODO implement here
        return null;
    }

    /**
     * @param kwotaOtrzymana 
     * @param kwotaRachunku 
     * @return
     */
    public Integer zaplac(Integer kwotaOtrzymana, Integer kwotaRachunku) {
        // TODO implement here
        return null;
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

	public List getDzien() {
		return dzien;
	}

	public void setDzien(List dzien) {
		this.dzien = dzien;
	}
    
    
}