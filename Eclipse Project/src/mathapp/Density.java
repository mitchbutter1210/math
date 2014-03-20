package mathapp;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import java.awt.Toolkit;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Density {
	
	public static String findDensity(String mass, String volume){
		long massNum = Long.parseLong(mass);
		long volumeNum = Long.parseLong(volume);
		
		if(volumeNum == 0){
			JOptionPane.showMessageDialog(null, "You can't divide by zero!", "Math Error!", JOptionPane.PLAIN_MESSAGE);
		}
		
		long density = massNum / volumeNum;
		String answer = Long.toString(density);
		return answer;
		
	}

	private JFrame frmDensity;
	private JTextField massText;
	private JTextField volumeText;
	private JTextField answer;
	private JButton btnFind;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Density window = new Density();
					window.frmDensity.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Density() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmDensity = new JFrame();
		frmDensity.setResizable(false);
		frmDensity.setIconImage(Toolkit.getDefaultToolkit().getImage(Density.class.getResource("/mathapp/edu_mathematics.png")));
		frmDensity.setTitle("Density");
		frmDensity.setBounds(100, 100, 524, 374);
		frmDensity.getContentPane().setLayout(null);
		
		JLabel lblEnterMass = new JLabel("Enter mass");
		lblEnterMass.setBounds(217, 41, 72, 14);
		frmDensity.getContentPane().add(lblEnterMass);
		
		massText = new JTextField();
		massText.setBounds(203, 66, 86, 20);
		frmDensity.getContentPane().add(massText);
		massText.setColumns(10);
		
		JLabel lblEnterVolume = new JLabel("Enter volume");
		lblEnterVolume.setBounds(213, 97, 86, 14);
		frmDensity.getContentPane().add(lblEnterVolume);
		
		volumeText = new JTextField();
		volumeText.setBounds(203, 122, 86, 20);
		frmDensity.getContentPane().add(volumeText);
		volumeText.setColumns(10);
		
		JLabel lblDensity = new JLabel("Density");
		lblDensity.setBounds(227, 153, 62, 14);
		frmDensity.getContentPane().add(lblDensity);
		
		answer = new JTextField();
		answer.setEditable(false);
		answer.setBounds(203, 178, 86, 20);
		frmDensity.getContentPane().add(answer);
		answer.setColumns(10);
		
		JButton btnClear = new JButton("Clear");
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				massText.setText("");
				volumeText.setText("");
				answer.setText("");
			}
		});
		btnClear.setBounds(10, 312, 89, 23);
		frmDensity.getContentPane().add(btnClear);
		
		btnFind = new JButton("Find");
		btnFind.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				answer.setText(findDensity(massText.getText(), volumeText.getText()));
			}
		});
		btnFind.setBounds(419, 312, 89, 23);
		frmDensity.getContentPane().add(btnFind);
	}
}
