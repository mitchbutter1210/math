package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Quad {

	private JFrame frmQuadraticFormula;
	private JTextField a;
	private JTextField b;
	private JTextField c;
	private JLabel lblAnswer;
	private JTextField answer1;
	Operations op = new Operations();
	private JTextField answer2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Quad window = new Quad();
					window.frmQuadraticFormula.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Quad() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmQuadraticFormula = new JFrame();
		frmQuadraticFormula.setTitle("Quadratic Formula");
		frmQuadraticFormula.setIconImage(Toolkit.getDefaultToolkit().getImage(Quad.class.getResource("/mathapp/edu_mathematics.png")));
		frmQuadraticFormula.setBounds(100, 100, 664, 444);
		frmQuadraticFormula.getContentPane().setLayout(null);
		
		JLabel lblEnterA = new JLabel("Enter A");
		lblEnterA.setBounds(82, 34, 70, 15);
		frmQuadraticFormula.getContentPane().add(lblEnterA);
		
		JLabel lblEnterB = new JLabel("Enter B");
		lblEnterB.setBounds(286, 34, 70, 15);
		frmQuadraticFormula.getContentPane().add(lblEnterB);
		
		JLabel lblEnterC = new JLabel("Enter C");
		lblEnterC.setBounds(524, 34, 70, 15);
		frmQuadraticFormula.getContentPane().add(lblEnterC);
		
		a = new JTextField();
		a.setBounds(55, 137, 114, 19);
		frmQuadraticFormula.getContentPane().add(a);
		a.setColumns(10);
		
		b = new JTextField();
		b.setBounds(255, 137, 131, 19);
		frmQuadraticFormula.getContentPane().add(b);
		b.setColumns(10);
		
		c = new JTextField();
		c.setBounds(492, 137, 114, 19);
		frmQuadraticFormula.getContentPane().add(c);
		c.setColumns(10);
		
		lblAnswer = new JLabel("Answer 1");
		lblAnswer.setBounds(55, 234, 70, 15);
		frmQuadraticFormula.getContentPane().add(lblAnswer);
		
		answer1 = new JTextField();
		answer1.setEditable(false);
		answer1.setBounds(143, 232, 154, 19);
		frmQuadraticFormula.getContentPane().add(answer1);
		answer1.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				a.setText("");
				b.setText("");
				c.setText("");
				answer1.setText("");
				answer2.setText("");
			}
		});
		btnClear.setBounds(521, 370, 117, 25);
		frmQuadraticFormula.getContentPane().add(btnClear);
		
		JButton btnSolve = new JButton("Solve");
		btnSolve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double x = Double.parseDouble(a.getText());
				double y = Double.parseDouble(b.getText());
				double z = Double.parseDouble(c.getText());
				answer1.setText(op.quad1(x, y, z));
				answer2.setText(op.quad2(x, y, z));
			}
		});
		btnSolve.setBounds(10, 370, 117, 25);
		frmQuadraticFormula.getContentPane().add(btnSolve);
		
		JLabel lblAnswer_1 = new JLabel("Answer 2");
		lblAnswer_1.setBounds(315, 234, 70, 15);
		frmQuadraticFormula.getContentPane().add(lblAnswer_1);
		
		answer2 = new JTextField();
		answer2.setEditable(false);
		answer2.setBounds(410, 232, 184, 19);
		frmQuadraticFormula.getContentPane().add(answer2);
		answer2.setColumns(10);
	}
}
