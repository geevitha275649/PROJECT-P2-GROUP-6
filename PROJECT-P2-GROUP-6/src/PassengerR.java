import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.border.MatteBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class PassengerR extends JFrame {

	private JPanel contentPane;
	private JFrame frame;
	private JTextField JtextMI;
	private JTextField JtextTmonths;
	private JTextField JtextPrice;
	private JTextField JtextContact;
	private JTextField JtextAddress;
	private JTextField JtextIcPassport;
	private JTextField JtextName;
	private JTextField JtextDate;
	private JTextField JtextRef;
	private JTable table;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					PassengerR frame = new PassengerR();
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
	public PassengerR() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1400, 800);
		contentPane = new JPanel();
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBackground(new Color(211, 211, 211));
		panel.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(47, 79, 79)));
		panel.setBounds(0, 10, 1360, 728);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JPanel title_1 = new JPanel();
		title_1.setBounds(21, 24, 1317, 85);
		panel.add(title_1);
		title_1.setLayout(null);
		title_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(119, 136, 153)));
		title_1.setBackground(new Color(176, 196, 222));
		
		JLabel titleLabel = new JLabel("Passenger Registration System");
		titleLabel.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 50));
		titleLabel.setBounds(262, 11, 821, 63);
		title_1.add(titleLabel);
		
		JPanel panel_1_1 = new JPanel();
		panel_1_1.setLayout(null);
		panel_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(112, 128, 144)));
		panel_1_1.setBackground(new Color(176, 196, 222));
		panel_1_1.setBounds(21, 120, 519, 517);
		panel.add(panel_1_1);
		
		JLabel lblRef = new JLabel("Ref No");
		lblRef.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblRef.setBounds(31, 45, 140, 27);
		panel_1_1.add(lblRef);
		
		JLabel lblDate = new JLabel("Date");
		lblDate.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblDate.setBounds(31, 82, 140, 27);
		panel_1_1.add(lblDate);
		
		JtextMI = new JTextField();
		JtextMI.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextMI.setBounds(281, 458, 199, 26);
		panel_1_1.add(JtextMI);
		JtextMI.setColumns(10);
		
		JtextTmonths = new JTextField();
		JtextTmonths.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextTmonths.setColumns(10);
		JtextTmonths.setBounds(281, 423, 199, 26);
		panel_1_1.add(JtextTmonths);
		
		JtextPrice = new JTextField();
		JtextPrice.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextPrice.setColumns(10);
		JtextPrice.setBounds(195, 365, 285, 26);
		panel_1_1.add(JtextPrice);
		
		JtextContact = new JTextField();
		JtextContact.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextContact.setColumns(10);
		JtextContact.setBounds(195, 268, 285, 26);
		panel_1_1.add(JtextContact);
		
		JtextAddress = new JTextField();
		JtextAddress.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextAddress.setColumns(10);
		JtextAddress.setBounds(195, 233, 285, 26);
		panel_1_1.add(JtextAddress);
		
		JtextIcPassport = new JTextField();
		JtextIcPassport.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextIcPassport.setColumns(10);
		JtextIcPassport.setBounds(195, 196, 285, 26);
		panel_1_1.add(JtextIcPassport);
		
		JtextName = new JTextField();
		JtextName.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextName.setColumns(10);
		JtextName.setBounds(195, 138, 285, 26);
		panel_1_1.add(JtextName);
		
		JtextDate = new JTextField();
		JtextDate.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextDate.setColumns(10);
		JtextDate.setBounds(195, 80, 285, 26);
		panel_1_1.add(JtextDate);
		
		JtextRef = new JTextField();
		JtextRef.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		JtextRef.setColumns(10);
		JtextRef.setBounds(195, 45, 285, 26);
		panel_1_1.add(JtextRef);
		
		JLabel lblName = new JLabel("Name");
		lblName.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblName.setBounds(31, 135, 154, 27);
		panel_1_1.add(lblName);
		
		JLabel lblPassport = new JLabel("IC / Passport No");
		lblPassport.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPassport.setBounds(31, 172, 154, 27);
		panel_1_1.add(lblPassport);
		
		JLabel lblCarModel = new JLabel("Address");
		lblCarModel.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblCarModel.setBounds(31, 230, 140, 27);
		panel_1_1.add(lblCarModel);
		
		JLabel lblNewLabel_1_2 = new JLabel("Contact No");
		lblNewLabel_1_2.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_2.setBounds(31, 267, 140, 27);
		panel_1_1.add(lblNewLabel_1_2);
		
		JLabel lblMonthlyInstallments = new JLabel("Cruise Package");
		lblMonthlyInstallments.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblMonthlyInstallments.setBounds(31, 327, 140, 27);
		panel_1_1.add(lblMonthlyInstallments);
		
		JLabel lblNewLabel_1_3 = new JLabel("Date of Booking");
		lblNewLabel_1_3.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_3.setBounds(31, 364, 140, 27);
		panel_1_1.add(lblNewLabel_1_3);
		
		JLabel lblPrice = new JLabel("Emergency Contact No");
		lblPrice.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblPrice.setBounds(31, 423, 240, 27);
		panel_1_1.add(lblPrice);
		
		JLabel lblNewLabel_1_4 = new JLabel("Total Payment (RM)");
		lblNewLabel_1_4.setFont(new Font("Bahnschrift", Font.BOLD, 19));
		lblNewLabel_1_4.setBounds(31, 460, 240, 27);
		panel_1_1.add(lblNewLabel_1_4);
		
		JComboBox cmbCarModel = new JComboBox();
		cmbCarModel.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbCarModel.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "Package A", "Package B", "Package C"}));
		cmbCarModel.setBounds(195, 327, 285, 27);
		panel_1_1.add(cmbCarModel);
		
		JComboBox cmbIcPassport = new JComboBox();
		cmbIcPassport.setFont(new Font("Bahnschrift", Font.PLAIN, 18));
		cmbIcPassport.setModel(new DefaultComboBoxModel(new String[] {"Make a Selection", "IC ", "Passport"}));
		cmbIcPassport.setBounds(195, 168, 285, 27);
		panel_1_1.add(cmbIcPassport);
		
		//JDateChooser dateChooser = new JDateChooser();
		//dateChooser.setBounds(195, 117, 285, 20);
		//panel_1_1.add(dateChooser);
		
		JPanel panel_1_2 = new JPanel();
		panel_1_2.setLayout(null);
		panel_1_2.setBorder(new MatteBorder(6, 6, 6, 6, (Color) new Color(112, 128, 144)));
		panel_1_2.setBackground(new Color(176, 196, 222));
		panel_1_2.setBounds(21, 648, 1317, 69);
		panel.add(panel_1_2);
		
		JButton btnNewButton = new JButton("Add Record");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
			
				DefaultTableModel model = (DefaultTableModel) table.getModel();
				model.addRow(new Object[]{
				JtextRef.getText(),
				JtextDate.getText(),
				//dateChooser.getToolTipText(),
				JtextName.getText(),
				JtextIcPassport.getText(),
				JtextAddress.getText(),
				JtextContact.getText(),
				JtextPrice.getText(),
				JtextTmonths.getText(),
				JtextMI.getText(),
				cmbCarModel.getSelectedItem(),
				cmbIcPassport.getSelectedItem(),
		});
				
			if (table.getSelectedRow() == -1){
				if (table.getRowCount() == 0){
					JOptionPane.showMessageDialog(null, "Registration Update is Confirmed", "Customer Registration System",
				JOptionPane.OK_OPTION);
				}
			}
		}	
		});
		btnNewButton.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton.setBounds(36, 11, 202, 47);
		panel_1_2.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Reset");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JtextRef.setText("");
				JtextDate.setText("");
				//dateChooser.setToolTipText("");
				JtextName.setText("");
				JtextIcPassport.setText("");
				JtextAddress.setText("");
				JtextContact.setText("");
				JtextPrice.setText("");
				JtextTmonths.setText("");
				JtextMI.setText("");
				cmbCarModel.setSelectedItem("Make a Selection");
				cmbIcPassport.setSelectedItem("Make a Selection");
				
			}
		});
		btnNewButton_1.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_1.setBounds(289, 11, 202, 47);
		panel_1_2.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Delete");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
		DefaultTableModel model = (DefaultTableModel) table.getModel();		
		if (table.getSelectedRow() == -1){
			if (table.getRowCount() == 0){
				JOptionPane.showMessageDialog(null, "No data to delete", "Customer Registration System", JOptionPane.OK_OPTION);
				
			}else {
				
				JOptionPane.showMessageDialog(null, "Select a row to delete", "Customer Registration System", JOptionPane.OK_OPTION);
			}
				
		}else {
			model.removeRow(table.getSelectedRow());
		}
			}
		});
		btnNewButton_2.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_2.setBounds(544, 11, 202, 47);
		panel_1_2.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("Print");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					table.print();
				}
				catch (java.awt.print.PrinterException e) {
					System.err.format("No Printer found", e.getMessage());
				}
			}
		});
		btnNewButton_3.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_3.setBounds(806, 11, 202, 47);
		panel_1_2.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Exit");
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				frame = new JFrame();
				if (JOptionPane.showConfirmDialog(frame, "Confirm if you wants to exit", "Customer Registration System",
						JOptionPane.YES_NO_OPTION) == JOptionPane.YES_NO_OPTION) {
				System.exit(0);
				}
			}
		});
		btnNewButton_4.setFont(new Font("Arial Black", Font.BOLD, 18));
		btnNewButton_4.setBounds(1061, 11, 202, 47);
		panel_1_2.add(btnNewButton_4);
		
		JPanel panel_1_1_1 = new JPanel();
		panel_1_1_1.setBounds(550, 120, 788, 517);
		panel.add(panel_1_1_1);
		panel_1_1_1.setLayout(null);
		panel_1_1_1.setBorder(new MatteBorder(10, 10, 10, 10, (Color) new Color(112, 128, 144)));
		panel_1_1_1.setBackground(new Color(176, 196, 222));
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 24, 768, 469);
		panel_1_1_1.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Ref No", "Date", "Name", "IC/Passport", "Address", "Contact No", "Cruise Package", "Date of Booking", "Emergency Contact No", "Total Payment (RM)"
			}
		));
		table.getColumnModel().getColumn(0).setPreferredWidth(47);
		table.getColumnModel().getColumn(1).setPreferredWidth(62);
		table.getColumnModel().getColumn(8).setPreferredWidth(55);
		scrollPane.setViewportView(table);
	}
}

