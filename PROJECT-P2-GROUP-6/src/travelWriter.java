import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Component;

import javax.swing.border.TitledBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;


public class travelWriter extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					travelWriter frame = new travelWriter();
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
	public travelWriter() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 800, 546);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Here your favourite country!", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Country that we provide!", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
		panel.setBounds(64, 278, 234, 115);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JList list = new JList();
		list.setBackground(Color.WHITE);
		list.setBounds(0, 0, 234, 138);
		panel.add(list);

		
		JButton btnChoose = new JButton("Press here!");
		btnChoose.setBackground(Color.WHITE);
		btnChoose.setFont(new Font("Constantia", Font.BOLD, 12));
		btnChoose.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM = new DefaultListModel();
				DLM.addElement("Africa");
				DLM.addElement("Asia");
				DLM.addElement("Australia");
				DLM.addElement("Europe");
				list.setModel(DLM);
			}
		});
		btnChoose.setBounds(244, 221, 350, 23);
		contentPane.add(btnChoose);
		
		JButton btnBooking = new JButton("Go for Booking");
		btnBooking.setBackground(Color.WHITE);
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Booking is currently unavailable due to some issue. We apoligize for the inconvenience. Thank you");
			}
		});
		btnBooking.setBounds(90, 462, 175, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(364, 261, 410, 235);
		contentPane.add(textPane);

		
		JButton AfricaButton = new JButton("Africa");
		AfricaButton.setBackground(Color.WHITE);
		AfricaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Island: Pulau Praslin \r\n"
						+ "\nTown: Seychelles \r\n"
						+ "\nAvailable room: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Bunny Chow, South Africa \r\n"
						+ "\nTransport use: Toyota Hilux \r\n");
			}
		});
		AfricaButton.setForeground(Color.BLACK);
		AfricaButton.setBounds(144, 65, 154, 70);
		contentPane.add(AfricaButton);
		
		JButton AsiaButton = new JButton("Asia");
		AsiaButton.setBackground(Color.WHITE);
		AsiaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Island: Pulau Pangkor\r\n"
						+ "\nTown: Perak \r\n"
						+ "\nAvailable room: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Satay\r\n"
						+ "\nTransport use : Proton X70\r\n");
			}
		});
		AsiaButton.setForeground(Color.BLACK);
		AsiaButton.setBounds(529, 65, 133, 70);
		contentPane.add(AsiaButton);
		
		JButton Australia = new JButton("Australia");
		Australia.setBackground(Color.WHITE);
		Australia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Island: Pulau Fraser \r\n"
						+ "\nTown: Queensland \r\n"
						+ "\nAvailable room: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food: Pavlova  \r\n"
						+ "\nTransport use : Ford Ranger \r\n");
			}
		});
		Australia.setForeground(Color.BLACK);
		Australia.setBounds(144, 146, 154, 64);
		contentPane.add(Australia);
		
		JButton Europe = new JButton("Europe");
		Europe.setBackground(Color.WHITE);
		Europe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Island: Pulau Lyngor \r\n"
						+ "\nTown: Norway \r\n"
						+ "\nAvailable room: \n 1) Single \r\n"
						+ "\n 2) Queen \r\n"
						+ "\n 3) King \r\n"
						+ "\nTraditional food : Waffles\r\n"
						+ "\nTransport use: Volkswagen Passat \r\n");
			}
		});
		Europe.setForeground(Color.BLACK);
		Europe.setBounds(529, 146, 133, 64);
		contentPane.add(Europe);
		
		JLabel lblNewLabel = new JLabel("Click here for the details!");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 31, 319, 23);
		contentPane.add(lblNewLabel);
			
		
	}
}