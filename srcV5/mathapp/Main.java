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

	private JFrame frmMathApp;
	private JTextField text1;
	private JTextField text2;
	private JTextField answer;
	
	
	public void doMath(String num1, String num2, int op){
		long x = Long.parseLong(num1);
		long y = Long.parseLong(num2);
		long z;
		switch(op){
		case 1:
			z = x + y;
			String add = Long.toString(z);
			answer.setText(add);
			break;
		case 2:
			z = x - y;
			String sub = Long.toString(z);
			answer.setText(sub);
			break;
		case 3:
			z = x * y;
			String mul = Long.toString(z);
			answer.setText(mul);
			break;
		case 4:
			if(y != 0){
				z = x / y;
				String div = Long.toString(z);
				answer.setText(div);
				break;
			}
			else{
				JOptionPane.showMessageDialog(null, "Cannot divide by zero!");
			}
		}
	}

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
		frmMathApp.setTitle("Math App --- Version 5.0");
		frmMathApp.setBounds(100, 100, 533, 451);
		frmMathApp.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmMathApp.getContentPane().setLayout(null);
		
		JLabel lblEnterANumber = new JLabel("Enter a number");
		lblEnterANumber.setBounds(200, 36, 150, 15);
		frmMathApp.getContentPane().add(lblEnterANumber);
		
		text1 = new JTextField();
		text1.setBounds(150, 63, 200, 19);
		frmMathApp.getContentPane().add(text1);
		text1.setColumns(10);
		
		JLabel lblEnterAnotherNumber = new JLabel("Enter another number");
		lblEnterAnotherNumber.setBounds(171, 95, 190, 15);
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
				doMath(text1.getText(), text2.getText(), 1);
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
				doMath(text1.getText(), text2.getText(), 2);
			}
		});
		btnSubtract.setBounds(12, 280, 117, 25);
		frmMathApp.getContentPane().add(btnSubtract);
		
		JButton btnMultiply = new JButton("Multiply");
		btnMultiply.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doMath(text1.getText(), text2.getText(), 3);
			}
		});
		btnMultiply.setBounds(141, 280, 117, 25);
		frmMathApp.getContentPane().add(btnMultiply);
		
		JButton btnDivide = new JButton("Divide");
		btnDivide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				doMath(text1.getText(), text2.getText(), 4);
			}
		});
		btnDivide.setBounds(141, 317, 117, 25);
		frmMathApp.getContentPane().add(btnDivide);
		
		JButton btnSquareRoot = new JButton("Powers");
		btnSquareRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double pow = Math.pow(Double.parseDouble(text1.getText()), Double.parseDouble(text2.getText()));
				answer.setText(Double.toString(pow));
			}
		});
		btnSquareRoot.setBounds(12, 354, 117, 25);
		frmMathApp.getContentPane().add(btnSquareRoot);
		
		JButton btnSqrRoot = new JButton("Sqr Root");
		btnSqrRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double squareRt = Math.sqrt(Double.parseDouble(text1.getText()));
				answer.setText(Double.toString(squareRt));
			}
		});
		btnSqrRoot.setBounds(141, 354, 117, 25);
		frmMathApp.getContentPane().add(btnSqrRoot);
	}
}
