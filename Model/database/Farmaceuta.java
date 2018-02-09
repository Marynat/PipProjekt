package database;

import java.sql.ResultSet;
import java.sql.SQLException;
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
	public String kontoBankowe;
	
	
	public String getKontoBankowe() {
		return kontoBankowe;
	}

	public void setKontoBankowe(String kontoBankowe) {
		this.kontoBankowe = kontoBankowe;
	}

	private int id_farmaceuta;

	/**
	 * @param Produkt
	 *            id
	 * @return
	 */
	public Rachunki sprzedaj(Produkty id) {
		// TODO implement here
		return null;
	}

	public int getId_farmaceuta() {
		return id_farmaceuta;
	}

	public void setId_farmaceuta(int id_farmaceuta) {
		this.id_farmaceuta = id_farmaceuta;
	}

	public Integer getWynagrodzenie() {
		return wynagrodzenie;
	}

	public void setWynagrodzenie(Integer wynagrodzenie) {
		this.wynagrodzenie = wynagrodzenie;
	}


	@Override
	public void dodajUzytkownikaDB() throws Exception {
		ConnectToDB.polacz(); 
		
		String hasloDB = new String(super.haslo);
		st = ConnectToDB.con.createStatement();
		setIdFromDB();
		setFarmaceutaId();
		System.out.println("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','" + super.typ +"',0)");
		System.out.println("Insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values(" + getId_farmaceuta() + "," + getWynagrodzenie()+ ",'" + getKontoBankowe() + "'," + super.id + ")");
		rs = st.executeQuery("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,apteka_id_apteka) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','"+ super.typ + "',0)");
		rs = st.executeQuery("Insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values(" + getId_farmaceuta() + "," + getWynagrodzenie()+ ",'" + getKontoBankowe() + "'," + super.id + ")");

		ConnectToDB.rozlacz();
	}

	public void setFarmaceutaId() throws Exception {
		
		st = ConnectToDB.con.createStatement();
		ResultSet rs2 = st.executeQuery("select * from farmaceuta");
		while (rs2.next()) {
			this.id_farmaceuta++;
		}
	}

}