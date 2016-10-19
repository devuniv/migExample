package migExample;

import java.awt.LayoutManager;

import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import net.miginfocom.swing.MigLayout;

public class MigDemo3 {

	JTextField txtF1 = new JTextField();
	JTextField txtF2 = new JTextField();
	JTextField txtF3 = new JTextField();
	JTextField txtF4 = new JTextField();

	LayoutManager lm = new MigLayout();
	JPanel panel = new JPanel(lm);

	public static void main(String[] args) {
		Runnable doRunnable = new Runnable() {

			@Override
			public void run() {
				new MigDemo3();
			}
		};
		SwingUtilities.invokeLater(doRunnable);

	}

}
