package Ece_d8_apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JComboBox;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;

public class train {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					train window = new train();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public train() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 1314, 825);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Train Ticket");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(532, 51, 139, 33);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(391, 146, 48, 18);
		frame.getContentPane().add(lblNewLabel_1);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Miyapur", "JNTU", "KPHB", "Kukatpally"}));
		c1.setBounds(477, 203, 96, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Ameerpet", "Begumpet", "NIrupampet", "Rampally rural village"}));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c2.setBounds(477, 259, 96, 21);
		frame.getContentPane().add(c2);
		
		JComboBox c3 = new JComboBox();
		c3.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		c3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c3.setBounds(477, 311, 96, 21);
		frame.getContentPane().add(c3);
		
		t1 = new JTextField();
		t1.setBounds(477, 148, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=t1.getText();
			String fs=(String) c1.getSelectedItem();
			String ts=(String) c2.getSelectedItem();
			String t=(String) c3.getSelectedItem();
			int ticket=Integer.parseInt(t); 
			int cost=0;
			if(fs=="JNTU" && ts=="JNTU") {
				JOptionPane.showMessageDialog(btnNewButton, "Please check your input stations");
			}
			else if(fs=="JNTU" && ts=="Ameerpet") {
				cost=30;
				JOptionPane.showMessageDialog(btnNewButton, "Hello" + name + "\n From :" + fs + "\n To :" + ts + "\n Tickets :" + t + "\n Your Bill is :" + ticket*cost );		
			}
;			}
		});
		btnNewButton.setBounds(431, 369, 96, 33);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_2 = new JLabel("From");
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(391, 207, 48, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("To");
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(394, 263, 48, 18);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("Tickets");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_4.setBounds(391, 315, 62, 13);
		frame.getContentPane().add(lblNewLabel_4);
	}
}
