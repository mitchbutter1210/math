package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import java.awt.Toolkit;

public class Ohm {

	private JFrame frmOhmsLaw;
	private JTextField enterV;
	private JTextField enterI;
	private JTextField enterR;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JTextField solution;
	public Operations op = new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ohm window = new Ohm();
					window.frmOhmsLaw.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Ohm() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmOhmsLaw = new JFrame();
		frmOhmsLaw.setIconImage(Toolkit.getDefaultToolkit().getImage(Ohm.class.getResource("/mathapp/edu_mathematics.png")));
		frmOhmsLaw.setTitle("Ohm's Law\r\n");
		frmOhmsLaw.setResizable(false);
		frmOhmsLaw.setBounds(100, 100, 450, 300);
		frmOhmsLaw.getContentPane().setLayout(null);
		
		JLabel lblVIr = new JLabel("V = IR");
		lblVIr.setBounds(199, 11, 55, 14);
		frmOhmsLaw.getContentPane().add(lblVIr);
		
		JLabel lblEnterV = new JLabel("Enter V");
		lblEnterV.setBounds(49, 50, 46, 14);
		frmOhmsLaw.getContentPane().add(lblEnterV);
		
		JLabel lblEnterI = new JLabel("Enter I");
		lblEnterI.setBounds(194, 50, 46, 14);
		frmOhmsLaw.getContentPane().add(lblEnterI);
		
		JLabel lblEnterR = new JLabel("Enter R");
		lblEnterR.setBounds(338, 50, 46, 14);
		frmOhmsLaw.getContentPane().add(lblEnterR);
		
		enterV = new JTextField();
		enterV.setBounds(24, 110, 86, 20);
		frmOhmsLaw.getContentPane().add(enterV);
		enterV.setColumns(10);
		
		enterI = new JTextField();
		enterI.setBounds(168, 110, 86, 20);
		frmOhmsLaw.getContentPane().add(enterI);
		enterI.setColumns(10);
		
		enterR = new JTextField();
		enterR.setBounds(312, 110, 86, 20);
		frmOhmsLaw.getContentPane().add(enterR);
		enterR.setColumns(10);
		
		final JRadioButton findV = new JRadioButton("Find V");
		findV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterV.setEditable(false);
				enterR.setEditable(true);
				enterI.setEditable(true);
			}
		});
		buttonGroup.add(findV);
		findV.setBounds(49, 197, 67, 23);
		frmOhmsLaw.getContentPane().add(findV);
		
		final JRadioButton findI = new JRadioButton("Find I");
		findI.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterI.setEditable(false);
				enterV.setEditable(true);
				enterR.setEditable(true);
			}
		});
		buttonGroup.add(findI);
		findI.setBounds(185, 197, 55, 23);
		frmOhmsLaw.getContentPane().add(findI);
		
		final JRadioButton findR = new JRadioButton("Find R\r\n");
		findR.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterR.setEditable(false);
				enterV.setEditable(true);
				enterI.setEditable(true);
			}
		});
		buttonGroup.add(findR);
		findR.setBounds(329, 197, 69, 23);
		frmOhmsLaw.getContentPane().add(findR);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(findV.isSelected() == true){
					solution.setText(op.OhmsLaw(Double.parseDouble(enterI.getText()), Double.parseDouble(enterR.getText()), true, false, false));
				}
				
				if(findI.isSelected() == true){
					solution.setText(op.OhmsLaw(Double.parseDouble(enterV.getText()), Double.parseDouble(enterR.getText()), false, true, false));
				}
				
				if(findR.isSelected() == true){
					solution.setText(op.OhmsLaw(Double.parseDouble(enterV.getText()), Double.parseDouble(enterI.getText()), false, false, true));
				}
			}
		});
		btnSolve.setBounds(95, 141, 89, 23);
		frmOhmsLaw.getContentPane().add(btnSolve);
		
		solution = new JTextField();
		solution.setEditable(false);
		solution.setBounds(253, 227, 145, 20);
		frmOhmsLaw.getContentPane().add(solution);
		solution.setColumns(10);
		
		JLabel lblSolution = new JLabel("Solution");
		lblSolution.setBounds(120, 230, 46, 14);
		frmOhmsLaw.getContentPane().add(lblSolution);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				enterV.setText("");
				enterI.setText("");
				enterR.setText("");
				solution.setText("");
			}
		});
		btnClear.setBounds(236, 141, 89, 23);
		frmOhmsLaw.getContentPane().add(btnClear);
	}
}
