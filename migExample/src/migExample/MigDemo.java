package migExample;

import java.awt.Color;
import java.awt.Component;
import java.awt.Container;
import java.awt.LayoutManager;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

import net.miginfocom.swing.MigLayout;

public class MigDemo extends JFrame {

	private final Component label;
	private final JTextField fld;

	public MigDemo() {
		label = new JLabel("my lbl", JLabel.CENTER);
		Container container = this.getContentPane();
		LayoutManager lm = new MigLayout();
		container.setLayout(lm);
		// container.setLayout(lm);
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setBounds(200, 200, 150, 270);
		label.setSize(130, 100);
		label.setLocation(30, 30);
		container.add(label);
		label.setForeground(Color.blue);

		fld = new JTextField("sample text");
		container.add(fld);
		// this.setLayout(lm);
	}

	public static void main(String[] args) {

		MigDemo window = new MigDemo();
		window.setVisible(true);

	}

}
