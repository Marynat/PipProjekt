package database;

import java.util.*;

/**
 * 
 */
public class Farmaceuta extends Uzytkownik {

    /**
     * Default constructor
     */
    public Farmaceuta() {
    }

    /**
     * 
     */
    public Integer wynagrodzenie;

    /**
     * 
     */
    public Date czasRozpoczecia;

    /**
     * 
     */
    public Date czasZakonczenia;

    /**
     * @param Produkt id 
     * @return
     */
    public Rachunki sprzedaj(Produkty id) {
        // TODO implement here
        return null;
    }

	public Integer getWynagrodzenie() {
		return wynagrodzenie;
	}

	public void setWynagrodzenie(Integer wynagrodzenie) {
		this.wynagrodzenie = wynagrodzenie;
	}

	public Date getCzasRozpoczecia() {
		return czasRozpoczecia;
	}

	public void setCzasRozpoczecia(Date czasRozpoczecia) {
		this.czasRozpoczecia = czasRozpoczecia;
	}

	public Date getCzasZakonczenia() {
		return czasZakonczenia;
	}

	public void setCzasZakonczenia(Date czasZakonczenia) {
		this.czasZakonczenia = czasZakonczenia;
	}
    
    

}