package Menu;

import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.AbstractAction;
import javax.swing.Action;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.LayoutStyle.ComponentPlacement;

import Wzorce.ActionProxy;
import database.ConnectToDB;
import database.Farmaceuta;
import database.Kierownik;
import database.Typ;

public class PracownikMenu extends Menu {

	private JFrame frame;
	private Farmaceuta far = new Farmaceuta();
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private JTextArea textArea;
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private JLabel lblPomoc;
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();

	
	/**
	 * Initialize the contents of the frame.
	 * @wbp.parser.entryPoint
	 */
	public void initialize() {
		frame = new JFrame();
		frame.setTitle(GlowneMenu.title);
		frame.setBounds(100, 100, 800, 400);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JButton btnSprzedaj = new JButton("Sprzedaj");
		btnSprzedaj.setAction(action);

		JButton button = new JButton("GlowneMenu");
		button.setAction(action_1);

		JButton btnNewButton = new JButton("Wyswietl oczekujace zamowienia");
		btnNewButton.setAction(action_2);
		textArea = new JTextArea();
		JScrollPane scroll = new JScrollPane(textArea, JScrollPane.VERTICAL_SCROLLBAR_AS_NEEDED,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);

		JButton btnOtworzzamknijKase = new JButton("Otworz / Zamknij kase");
		btnOtworzzamknijKase.setAction(action_3);

		lblPomoc = new JLabel("Pomoc:");

		JLabel lblPrzyciskiKierownika = new JLabel("Przyciski Kierownika");

		JButton btnZatrudnijFarmaceute = new JButton("Zatrudnij Farmaceute");
		btnZatrudnijFarmaceute.setAction(new ActionProxy(action_4, user, "Zatrudnij", "Podaj wszystkie dane w odpowiedniej kolejnosci po enterach, Kolejnosc: Imie, Nazwisko, Nazwa uzytkownika, Haslo Wiek, Wynagrodzenie, Konto"));

		JButton btnZamowProdukty = new JButton("Zamow Produkty");
		btnZamowProdukty.setAction(new ActionProxy(action_5, user,"Zamow produkty","Tutaj zamowisz produkty do magazynu, podaj Nazwe leku i jego ilosc (cena, dawka, typ) oddzielane spacja"));
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(groupLayout.createParallelGroup(Alignment.LEADING).addGroup(groupLayout
				.createSequentialGroup()
				.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup().addContainerGap(677, Short.MAX_VALUE)
								.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
						.addGroup(groupLayout.createSequentialGroup()
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
										.addComponent(btnZamowProdukty, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnOtworzzamknijKase, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnSprzedaj, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(btnNewButton, Alignment.TRAILING, GroupLayout.DEFAULT_SIZE,
												GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
										.addComponent(lblPrzyciskiKierownika).addComponent(btnZatrudnijFarmaceute,
												GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
								.addPreferredGap(ComponentPlacement.RELATED)
								.addGroup(groupLayout.createParallelGroup(Alignment.LEADING).addComponent(lblPomoc)
										.addComponent(scroll, GroupLayout.DEFAULT_SIZE, 579, Short.MAX_VALUE))))
				.addContainerGap()));
		groupLayout.setVerticalGroup(groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup().addContainerGap()
						.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
								.addGroup(groupLayout.createSequentialGroup().addComponent(btnNewButton).addGap(8)
										.addComponent(btnSprzedaj).addGap(9).addComponent(btnOtworzzamknijKase)
										.addGap(11).addComponent(lblPrzyciskiKierownika).addGap(9)
										.addComponent(btnZatrudnijFarmaceute).addGap(7).addComponent(btnZamowProdukty))
								.addComponent(scroll, GroupLayout.PREFERRED_SIZE, 201, GroupLayout.PREFERRED_SIZE))
						.addPreferredGap(ComponentPlacement.RELATED).addComponent(lblPomoc)
						.addPreferredGap(ComponentPlacement.RELATED, 95, Short.MAX_VALUE).addComponent(button)
						.addContainerGap()));
		frame.getContentPane().setLayout(groupLayout);

		frame.setVisible(true);
	}

