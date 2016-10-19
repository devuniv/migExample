package migExample;

import javax.swing.BorderFactory;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import javax.swing.border.BevelBorder;

import net.miginfocom.swing.MigLayout;

public class MigDemo2 {
	JFrame frame = new JFrame("Frame title");
	JPanel panel = new JPanel(new MigLayout());

	private JLabel lblFirstName = new JLabel("First name of this:");
	private JLabel lblLastName = new JLabel("Last name:");
	private JTextField txtFirstName = new JTextField(20);
	private JTextField txtLastName = new JTextField(20);
	private JButton btnSave = new JButton("Save");
	private JButton btnDelete = new JButton("Delete");
	private JTextArea txaDsc = new JTextArea(10, 10);
	JLabel lblDsc = new JLabel("Description");
	JCheckBox chkMale = new JCheckBox("Male", true);
	JCheckBox chkFemale = new JCheckBox("Female", false);
	JRadioButton rbtnMale = new JRadioButton("Male", true);
	JRadioButton rbtnFemale = new JRadioButton("Female", false);

	public MigDemo2() {
		panel.setLayout(new MigLayout());
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setBounds(100, 100, 200, 300);
		frame.add(panel);

		panel.add(lblFirstName);
		panel.add(txtFirstName, "wrap, span, pushx, growx");
		panel.add(lblLastName);
		panel.add(txtLastName, "wrap, span, pushx, growx");
		panel.add(btnSave, "newline, left");
		panel.add(btnDelete, "right, wrap");
		panel.add(lblDsc, "newline, top");
		txaDsc.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		panel.add(new JScrollPane(txaDsc), "span, pushx, growx");
		panel.add(chkMale, "skip, split2, left");
		panel.add(chkFemale);
		ButtonGroup btnGrpMaleFemale = new ButtonGroup();
		btnGrpMaleFemale.add(rbtnFemale);
		btnGrpMaleFemale.add(rbtnMale);
		panel.add(rbtnMale, "right");
		panel.add(rbtnFemale, "right");

		frame.pack();
		frame.setVisible(true);
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {

			@Override
			public void run() {
				// TODO Auto-generated method stub
				new MigDemo2();
			}

		});

	}

}
