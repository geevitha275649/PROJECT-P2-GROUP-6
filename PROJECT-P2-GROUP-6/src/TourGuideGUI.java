import java.awt.EventQueue;
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
import java.awt.SystemColor;

public class TourGuideGUI extends JFrame {
	
private JPanel contentPane;
private JTextField showF;

/**
 * Launch the application.
 */
public static void main(String[] args) {
	EventQueue.invokeLater(new Runnable() {
		public void run() {
			try {
				TourGuideGUI frame = new TourGuideGUI();
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
public TourGuideGUI() {
	setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	setBounds(100, 100, 800, 546);
	contentPane = new JPanel();
	contentPane.setBackground(SystemColor.text);
	contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Serving you with our service!", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
	setContentPane(contentPane);
	contentPane.setLayout(null);
	
	JPanel panel = new JPanel();
	panel.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Service that available!", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 0)));
	panel.setBounds(60, 175, 234, 115);
	contentPane.add(panel);
	panel.setLayout(null);
	
	JList list = new JList();
	list.setBounds(10, 23, 216, 81);
	panel.add(list);
	list.setBackground(Color.LIGHT_GRAY);

	
	JButton btnChoose = new JButton("Choose your service!");
	btnChoose.setBackground(Color.WHITE);
	btnChoose.setFont(new Font("Constantia", Font.BOLD, 12));
	btnChoose.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			DefaultListModel DLM = new DefaultListModel();
			DLM.addElement("City Tour");
			DLM.addElement("Culture Tour");
			DLM.addElement("Adventure Tour");
			DLM.addElement("Forest Tour");
			list.setModel(DLM);
		}
	});
	btnChoose.setBounds(9, 109, 350, 23);
	contentPane.add(btnChoose);
	
	JButton btnBooking = new JButton("Book Now");
	btnBooking.setBackground(SystemColor.text);
	btnBooking.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent e) {
			JOptionPane.showMessageDialog(contentPane, 
		    "Booking is currently unavailable due to Covid19. We apoligize for the inconvenience. Thank you");
		}
	});
	btnBooking.setBounds(94, 339, 175, 23);
	contentPane.add(btnBooking);
	
	JTextPane textPane = new JTextPane();
	textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
	textPane.setBackground(Color.LIGHT_GRAY);
	textPane.setBounds(370, 230, 404, 268);
	contentPane.add(textPane);

	
	JButton CityTourButton = new JButton("City Tour");
	CityTourButton.setBackground(Color.WHITE);
	CityTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : City Tour\r\n"
					 	+ "\n | Welcome to City Tour |\r\n "
		                + "\n Tour Guide Name: Ms. Farah\r\n"
		                + "\n Age: 25\r\n"
		                + "\n Suggestion of Places: \r\n"
		                + "\n 1. Visit Museum\r\n"
		                + "\n 2. city sighseeing\r\n"
		                + "\n 3. visit main landmarks\r\n"
		                + "\n Suggestion of Transportation: Bus");
		}
	});
	CityTourButton.setForeground(Color.BLACK);
	CityTourButton.setBounds(386, 45, 106, 49);
	contentPane.add(CityTourButton);
	
	JButton CultureTourButton = new JButton("Culture Tour");
	CultureTourButton.setBackground(Color.WHITE);
	CultureTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Culture Tour"
	                + "\n | Welcome to Culture Tour |\r\n"
	                + "\n Tour Guide Name: Ms. Gaya\r\n"
	                + "\n Age: 29\r\n"
	                + "\n Suggestion of Places: \r\n"
	                + "\n 1. Craft Museum \r\n"
	                + "\n 2. Traditional Culinary Institution \r\n"
	                + "\n 3. Culture Expo \r\n"
	                + "\n Suggestion of Transportation: Bus");
		}
	});
	CultureTourButton.setForeground(Color.BLACK);
	CultureTourButton.setBounds(635, 45, 106, 49);
	contentPane.add(CultureTourButton);
	
	JButton AdventureTourButton = new JButton("Adventure Tour");
	AdventureTourButton.setBackground(Color.WHITE);
	AdventureTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Adventure Tour\r\n"
						+ "\n | Welcome to Adventure Tour | \r\n"
		                + "\n Tour Guide Name: Mr.Raja \r\n"
		                + "\n Age: 33 \r\n"
		                + "\n Suggestion of Places: \r\n"
		                + "\n 1) Adam's Peak (Sri Lanka)\r\n"
		                + "\n Suggestion of Transportation: Bus");
		}
	});
	AdventureTourButton.setForeground(Color.BLACK);
	AdventureTourButton.setBounds(386, 146, 106, 49);
	contentPane.add(AdventureTourButton);
	
	JButton ForestTourButton = new JButton("Forest Tour");
	ForestTourButton.setBackground(Color.WHITE);
	ForestTourButton.addActionListener(new ActionListener() {
		public void actionPerformed(ActionEvent arg0) {
			textPane.setText("Service Information : Forest Tour\r\n"
					+ "\n | Welcome to Forest Tour | \r\n"
	                + "\n Tour Guide Name: Mr.Ali\r\n"
	                + "\n Age: 27\r\n"
	                + "\n Suggestion of Places: \r\n"
	                + "\n 1. Mossy Forest Gunung Brinchang \r\n"
	                + "\n 2. Gunung Tahan Exploration\r\n"
	                + "\n Suggestion of Transportation: \r\n"
	                + "1) Bus");
		}
	});
	ForestTourButton.setForeground(Color.BLACK);
	ForestTourButton.setBounds(635, 146, 106, 49);
	contentPane.add(ForestTourButton);
	
	JLabel lblNewLabel = new JLabel("Service Information!");
	lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
	lblNewLabel.setBounds(35, 25, 319, 23);
	contentPane.add(lblNewLabel);
		
	
}
}