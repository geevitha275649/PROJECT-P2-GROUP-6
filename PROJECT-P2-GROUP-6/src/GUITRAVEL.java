import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.MatteBorder;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.awt.event.ActionEvent;

public class GUITRAVEL extends JFrame {
	
	

	private JPanel contentPane;
	private JTextField tfDOB;
	private JTextField tfPA;
	private JTextField tfIC;
	private JTextField tfName;
	private JTextField tfDate;
	private JTextField tfPOB;
	private JTextField tfEA;
	private JTextField tfOpinion;
	private JLabel lblDate;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUITRAVEL frame = new GUITRAVEL();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public GUITRAVEL() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 770);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(0, 0, 0));
		panel.setBackground(new Color(176, 224, 230));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 0, 1370, 731);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Jom Kasi Travel System");
		lblNewLabel.setFont(new Font("STXingkai", Font.BOLD, 90));
		lblNewLabel.setBounds(291, 26, 889, 91);
		panel.add(lblNewLabel);
		
		JLabel lblDate;
		lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDate.setBounds(118, 181, 179, 29);
		panel.add(lblDate);
		
		JLabel lblName = new JLabel("Full Name as per IC");
		lblName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblName.setBounds(118, 221, 179, 29);
		panel.add(lblName);
		
		JLabel lblIC = new JLabel("Identity Card No");
		lblIC.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblIC.setBounds(118, 261, 179, 29);
		panel.add(lblIC);
		
		JLabel lblPA = new JLabel("Permanent Address");
		lblPA.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPA.setBounds(118, 301, 179, 29);
		panel.add(lblPA);
		
		JLabel lblDOB = new JLabel("Date of Birth");
		lblDOB.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblDOB.setBounds(118, 341, 179, 29);
		panel.add(lblDOB);
		
		JLabel lblPOB = new JLabel("Place of Birth");
		lblPOB.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblPOB.setBounds(118, 381, 179, 29);
		panel.add(lblPOB);
		
		JLabel lblEA = new JLabel("Email Address");
		lblEA.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblEA.setBounds(118, 421, 179, 29);
		panel.add(lblEA);
		
		JLabel lblOpinion = new JLabel("Tell us why do you interested in Jom Kasi Travel System (JKTS) :");
		lblOpinion.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		lblOpinion.setBounds(118, 471, 503, 29);
		panel.add(lblOpinion);
		
		tfDOB = new JTextField();
		tfDOB.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfDOB.setBounds(339, 341, 209, 29);
		panel.add(tfDOB);
		tfDOB.setColumns(10);
		
		tfPA = new JTextField();
		tfPA.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfPA.setColumns(10);
		tfPA.setBounds(339, 301, 416, 29);
		panel.add(tfPA);
		
		tfIC = new JTextField();
		tfIC.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfIC.setColumns(10);
		tfIC.setBounds(339, 261, 209, 29);
		panel.add(tfIC);
		
		tfName = new JTextField();
		tfName.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfName.setColumns(10);
		tfName.setBounds(339, 218, 209, 29);
		panel.add(tfName);
		
		tfDate = new JTextField();
		tfDate.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfDate.setColumns(10);
		tfDate.setBounds(339, 178, 137, 29);
		panel.add(tfDate);
		
		tfPOB = new JTextField();
		tfPOB.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfPOB.setColumns(10);
		tfPOB.setBounds(339, 381, 209, 29);
		panel.add(tfPOB);
		
		tfEA = new JTextField();
		tfEA.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfEA.setColumns(10);
		tfEA.setBounds(339, 421, 209, 29);
		panel.add(tfEA);
		
		tfOpinion = new JTextField();
		tfOpinion.setFont(new Font("Times New Roman", Font.PLAIN, 19));
		tfOpinion.setColumns(10);
		tfOpinion.setBounds(118, 510, 492, 29);
		panel.add(tfOpinion);
		
		JButton btnAddData = new JButton("Add Data");
		btnAddData.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Travel traveller;
				TravelOperation travelOperation = new TravelOperation();
				String Date = tfDate.getText();
				String Name = tfName.getText();
				String IC = tfIC.getText();
				String PA = tfPA.getText();
				String DOB = tfDOB.getText();
				String POB = tfPOB.getText();
				String EA = tfEA.getText();
				String Opinion = tfOpinion.getText();
				
					
				traveller = new Travel( Date,  Name,  IC,  PA,  DOB,
						   POB, EA,
						 Opinion);	
				try {
					travelOperation.addRecord(traveller);
				} catch (IOException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
			}
		});
		btnAddData.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnAddData.setBounds(80, 630, 137, 40);
		panel.add(btnAddData);
		
		JButton btnSearchData = new JButton("Search Data");
		btnSearchData.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSearchData.setBounds(253, 630, 137, 40);
		panel.add(btnSearchData);
		
		JButton btnDisplayData = new JButton("Display Data");
		btnDisplayData.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDisplayData.setBounds(429, 630, 137, 40);
		panel.add(btnDisplayData);
		
		JButton btnUpdate = new JButton("Update");
		btnUpdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnUpdate.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnUpdate.setBounds(618, 630, 137, 40);
		panel.add(btnUpdate);
		
		JButton btnDelete = new JButton("Delete");
		btnDelete.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnDelete.setBounds(795, 630, 137, 40);
		panel.add(btnDelete);
		
		JButton btnReset = new JButton("Reset");
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				tfDate.setText("");
				tfName.setText("");
				tfIC.setText("");
				tfPA.setText("");
				tfDOB.setText("");
				tfPOB.setText("");
				tfEA.setText("");
				tfOpinion.setText("");
			
			}
		});
		btnReset.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnReset.setBounds(978, 630, 137, 40);
		panel.add(btnReset);
		
		JButton btnExit = new JButton("Next");
		btnExit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				MainGUITRAVEL secondPage = new MainGUITRAVEL();
				secondPage.setVisible(true);
			}
		});
		btnExit.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnExit.setBounds(1156, 630, 137, 40);
		panel.add(btnExit);
		
		JTextArea textArea = new JTextArea();
		textArea.setBounds(978, 185, 319, 361);
		panel.add(textArea);
		
		JLabel lblIconNextButton = new JLabel("");
		Image img5 = new ImageIcon(this.getClass().getResource("/iconNext.png")).getImage();
		lblIconNextButton.setIcon(new ImageIcon(img5));
		lblIconNextButton.setBounds(1304, 630, 56, 40);
		panel.add(lblIconNextButton);
		
	}
}


	
