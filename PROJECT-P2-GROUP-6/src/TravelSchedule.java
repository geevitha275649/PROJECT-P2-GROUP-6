import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
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
import javax.swing.JFormattedTextField;


public class TravelSchedule extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TravelSchedule frame = new TravelSchedule();
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
	public TravelSchedule() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1036, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Click Here to see Packages Offered");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Packages Page. Thank you");
				
				Package fifthPage = new Package();
				fifthPage.setVisible(true);
			}
		});
		btnBooking.setBounds(313, 527, 350, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(280, 306, 404, 175);
		contentPane.add(textPane);

		
		JButton Thirdclass = new JButton("Third Class");
		Thirdclass.setBackground(Color.LIGHT_GRAY);
		Thirdclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Third Class - Silver Cruise\r\n"
						+ "\nAvailable : Jan-Mar & July-Sept\r\n"
						+ "\nBoarding Point : Jamaica\r\n"
						+ "\nDestination Point : Papua New Gunea Sea\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Thirdclass.setForeground(Color.BLACK);
		Thirdclass.setBounds(668, 158, 267, 98);
		contentPane.add(Thirdclass);
		
		JButton Secondclass = new JButton("Second Class");
		Secondclass.setBackground(Color.LIGHT_GRAY);
		Secondclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Second Class - Golden Star Cruise\r\n"
						+ "\nAvailable : Mac-May & Oct-Dec\r\n"
						+ "\nBoarding Point :  Sydney\r\n"
						+ "\nDestination Point : Netherland / Cambodia / Atlantic\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Secondclass.setForeground(Color.BLACK);
		Secondclass.setBounds(376, 158, 267, 98);
		contentPane.add(Secondclass);
		
		JButton firstclass = new JButton("First Class");
		firstclass.setBackground(Color.LIGHT_GRAY);
		firstclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("First Class - Premium Cruise\r\n"
						+ "\nAvailable : All time Available\r\n"
						+ "\nBoarding Point :  Washington\r\n"
						+ "\nDestination Point : Netherland / Cambodia / Atlantic\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		firstclass.setForeground(Color.BLACK);
		firstclass.setBounds(82, 158, 267, 98);
		contentPane.add(firstclass);
		
		JLabel lblNewLabel = new JLabel("Click the Class to know more about what is included in each class !");
		lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 26));
		lblNewLabel.setBounds(137, 83, 798, 42);
		contentPane.add(lblNewLabel);
			
		
	}
}
