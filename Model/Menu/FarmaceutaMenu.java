package Menu;

import java.awt.EventQueue;

import javax.swing.JFrame;

public class FarmaceutaMenu {

	private JFrame frame;

	/**
	 * Create the application.
	 */
	public FarmaceutaMenu() {
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
		
		frame.setVisible(true);
	}

}
