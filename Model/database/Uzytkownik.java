package database;

import java.util.*;

/**
 * 
 */
public class Uzytkownik {

    public String getNazwaU() {
		return nazwaU;
	}

	public void setNazwaU(String nazwaU) {
		this.nazwaU = nazwaU;
	}

	public char[] getHaslo() {
		return haslo;
	}

	public void setHaslo(char[] haslo) {
		this.haslo = haslo;
	}
	
	public Typ getTyp() {
		return typ;
	}

	public void setTyp(Typ typ) {
		this.typ = typ;
	}

	public String getImie() {
		return imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}
	
	public String getEMail() {
		return eMail;
	}

	public void setEMail(String eMail) {
		this.eMail = eMail;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getWiek() {
		return wiek;
	}

	public void setWiek(Integer wiek) {
		this.wiek = wiek;
	}

	public String getNazwisko() {
		return nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getAdres() {
		return adres;
	}

	public void setAdres(String adres) {
		this.adres = adres;
	}

	public String getTelefon() {
		return telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

	/**
     * Default constructor
     */
    public Uzytkownik() {
    }

    /**
     * 
     */
    protected String nazwaU;

    /**
     * 
     */
    protected char[] haslo;
    
    /**
     * 
     */
    protected Typ typ;
    
    /**
     * 
     */
    protected String eMail;

	/**
     * 
     */
    protected String imie;

    /**
     * 
     */
    public Integer id;

    /**
     * 
     */
    protected Integer wiek;

    /**
     * 
     */
    protected String nazwisko;

    /**
     * 
     */
    protected String adres;

    /**
     * 
     */
    protected String telefon;


}