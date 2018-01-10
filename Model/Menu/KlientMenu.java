package Menu;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractAction;
import java.awt.event.ActionEvent;
import javax.swing.Action;

public class KlientMenu {

	private JFrame frame;
	private final Action action = new SwingAction();


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
		
		JButton btnZamowLeki = new JButton("Zamow leki");
		
		JButton btnSprawdzDostepnosc = new JButton("Sprawdz dostepnosc");
		
		JButton btnNewButton = new JButton("GlowneMenu");
		btnNewButton.setAction(action);
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING, false)
						.addComponent(lblCoChceszZrobic)
						.addComponent(btnSprawdzDostepnosc, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnKupLeki, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
						.addComponent(btnZamowLeki, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
					.addContainerGap(303, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(345, Short.MAX_VALUE)
					.addComponent(btnNewButton))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addComponent(lblCoChceszZrobic)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnKupLeki)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnZamowLeki)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnSprawdzDostepnosc)
					.addPreferredGap(ComponentPlacement.RELATED, 137, Short.MAX_VALUE)
					.addComponent(btnNewButton))
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
}
