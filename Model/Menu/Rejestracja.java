package Menu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class Rejestracja {

	private JFrame frame;
	private JLabel lblWitamyWRejestracji;
	private JLabel lblPodajSwojeImie;
	private JTextField txtImie;
	private JTextField txtNazwisko;
	private JPasswordField pwdHaslo;
	private final Action action = new SwingAction();
	private JLabel lblPodajNazweUzytkownia;
	private JTextField textField;
	private JButton btnMenuGlowne;
	private final Action action_1 = new SwingAction_1();

	
	public Rejestracja() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(GlowneMenu.title);
		frame.setBounds(GlowneMenu.center.x - GlowneMenu.screenSize.width/4 , GlowneMenu.center.y - GlowneMenu.screenSize.height/4, 600, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		lblWitamyWRejestracji = new JLabel("Witamy w rejestracji do systemu naszej Apteki");
		
		lblPodajSwojeImie = new JLabel("Podaj swoje imie:");
		
		txtImie = new JTextField();
		txtImie.setColumns(10);
		
		txtNazwisko = new JTextField();
		txtNazwisko.setColumns(10);
		
		pwdHaslo = new JPasswordField();
		
		JLabel lblPodajSowjeNazwisko = new JLabel("Podaj swoje nazwisko:");
		
		JLabel lblPodajHaslo = new JLabel("Podaj Haslo:");
		
		JButton btnZarejestruj = new JButton("Zarejestruj");
		btnZarejestruj.setAction(action);
		
		lblPodajNazweUzytkownia = new JLabel("Podaj nazwe uzytkownia:");
		
		textField = new JTextField();
		textField.setColumns(10);
		
		btnMenuGlowne = new JButton("Menu glowne");
		btnMenuGlowne.setAction(action_1);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(lblWitamyWRejestracji)
						.addComponent(lblPodajSwojeImie)
						.addComponent(lblPodajSowjeNazwisko, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
						.addComponent(lblPodajHaslo)
						.addComponent(btnZarejestruj)
						.addComponent(lblPodajNazweUzytkownia))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(pwdHaslo)
						.addComponent(txtNazwisko)
						.addComponent(textField)
						.addComponent(txtImie, GroupLayout.PREFERRED_SIZE, 106, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(251, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(495, Short.MAX_VALUE)
					.addComponent(btnMenuGlowne))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblWitamyWRejestracji)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPodajSwojeImie)
						.addComponent(txtImie, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPodajSowjeNazwisko)
						.addComponent(txtNazwisko, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.TRAILING)
						.addComponent(lblPodajNazweUzytkownia)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(lblPodajHaslo)
						.addComponent(pwdHaslo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addComponent(btnZarejestruj)
					.addPreferredGap(ComponentPlacement.RELATED, 24, Short.MAX_VALUE)
					.addComponent(btnMenuGlowne))
		);
		frame.getContentPane().setLayout(groupLayout);
		frame.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "Zarejestruj");
			putValue(SHORT_DESCRIPTION, "Przesyla dane do bazy i umozliwia zalogowanie");
		}
		public void actionPerformed(ActionEvent e) {
			
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
}