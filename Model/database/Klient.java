
package database;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.*;

/**
 * 
 */
public class Klient extends Uzytkownik {

	/**
	 * Default constructor
	 */
	public Klient() {
	}

	public int id_klient;

	public int getId_klient() {
		return id_klient;
	}

	public void setId_klient(int id_klient) {
		this.id_klient = id_klient;
	}

	/**
	 * @param Produkty
	 *            id
	 * @param Produkty
	 *            ilosc
	 */
	public void zakupPrzezInternet(Produkty id, Produkty ilosc) {
		// TODO implement here
	}

	@Override
	public void dodajUzytkownikaDB() throws Exception {
		ConnectToDB.polacz(); 
		
		String hasloDB = new String(super.haslo);
		setIdFromDB();
		setKlientId();
		st = ConnectToDB.con.createStatement();
		System.out.println("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','" + super.typ +"')");
		//System.out.println("Insert into klient(id_klient,uzytkownik_id_uzytkownik) values(" + getId_klient() + "," + id + ")");
		rs = st.executeQuery("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','"+ super.typ + "')");
		rs = st.executeQuery("Insert into klient(id_klient,uzytkownik_id_uzytkownik) values(" + getId_klient() + "," + id + ")");

		ConnectToDB.rozlacz();
	}

	public void setKlientId() throws Exception {
		
		st = ConnectToDB.con.createStatement();
		ResultSet rs2 = st.executeQuery("select * from klient");
		while (rs2.next()) {
			this.id_klient++;
		}
	}

}