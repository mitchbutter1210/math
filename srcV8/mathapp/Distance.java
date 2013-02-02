package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Distance {

	private JFrame frmDistance;
	private JTextField x1;
	private JLabel lblX_1;
	private JTextField x2;
	private JLabel lblY;
	private JTextField y1;
	private JLabel lblY_1;
	private JTextField y2;
	private JLabel lblDistance;
	private JTextField answer;
	private JButton btnDistance;
	public Operations op = new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Distance window = new Distance();
					window.frmDistance.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Distance() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDistance = new JFrame();
		frmDistance.setTitle("Distance");
		frmDistance.setIconImage(Toolkit.getDefaultToolkit().getImage(Distance.class.getResource("/mathapp/edu_mathematics.png")));
		frmDistance.setBounds(100, 100, 536, 417);
		frmDistance.getContentPane().setLayout(null);
		
		JLabel lblX = new JLabel("X1:");
		lblX.setBounds(37, 39, 70, 15);
		frmDistance.getContentPane().add(lblX);
		
		x1 = new JTextField();
		x1.setBounds(125, 37, 114, 19);
		frmDistance.getContentPane().add(x1);
		x1.setColumns(10);
		
		lblX_1 = new JLabel("X2:");
		lblX_1.setBounds(257, 39, 70, 15);
		frmDistance.getContentPane().add(lblX_1);
		
		x2 = new JTextField();
		x2.setBounds(345, 37, 114, 19);
		frmDistance.getContentPane().add(x2);
		x2.setColumns(10);
		
		lblY = new JLabel("Y1:");
		lblY.setBounds(37, 113, 70, 15);
		frmDistance.getContentPane().add(lblY);
		
		y1 = new JTextField();
		y1.setBounds(125, 111, 114, 19);
		frmDistance.getContentPane().add(y1);
		y1.setColumns(10);
		
		lblY_1 = new JLabel("Y2:");
		lblY_1.setBounds(257, 113, 70, 15);
		frmDistance.getContentPane().add(lblY_1);
		
		y2 = new JTextField();
		y2.setBounds(345, 111, 114, 19);
		frmDistance.getContentPane().add(y2);
		y2.setColumns(10);
		
		lblDistance = new JLabel("Distance");
		lblDistance.setBounds(224, 184, 70, 15);
		frmDistance.getContentPane().add(lblDistance);
		
		answer = new JTextField();
		answer.setBounds(103, 228, 334, 19);
		frmDistance.getContentPane().add(answer);
		answer.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				x1.setText("");
				x2.setText("");
				y1.setText("");
				y2.setText("");
				answer.setText("");
			}
		});
		btnClear.setBounds(379, 307, 117, 25);
		frmDistance.getContentPane().add(btnClear);
		
		btnDistance = new JButton("Distance");
		btnDistance.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double xOne = Double.parseDouble(x1.getText());
				double xTwo = Double.parseDouble(x2.getText());
				double yOne = Double.parseDouble(y1.getText());
				double yTwo = Double.parseDouble(y2.getText());
				answer.setText(op.Distance(xOne, xTwo, yOne, yTwo));
			}
		});
		btnDistance.setBounds(59, 307, 117, 25);
		frmDistance.getContentPane().add(btnDistance);
	}
}
