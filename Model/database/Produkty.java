package database;

import java.util.*;

/**
 * 
 */
public class Produkty extends Magazyn {

    /**
     * Default constructor
     */
    public Produkty() {
    }

    /**
     * 
     */
    public String nazwa;

    /**
     * 
     */
    public Integer dawka;

    /**
     * 
     */
    public String typ;

    /**
     * 
     */
    public Integer id;

	public String getNazwa() {
		return nazwa;
	}

	public void setNazwa(String nazwa) {
		this.nazwa = nazwa;
	}

	public Integer getDawka() {
		return dawka;
	}

	public void setDawka(Integer dawka) {
		this.dawka = dawka;
	}

	public String getTyp() {
		return typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

    
}