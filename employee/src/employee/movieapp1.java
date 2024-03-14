    package employee;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.BorderLayout;
import javax.swing.ImageIcon;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class movieapp1 {  

	private JFrame frame;
	private JTextField tb1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					movieapp1 window = new movieapp1();
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
	public movieapp1() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 557, 468);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel_2 = new JLabel("MOVIE");
		lblNewLabel_2.setForeground(new Color(255, 255, 255));
		lblNewLabel_2.setBounds(147, 192, 46, 14);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("No Of Tickets");
		lblNewLabel_3.setForeground(new Color(255, 255, 255));
		lblNewLabel_3.setBounds(147, 256, 66, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("MOVIE APP");
		lblNewLabel_4.setForeground(new Color(255, 255, 255));
		lblNewLabel_4.setBounds(269, 60, 66, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		tb1 = new JTextField();
		tb1.setBounds(249, 101, 86, 20);
		frame.getContentPane().add(tb1);
		tb1.setColumns(10);
		
		JComboBox cb1 = new JComboBox();
		cb1.setModel(new DefaultComboBoxModel(new String[] {"select", "RRR", "KGF", "GAAMI "}));
		cb1.setForeground(new Color(0, 0, 0));
		cb1.setBounds(248, 184, 87, 22);
		frame.getContentPane().add(cb1);
		
		JComboBox cb2 = new JComboBox();
		cb2.setModel(new DefaultComboBoxModel(new String[] {"select", "1", "2", "3", "4", "5", "6"}));
		cb2.setBounds(248, 252, 87, 22);
		frame.getContentPane().add(cb2);
		
		JButton btnNewButton = new JButton("BILL");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int bill=0;
				String name=tb1.getText();
				String movie=(String) cb1.getSelectedItem();
				String tickets=(String) cb2.getSelectedItem();
				int nt=Integer.parseInt(tickets);
				if(movie.equals("RRR"))
				{
					bill=bill+150*nt;
				}
				if(movie.equals("KGF"))
				{
					bill=bill+200*nt;
				}
				if(movie.equals("GAAMI"))
				{
					bill=bill+100*nt;
				}
				int res=0;
				res=JOptionPane.showConfirmDialog(btnNewButton,"name"+name+"\nmovie "+movie+"\n number of tickets "+tickets+"\n amount "+bill);
				int YES_OPTION=0;
				if(res==YES_OPTION)
				{
					JOptionPane.showMessageDialog(btnNewButton,"booking confirmed");
				}
				else
				{
					JOptionPane.showMessageDialog(btnNewButton,"booking canceled");
				}
			}	
		});
		btnNewButton.setBounds(246, 373, 89, 23);
		frame.getContentPane().add(btnNewButton);
		
		JLabel lblNewLabel_1 = new JLabel("NAME");
		lblNewLabel_1.setForeground(new Color(255, 255, 255));
		lblNewLabel_1.setBounds(147, 107, 46, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\on line\\Downloads\\ll (1).jpg"));
		lblNewLabel.setBounds(0, 0, 541, 429);
		frame.getContentPane().add(lblNewLabel);
	}
}
