package Ece_d8_apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.DefaultComboBoxModel;
import java.awt.Color;

public class movietickets {

	private JFrame frame;
	private JTextField t1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movietickets window = new movietickets();
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
	public movietickets() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(Color.BLACK);
		frame.getContentPane().setForeground(Color.WHITE);
		frame.setBounds(100, 100, 1266, 781);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Movie Ticket Booking");
		lblNewLabel.setForeground(Color.WHITE);
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		lblNewLabel.setBounds(508, 45, 225, 60);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Name");
		lblNewLabel_1.setForeground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(360, 168, 48, 28);
		frame.getContentPane().add(lblNewLabel_1);
		
		t1 = new JTextField();
		t1.setBounds(479, 175, 96, 19);
		frame.getContentPane().add(t1);
		t1.setColumns(10);
		
		JLabel lblNewLabel_2 = new JLabel("Movie");
		lblNewLabel_2.setForeground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_2.setBounds(360, 245, 48, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("Tickets");
		lblNewLabel_3.setForeground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel_3.setBounds(360, 315, 48, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JComboBox c1 = new JComboBox();
		c1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Pokiri", "Khaleja", "Okkadu"}));
		c1.setBounds(479, 241, 96, 21);
		frame.getContentPane().add(c1);
		
		JComboBox c2 = new JComboBox();
		c2.setModel(new DefaultComboBoxModel(new String[] {"Select", "1", "2", "3", "4", "5", "6"}));
		c2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		c2.setBounds(479, 311, 96, 21);
		frame.getContentPane().add(c2);
		
		JButton btnNewButton = new JButton("Book");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			String name=t1.getText();
			String movie=(String) c1.getSelectedItem();
			String tickets=(String) c2.getSelectedItem();
			int t=Integer.parseInt(tickets);
			int bill=t*195;
			JOptionPane.showMessageDialog(btnNewButton, "Hello "+name+"\n You have booked"+" "+ tickets+" Tickets for the Movie "+movie+"\n Your Bill is: "+bill);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(419, 367, 85, 36);
		frame.getContentPane().add(btnNewButton);
	}
}
