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

}