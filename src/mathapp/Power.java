package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Power {

	public JFrame frmPower;
	public JTextField base;
	public JTextField power;
	public JTextField answer;
	public Operations op = new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Power window = new Power();
					window.frmPower.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Power() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPower = new JFrame();
		frmPower.setTitle("Power");
		frmPower.setIconImage(Toolkit.getDefaultToolkit().getImage(Power.class.getResource("/mathapp/edu_mathematics.png")));
		frmPower.setBounds(100, 100, 450, 443);
		frmPower.getContentPane().setLayout(null);
		
		JLabel lblEnterBase = new JLabel("Enter base");
		lblEnterBase.setBounds(180, 34, 102, 15);
		frmPower.getContentPane().add(lblEnterBase);
		
		base = new JTextField();
		base.setBounds(154, 86, 114, 19);
		frmPower.getContentPane().add(base);
		base.setColumns(10);
		
		JLabel lblEnterPower = new JLabel("Enter power");
		lblEnterPower.setBounds(174, 142, 94, 15);
		frmPower.getContentPane().add(lblEnterPower);
		
		power = new JTextField();
		power.setBounds(154, 186, 114, 19);
		frmPower.getContentPane().add(power);
		power.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(187, 239, 70, 15);
		frmPower.getContentPane().add(lblAnswer);
		
		answer = new JTextField();
		answer.setEditable(false);
		answer.setBounds(62, 266, 311, 19);
		frmPower.getContentPane().add(answer);
		answer.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				base.setText("");
				power.setText("");
				answer.setText("");
			}
		});
		btnClear.setBounds(307, 369, 117, 25);
		frmPower.getContentPane().add(btnClear);
		
		JButton btnPower = new JButton("Power");
		btnPower.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.power(base.getText(), power.getText()));
			}
		});
		btnPower.setBounds(10, 369, 117, 25);
		frmPower.getContentPane().add(btnPower);
	}
}
