package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.AbstractAction;
import javax.swing.Action;

public class KierownikMenu {

	private JFrame frame;
	private final Action action = new SwingAction();
	private final Action action_1 = new SwingAction_1();
	private final Action action_2 = new SwingAction_2();
	private final Action action_3 = new SwingAction_3();
	private final Action action_4 = new SwingAction_4();
	private final Action action_5 = new SwingAction_5();
	private final Action action_6 = new SwingAction_6();

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
		btnZatrudnij.setAction(action_1);
		btnZatrudnij.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnZwolnij = new JButton("Zwolnij");
		btnZwolnij.setAction(action_2);
		
		JButton btnStowrzNoweZamowienie = new JButton("Stowrz nowe zamowienie");
		btnStowrzNoweZamowienie.setAction(action_3);
		
		JButton btnUaktualnijdane = new JButton("UaktualnijDane");
		btnUaktualnijdane.setAction(action_4);
		
		JButton btnOproznijKase = new JButton("Oproznij Kase");
		btnOproznijKase.setAction(action_5);
		
		JButton btnPodsumuj = new JButton("Podsumuj");
		btnPodsumuj.setAction(action_6);
		
		JButton button = new JButton("GlowneMenu");
		button.setAction(action);
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
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(337, Short.MAX_VALUE)
					.addComponent(button, GroupLayout.PREFERRED_SIZE, 97, GroupLayout.PREFERRED_SIZE))
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
					.addPreferredGap(ComponentPlacement.RELATED, 39, Short.MAX_VALUE)
					.addComponent(button))
		);
		frame.getContentPane().setLayout(groupLayout);
		
		frame.setVisible(true);
	}
	private class SwingAction extends AbstractAction {
		public SwingAction() {
			putValue(NAME, "SwingAction");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_1 extends AbstractAction {
		public SwingAction_1() {
			putValue(NAME, "SwingAction_1");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_2 extends AbstractAction {
		public SwingAction_2() {
			putValue(NAME, "SwingAction_2");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
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
			putValue(NAME, "SwingAction_4");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_5 extends AbstractAction {
		public SwingAction_5() {
			putValue(NAME, "SwingAction_5");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
	private class SwingAction_6 extends AbstractAction {
		public SwingAction_6() {
			putValue(NAME, "SwingAction_6");
			putValue(SHORT_DESCRIPTION, "Some short description");
		}
		public void actionPerformed(ActionEvent e) {
		}
	}
}
