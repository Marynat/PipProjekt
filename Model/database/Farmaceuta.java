package database;

import java.sql.ResultSet;
import java.sql.SQLException;

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
		System.out.println("Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ) values("
				+ super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "'," + super.wiek + ",'"
				+ super.nazwisko + "','" + super.typ + "',0)");
		System.out.println(
				"Insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values("
						+ getId_farmaceuta() + "," + getWynagrodzenie() + ",'" + getKontoBankowe() + "'," + super.id
						+ ")");
		rs = st.executeQuery(
				"Insert into uzytkownik(id_uzytkownik,nazwau,haslo,imie,wiek,nazwisko,typ,apteka_id_apteka) values("
						+ super.id + ",'" + super.nazwaU + "','" + hasloDB + "','" + super.imie + "'," + super.wiek
						+ ",'" + super.nazwisko + "','" + super.typ + "',0)");
		rs = st.executeQuery(
				"Insert into farmaceuta(id_farmaceuta,wynagrodzenie,konto_bankowe,uzytkownik_id_uzytkownik) values("
						+ getId_farmaceuta() + "," + getWynagrodzenie() + ",'" + getKontoBankowe() + "'," + super.id
						+ ")");

		ConnectToDB.rozlacz();
	}

	public void setFarmaceutaId() throws Exception {

		st = ConnectToDB.con.createStatement();
		ResultSet rs2 = st.executeQuery("select * from farmaceuta");
		while (rs2.next()) {
			this.id_farmaceuta++;
		}
	}

	public String oczekujaceZamowienia() throws Exception {
		Zamowienie zam = new Zamowienie();
		String zamowienia = "";

		ConnectToDB.polacz();
		st = ConnectToDB.con.createStatement();
		rs = st.executeQuery(
				"Select z.id_zamowienia, z.rodzaj, z.stan, z.ilosc, z.klient_id_klient, z.produkty_id_produkty, p.nazwa from zamowienie z, produkty p where z.produkty_id_produkty = \"id_produkty\"");
		while (rs.next()) {
			zam.setId(rs.getInt(1));
			zam.setRodzaj(rs.getString(2));
			zam.setStan(rs.getString(3));
			zam.setIlosc(rs.getInt(4));
			zam.setIdKlient(rs.getInt(5));
			zam.setIdProdukt(rs.getInt(6));
			if (zam.getStan().equals("false")) {
				zamowienia += "Id: " + zam.getIdZamowienia() + " Rodzaj: " + zam.getRodzaj() + " Ilosc opakowan: "
						+ zam.getIlosc() + " Id_klienta: " + zam.getIdKlient() + " Produkt: " + rs.getString(7) + "\n";
			}
		}
		ConnectToDB.rozlacz();

		return zamowienia;
	}

	public String kasaOZ() throws Exception {
		String s = "";
		ConnectToDB.polacz();
		st = ConnectToDB.con.createStatement();
		rs = st.executeQuery("Select \"id_kasa\", stan from kasa where \"id_kasa\" = 0");
		ResultSet rs2;
		while (rs.next()) {
			if (rs.getString(2).equals("OTWARTA")) {
				rs2 = st.executeQuery("update kasa set stan = 'ZAMKNIETA' where \"id_kasa\" = 0");
				s = "Kasa zostala zamknieta";		
			}else {
				rs2 = st.executeQuery("update kasa set stan = 'OTWARTA' where \"id_kasa\" = 0");
				s = "Kasa zostala otwarta";
			}
		}
		ConnectToDB.rozlacz();
		return s;
	}

	public void obsluzZamowienie() {
		
	}
}