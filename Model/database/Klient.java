
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
		System.out.println("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','" + super.typ +"',0)");
		//System.out.println("Insert into klient(id_klient,uzytkownik_id_uzytkownik) values(" + getId_klient() + "," + id + ")");
		rs = st.executeQuery("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,apteka_id_apteka) values(" + super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "',"  + super.wiek + ",'" + super.nazwisko + "','"+ super.typ + "',0)");
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
	
public void setCurrentKlientId() throws Exception {
		
		st = ConnectToDB.con.createStatement();
		int i = 0;
		ResultSet rs2 = st.executeQuery("select * from uzytkownik" );
		while (rs2.next()) {
			i++;
			if(super.imie.equals(rs2.getString(4)) && super.nazwisko.equals(rs2.getString(6)) ) {
				break;
			}
		}
		rs2 = st.executeQuery("select * from klient where uzytkownik_id_uzytkownik = "+ i );
		setId_klient(rs2.getInt(1));
	}
	
	@SuppressWarnings("resource")
	public String zamowLeki(String[] lines) {
		Produkty produkt = new Produkty();
		Zamowienie zamow = new Zamowienie();
		String str = null;
		try {
			ConnectToDB.polacz();
			Statement st = ConnectToDB.con.createStatement();
			ResultSet rs = st.executeQuery("Select \"id_produkty\", nazwa, ilosc from produkty");
			while (rs.next()) {
				produkt.setId(rs.getInt(1));
				produkt.setNazwa(rs.getString(2));
				produkt.setIlosc(rs.getInt(3));
				if(lines[0].equals(produkt.getNazwa()) && produkt.getIlosc()>0 && produkt.getIlosc()>=Integer.parseInt(lines[1])) {
					produkt.setIlosc(produkt.getIlosc()-Integer.parseInt(lines[1]));
					System.out.println("update produkty set ilosc ="+produkt.getIlosc() +" where nazwa =' "+ produkt.getNazwa()+"'");
					rs = st.executeQuery("update produkty set ilosc ="+produkt.getIlosc() +" where nazwa = '"+ produkt.getNazwa()+"'");
					zamow.setIdZamowienia();
					setCurrentKlientId();
					rs = st.executeQuery("insert into zamowienie(id_zamowienia,rodzaj,stan,klient_id_klient,produkty_id_produkty) values(" + zamow.getIdZamowienia() + ",'Z',false," + getId_klient());
					str = "Zamowiles "+ produkt.getNazwa() + "  w ilosci: "+ Integer.parseInt(lines[1]) +"\nPozosta�o:" + produkt.getIlosc()+"\n";
					break;
				}
			}
			ConnectToDB.rozlacz();
		} catch (Exception e1) {
			System.out.println("Exception w towrzeniu zamowienia.");
			e1.printStackTrace();
		}
		return str;
	}

}