package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JMenuBar;

public class Main {

	public JFrame frmMathApp;
	public JTextField text1;
	public JTextField text2;
	public JTextField answer;
	public Operations op = new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Main window = new Main();
					window.frmMathApp.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Main() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMathApp = new JFrame();
		frmMathApp.setIconImage(Toolkit.getDefaultToolkit().getImage(Main.class.getResource("/mathapp/edu_mathematics.png")));
		frmMathApp.setResizable(false);
		frmMathApp.setTitle("Math App --- Version 9.0");
		frmMathApp.setBounds(100, 100, 533, 487);
		frmMathApp.getContentPane().setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		lblEnterANumber.setBounds(211, 36, 150, 15);
		frmMathApp.getContentPane().add(lblEnterANumber);
		
		text1 = new JTextField();
		text1.setBounds(150, 62, 200, 19);
		frmMathApp.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblEnterAnotherNumber = new JLabel("Enter another number");
		lblEnterAnotherNumber.setBounds(200, 90, 190, 15);
		frmMathApp.getContentPane().add(lblEnterAnotherNumber);
		
		text2 = new JTextField();
		text2.setBounds(150, 116, 200, 19);
		frmMathApp.getContentPane().add(text2);
		text2.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Answer");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBounds(160, 147, 179, 15);
		frmMathApp.getContentPane().add(lblNewLabel);
		
		answer = new JTextField();
		answer.setEditable(false);
		answer.setBounds(150, 174, 200, 19);
		frmMathApp.getContentPane().add(answer);
		answer.setColumns(10);
		
		JButton btnAdd = new JButton("Add");
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.add(text1.getText(), text2.getText()));
			}
		});
		btnAdd.setBounds(12, 317, 117, 25);
		frmMathApp.getContentPane().add(btnAdd);
		
		JButton btnExit = new JButton("Exit");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				System.exit(0);
			}
		});
		btnExit.setBounds(401, 317, 117, 25);
		frmMathApp.getContentPane().add(btnExit);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				text1.setText("");
				text2.setText("");
				answer.setText("");
			}
		});
		btnClear.setBounds(401, 280, 117, 25);
		frmMathApp.getContentPane().add(btnClear);
		
		JButton btnSubtract = new JButton("Subtract");
		btnSubtract.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.sub(text1.getText(), text2.getText()));
			}
		});
		btnSubtract.setBounds(12, 280, 117, 25);
		frmMathApp.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.mul(text1.getText(), text2.getText()));
			}
		});
		btnMultiply.setBounds(141, 280, 117, 25);
		frmMathApp.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.div(text1.getText(), text2.getText()));
			}
		});
		btnDivide.setBounds(141, 317, 117, 25);
		frmMathApp.getContentPane().add(btnDivide);
		
		JButton btnSquareRoot = new JButton("Powers");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Power.main(null);
			}
		});
		btnSquareRoot.setBounds(12, 354, 117, 25);
		frmMathApp.getContentPane().add(btnSquareRoot);
		
		JButton btnSqrRoot = new JButton("Sqr Root");
		btnSqrRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				SquareRoot.main(null);
			}
		});
		btnSqrRoot.setBounds(141, 354, 117, 25);
		frmMathApp.getContentPane().add(btnSqrRoot);
		
		JButton btnAbout = new JButton("About");
		btnAbout.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				JOptionPane.showMessageDialog(null, "This program was designed and developed by Mitchell Butterfield", "About", JOptionPane.PLAIN_MESSAGE);
			}
		});
		btnAbout.setBounds(401, 354, 117, 25);
		frmMathApp.getContentPane().add(btnAbout);
		
		JButton btnDistance = new JButton("Distance");
		btnDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Distance.main(null);
			}
		});
		btnDistance.setBounds(12, 391, 117, 25);
		frmMathApp.getContentPane().add(btnDistance);
		
		JButton btnQuadratic = new JButton("Quadratic");
		btnQuadratic.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Quad.main(null);
			}
		});
		btnQuadratic.setBounds(141, 391, 117, 25);
		frmMathApp.getContentPane().add(btnQuadratic);
	}
}
