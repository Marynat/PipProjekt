package Menu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;

import database.ConnectToDB;
import database.Produkty;
import database.Typ;

import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.swing.Action;
import javax.swing.JTextField;

public class KlientMenu {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private JTextArea txtTuWyswietliSi;
	private final Action action_4 = new SwingAction_4();


	public KlientMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(GlowneMenu.title);
		frame.setBounds(GlowneMenu.center.x - GlowneMenu.screenSize.width/4 , GlowneMenu.center.y - GlowneMenu.screenSize.height/4, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JLabel lblCoChceszZrobic = new JLabel("Co chcesz zrobic?");
		
		JButton btnKupLeki = new JButton("Kup leki");
		btnKupLeki.setAction(action_1);
		
		JButton btnZamowLeki = new JButton("Zamow leki");
		btnZamowLeki.setAction(action_2);
		
		JButton btnSprawdzDostepnosc = new JButton("Sprawdz dostepnosc");
		btnSprawdzDostepnosc.setAction(action_3);
		
		JButton btnNewButton = new JButton("GlowneMenu");
		btnNewButton.setAction(action);
		
		txtTuWyswietliSi = new JTextArea();
		txtTuWyswietliSi.setText("Tu wyswietli sie dostepnosc twojego leku\n podaj jego nazwe.");
		txtTuWyswietliSi.setColumns(10);
		
		JButton btnWyczyscPole = new JButton("Wyczysc Pole");
		btnWyczyscPole.setAction(action_4);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(btnSprawdzDostepnosc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnZamowLeki, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(lblCoChceszZrobic)
						.addComponent(btnKupLeki, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnWyczyscPole)
							.addPreferredGap(ComponentPlacement.RELATED, 101, Short.MAX_VALUE)
							.addComponent(btnNewButton))
						.addComponent(txtTuWyswietliSi, GroupLayout.DEFAULT_SIZE, 295, Short.MAX_VALUE)))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblCoChceszZrobic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addGroup(groupLayout.createSequentialGroup()
							.addComponent(btnKupLeki)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnZamowLeki)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(btnSprawdzDostepnosc))
						.addComponent(txtTuWyswietliSi, GroupLayout.DEFAULT_SIZE, 212, Short.MAX_VALUE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnWyczyscPole)
						.addComponent(btnNewButton)))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		
		frame.setVisible(true);
	}

	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Menu Glowne");
			putValue(SHORT_DESCRIPTION, "Powrot do glownego menu");
		}
		public void actionPerformed(ActionEvent e) {
			frame.dispose();
			GlowneMenu window = new GlowneMenu();
		}
	}
	private class SwingAction_1 extends AbstractAction {
		Produkty produkt = new Produkty();
		public SwingAction_1() {
			putValue(NAME, "Sprawdz Dostepnosc");
			putValue(SHORT_DESCRIPTION, "Mozesz sprawdzic dostepnosc swojego leku");
		}
		public void actionPerformed(ActionEvent e) {
			try {
				String nazwa = txtTuWyswietliSi.getText();
				ConnectToDB.polacz();
				Statement st = ConnectToDB.con.createStatement();
				ResultSet rs = st.executeQuery("Select \"id_produkty\", nazwa, ilosc from produkty");
				while (rs.next()) {
					produkt.setId(rs.getInt(1));
					produkt.setNazwa(rs.getString(2));
					produkt.setIlosc(rs.getInt(3));
					if(nazwa.equals(produkt.getNazwa())) {
						txtTuWyswietliSi.setText("Lek "+ produkt.getNazwa() + " jest dostepny w ilosci: " + produkt.getIlosc());
					}
				}
				
				ConnectToDB.rozlacz();
			} catch (Exception e1) {
				System.out.println("Exeption w sprawdzaniu dosepnosci z bazy danych");
				e1.printStackTrace();
			}
		}
	}
	private class SwingAction_2 extends AbstractAction {
		Produkty produkt = new Produkty();
		public SwingAction_2() {
		
			putValue(NAME, "Zamow Leki");
			putValue(SHORT_DESCRIPTION, "Tym przyciskiem mozesz zamowic leki");
		}
		@SuppressWarnings("resource")
		public void actionPerformed(ActionEvent e) {
			try {
				String[] lines = txtTuWyswietliSi.getText().split(" ");
				ConnectToDB.polacz();
				Statement st = ConnectToDB.con.createStatement();
				ResultSet rs = st.executeQuery("Select \"id_produkty\", nazwa, ilosc from produkty");
				while (rs.next()) {
					produkt.setId(rs.getInt(1));
					produkt.setNazwa(rs.getString(2));
					produkt.setIlosc(rs.getInt(3));
					if(lines[0].equals(produkt.getNazwa()) && produkt.getIlosc()>0 && produkt.getIlosc()>Integer.parseInt(lines[1])) {
						txtTuWyswietliSi.setText("Lek "+ produkt.getNazwa() + " jest dostepny w ilosci: " + produkt.getIlosc()+"\n");
						produkt.setIlosc(produkt.getIlosc()-Integer.parseInt(lines[1]));
						rs = st.executeQuery("update produkty set "+produkt.getIlosc() +" where id = "+ produkt.getId());
					}
				}
				
				ConnectToDB.rozlacz();
			} catch (Exception e1) {
				System.out.println("Exception w towrzeniu zamowienia.");
				e1.printStackTrace();
			}
		}
	}
	private class SwingAction_3 extends AbstractAction {
		public SwingAction_3() {
			putValue(NAME, "SwingAction_3");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_4 extends AbstractAction {
		public SwingAction_4() {
			putValue(NAME, "Wyczysc Pole");
			putValue(SHORT_DESCRIPTION, "Tym przyciskiem wyczyscisz pole textowe");
		}
		public void actionPerformed(ActionEvent e) {
			txtTuWyswietliSi.setText(null);
		}
	}
}
