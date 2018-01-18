package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;

public class KierownikMenu {

	private JFrame frame;

	public KierownikMenu() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setTitle(GlowneMenu.title);
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JButton btnZatrudnij = new JButton("Zatrudnij");
		btnZatrudnij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnZwolnij = new JButton("Zwolnij");
		
		JButton btnStowrzNoweZamowienie = new JButton("Stowrz nowe zamowienie");
		
		JButton btnUaktualnijdane = new JButton("UaktualnijDane");
		
		JButton btnOproznijKase = new JButton("Oproznij Kase");
		
		JButton btnPodsumuj = new JButton("Podsumuj");
		GroupLayout groupLayout = new GroupLayout(frame.getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnZatrudnij)
						.addComponent(btnZwolnij)
						.addComponent(btnStowrzNoweZamowienie)
						.addComponent(btnUaktualnijdane)
						.addComponent(btnOproznijKase)
						.addComponent(btnPodsumuj))
					.addContainerGap(281, Short.MAX_VALUE))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(btnZatrudnij)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnZwolnij)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addComponent(btnStowrzNoweZamowienie)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnUaktualnijdane)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnOproznijKase)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnPodsumuj)
					.addContainerGap(62, Short.MAX_VALUE))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		frame.setVisible(true);
	}
}