	private class SwingAction extends AbstractAction {

		public SwingAction() {
			putValue(NAME, "Obsluga zamowien");
			putValue(SHORT_DESCRIPTION, "Podaj id zamowienia do obslugi");
		}

		public void actionPerformed(ActionEvent e) {
			Integer zId = Integer.parseInt(textArea.getText());
			try {
				textArea.setText(far.obsluzZamowienie(zId));
			} catch (Exception e1) {
				System.out.println("Exception w w oblsudze zamowien");
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "Menu Glowne");
			putValue(SHORT_DESCRIPTION, "Powrot do glownego menu");
		}

		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			GlowneMenu window = new GlowneMenu();
		}
	}

	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "Wyswietl oczekujace zamowienia");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}

		public void actionPerformed(ActionEvent e) {
			try {
				textArea.setText(far.oczekujaceZamowienia());
			} catch (Exception e1) {
				System.out.println("Exception w wypisywaniu zamowien");
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "Otoworz / Zamknij kase");
			putValue(SHORT_DESCRIPTION, "");
		}

		public void actionPerformed(ActionEvent e) {
			try {
				textArea.setText(far.kasaOZ());
			} catch (Exception e1) {
				System.out.println("Exception w otwarciu / zamknieciu kasy");
				e1.printStackTrace();
			}
		}
	}

	private class SwingAction_4 extends AbstractAction {
		public Statement st;
		public ResultSet rs;
		private Farmaceuta farm = new Farmaceuta();

		public SwingAction_4() {
			putValue(NAME, "Zatrudnij");
			putValue(SHORT_DESCRIPTION,
					"Podaj wszystkie dane w odpowiedniej kolejnosci po enterach, Kolejnosc: Imie, Nazwisko, Nazwa uzytkownika, Haslo Wiek, Wynagrodzenie, Konto");
		}

		public void actionPerformed(ActionEvent e) {
			String[] lines = textArea.getText().split("\n");
			farm.setImie(lines[0]);
			farm.setNazwisko(lines[1]);
			farm.setNazwaU(lines[2]);
			farm.setHaslo(lines[3].toCharArray());
			farm.setWiek(Integer.parseInt(lines[4]));
			try {
				farm.setWynagrodzenie(Integer.parseInt(lines[5]));
			} catch (NumberFormatException e1) {
				System.out.println("Not a number");
			}
			farm.setKontoBankowe(lines[6]);
			farm.setTyp(Typ.FARMACEUTA);
			farm.setId_farmaceuta(0);
			farm.setId(0);
			try {
				ConnectToDB.polacz();
				st = ConnectToDB.con.createStatement();
				rs = st.executeQuery("Select nazwau from uzytkownik where nazwau = '" + farm.getNazwaU() + "'");
				if(!rs.next()) {
					farm.dodajUzytkownikaDB();
				}else {
					System.out.println("Ta nazwa uzytkownika jest juz zajeta, wybierz inna");
				}
			} catch (Exception e1) {
				System.out.println("Exception w dodawaniu farmaceuty do bazy danych");
				e1.printStackTrace();
			}
		}
	}
	private class SwingAction_5 extends AbstractAction {
		Kierownik kierownik = new Kierownik();
		public SwingAction_5() {
			putValue(NAME, "Zamow produkty");
			putValue(SHORT_DESCRIPTION, "Tutaj zamowisz produkty do magazynu, podaj Nazwe leku i jego ilosc (cena, dawka, typ) oddzielane spacja");
		}
		public void actionPerformed(ActionEvent e) {
			String[] lines = textArea.getText().split(" ");
			try {
				
				textArea.setText(kierownik.zlozZamowienie(lines));
			} catch (Exception e1) {
				System.out.println("Exception w skladaniu zamowienia przez kierownika");
				e1.printStackTrace();
			}
		}
	}
}
