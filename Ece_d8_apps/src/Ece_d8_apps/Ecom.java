package Ece_d8_apps;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Ecom {

	private JFrame frame;
	int i=0;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Ecom window = new Ecom();
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
	public Ecom() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setFont(new Font("Tahoma", Font.BOLD, 20));
		frame.setBounds(100, 100, 1308, 779);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Ram's Shop");
		lblNewLabel.setFont(new Font("SansSerif", Font.BOLD, 30));
		lblNewLabel.setBounds(584, 40, 255, 74);
		frame.getContentPane().add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		lblNewLabel_1.setIcon(new ImageIcon("C:\\Users\\ramsr\\Desktop\\book1.png"));
		lblNewLabel_1.setBounds(90, 163, 334, 338);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon("C:\\Users\\ramsr\\Desktop\\book2.png"));
		lblNewLabel_2.setBounds(500, 163, 334, 338);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		lblNewLabel_3.setIcon(new ImageIcon("C:\\Users\\ramsr\\Desktop\\book3.png"));
		lblNewLabel_3.setBounds(901, 163, 361, 338);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("RS.450");
		lblNewLabel_4.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_4.setBounds(212, 531, 92, 24);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("RS.200");
		lblNewLabel_5.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5.setBounds(616, 531, 83, 21);
		frame.getContentPane().add(lblNewLabel_5);
		
		JLabel lblNewLabel_5_1 = new JLabel("RS.300");
		lblNewLabel_5_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		lblNewLabel_5_1.setBounds(1011, 531, 83, 21);
		frame.getContentPane().add(lblNewLabel_5_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paperback", "Kindle", "PDF"}));
		comboBox.setBounds(212, 565, 92, 21);
		frame.getContentPane().add(comboBox);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paperback", "Kindle", "PDF"}));
		comboBox_1.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_1.setBounds(607, 565, 92, 21);
		frame.getContentPane().add(comboBox_1);
		
		JComboBox comboBox_2 = new JComboBox();
		comboBox_2.setModel(new DefaultComboBoxModel(new String[] {"Select", "Paperback", "Kindle", "PDF"}));
		comboBox_2.setFont(new Font("Tahoma", Font.PLAIN, 15));
		comboBox_2.setBounds(1011, 562, 92, 21);
		frame.getContentPane().add(comboBox_2);
		
		JLabel lb = new JLabel("Cart : 0");
		lb.setFont(new Font("Tahoma", Font.BOLD, 20));
		lb.setBounds(1109, 65, 101, 33);
		frame.getContentPane().add(lb);
		
		JButton btnNewButton = new JButton("Add to cart");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart :"+i);
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton.setBounds(212, 607, 117, 33);
		frame.getContentPane().add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Add to cart");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart :"+i);
			}
		});
		btnNewButton_1.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_1.setBounds(599, 607, 117, 33);
		frame.getContentPane().add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Add to cart");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				i++;
				lb.setText("Cart :"+i);
			}
		});
		btnNewButton_2.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNewButton_2.setBounds(999, 607, 117, 33);
		frame.getContentPane().add(btnNewButton_2);
	}
}
