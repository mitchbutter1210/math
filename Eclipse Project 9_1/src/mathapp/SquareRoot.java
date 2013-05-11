package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class SquareRoot {

	private JFrame frmSquareRoot;
	private JTextField root;
	private JTextField answer;
	private JButton btnClear;
	private JButton btnRoot;
	public Operations op = new Operations();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SquareRoot window = new SquareRoot();
					window.frmSquareRoot.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SquareRoot() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmSquareRoot = new JFrame();
		frmSquareRoot.setIconImage(Toolkit.getDefaultToolkit().getImage(SquareRoot.class.getResource("/mathapp/edu_mathematics.png")));
		frmSquareRoot.setTitle("Square Root");
		frmSquareRoot.setBounds(100, 100, 450, 377);
		frmSquareRoot.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Enter number");
		lblNewLabel.setBounds(173, 56, 84, 15);
		frmSquareRoot.getContentPane().add(lblNewLabel);
		
		root = new JTextField();
		root.setBounds(150, 115, 114, 19);
		frmSquareRoot.getContentPane().add(root);
		root.setColumns(10);
		
		JLabel lblAnswer = new JLabel("Answer");
		lblAnswer.setBounds(191, 183, 70, 15);
		frmSquareRoot.getContentPane().add(lblAnswer);
		
		answer = new JTextField();
		answer.setEditable(false);
		answer.setBounds(61, 228, 315, 19);
		frmSquareRoot.getContentPane().add(answer);
		answer.setColumns(10);
		
		btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				root.setText("");
				answer.setText("");
			}
		});
		btnClear.setBounds(307, 303, 117, 25);
		frmSquareRoot.getContentPane().add(btnClear);
		
		btnRoot = new JButton("Root");
		btnRoot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(op.root(root.getText()));
			}
		});
		btnRoot.setBounds(10, 303, 117, 25);
		frmSquareRoot.getContentPane().add(btnRoot);
	}

}
