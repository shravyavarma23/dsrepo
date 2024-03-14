package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import java.awt.Color;
import java.awt.Font;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class metroapp {

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					metroapp window = new metroapp();
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
	public metroapp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("METRO TICKET BOOKING");
		lblNewLabel_1.setForeground(new Color(255, 255, 128));
		lblNewLabel_1.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_1.setBounds(109, 11, 149, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("NAME");
		lblNewLabel_2.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_2.setForeground(new Color(128, 255, 0));
		lblNewLabel_2.setBounds(44, 58, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("SOURCE");
		lblNewLabel_3.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_3.setForeground(new Color(128, 255, 0));
		lblNewLabel_3.setBounds(44, 96, 46, 19);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("DESTINATION");
		lblNewLabel_4.setForeground(new Color(128, 255, 0));
		lblNewLabel_4.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_4.setBounds(44, 136, 78, 19);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("No Of Tickets");
		lblNewLabel.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel.setForeground(new Color(128, 255, 0));
		lblNewLabel.setBounds(44, 186, 78, 14);
		frame.getContentPane().add(lblNewLabel);
		
		tb1 = new JTextField();
		tb1.setBounds(160, 55, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "KPHB", "AMEERPET", "MIYAPUR", "JNTU", "ASSEMBLY"}));
		cb1.setBounds(160, 96, 86, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"SELECT", "LAKADIKAPUL", "SR NAGAR", "PANJAGUTTA", "GANDHI BHAVAN"}));
		cb2.setBounds(160, 134, 86, 22);
		frame.getContentPane().add(cb2);
		
		JComboBox cb3 = new JComboBox();
		cb3.setModel(new DefaultComboBoxModel(new String[] {"1", "2", "3", "4", "5"}));
		cb3.setBounds(160, 178, 86, 22);
		frame.getContentPane().add(cb3);
		
		JButton btnNewButton = new JButton("SUBMIT");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String name=tb1.getText();
				String source=(String) cb1.getSelectedItem();
				String destination=(String) cb2.getSelectedItem();
				String tickets=(String) cb3.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(source.equals(destination))
				{
					JOptionPane.showMessageDialog(btnNewButton,"please check station");
				}
				else
				{
					int bill=nt*45;
					JOptionPane.showMessageDialog(btnNewButton,"name"+name+"\nsource "+source+"\n destination "+destination+"\nno of tickets "+tickets+"\namount"+bill);
				}
			}
		});
		btnNewButton.setForeground(new Color(128, 255, 0));
		btnNewButton.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		btnNewButton.setBounds(132, 227, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_5 = new JLabel("SUBMIT");
		lblNewLabel_5.setFont(new Font("MS PGothic", Font.BOLD | Font.ITALIC, 11));
		lblNewLabel_5.setForeground(new Color(128, 255, 0));
		lblNewLabel_5.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\MM (1).jpg"));
		lblNewLabel_5.setBounds(0, 0, 434, 261);
		frame.getContentPane().add(lblNewLabel_5);
	}

}
