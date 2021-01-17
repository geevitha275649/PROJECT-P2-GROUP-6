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


public class facilities extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					facilities frame = new facilities();
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
	public facilities() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1036, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Click here to inquire about further information");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Inquiry Page. Thank you");
				
				InputOutputCC seventhPage = new InputOutputCC();
				seventhPage.setVisible(true);
			}
		});
		btnBooking.setBounds(313, 527, 350, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(280, 306, 404, 175);
		contentPane.add(textPane);

		
		JButton Thirdclass = new JButton("Silver Cruise");
		Thirdclass.setBackground(Color.LIGHT_GRAY);
		Thirdclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText(" Cruise - Silver Cruise\r\n"
						+ "\nInner Facility : Bar with swimming pool\r\n"
						+ "\nExterior Point :  Rest\r\n"
						+ "\nAmmenities : Condusive and five star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Thirdclass.setForeground(Color.BLACK);
		Thirdclass.setBounds(668, 158, 267, 98);
		contentPane.add(Thirdclass);
		
		JButton Secondclass = new JButton("Golden Star Cruise");
		Secondclass.setBackground(Color.LIGHT_GRAY);
		Secondclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Cruise - Golden Star Cruise\r\n"
						+ "\nInner Facility : Room Theatre\r\n"
						+ "\nExterior Point :  Elegant Theme with golden view sunrise and sunset\r\n"
						+ "\nAmmenities : Condusive and four star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		Secondclass.setForeground(Color.BLACK);
		Secondclass.setBounds(376, 158, 267, 98);
		contentPane.add(Secondclass);
		
		JButton firstclass = new JButton("Premium Cruise");
		firstclass.setBackground(Color.LIGHT_GRAY);
		firstclass.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Cruise - Premium Cruise\r\n"
						+ "\nInner Facility : Shopping Mall\r\n"
						+ "\nExterior Point :  Sky Garden\r\n"
						+ "\nAmmenities : Condusive and five star hospitality\r\n"
						+ "\nNote: All cruise are available on specified months but cruises must be booked a month earlier and only at weekdays.\r\n"
				        + "\nWeekend Bookings will be terminated. Thank you.\r\n"
						);
			}
		});
		firstclass.setForeground(Color.BLACK);
		firstclass.setBounds(82, 158, 267, 98);
		contentPane.add(firstclass);
		
		JLabel lblNewLabel = new JLabel("Click the Cruise to know about its facility !");
		lblNewLabel.setFont(new Font("Javanese Text", Font.PLAIN, 26));
		lblNewLabel.setBounds(280, 76, 798, 42);
		contentPane.add(lblNewLabel);
			
		
	}
}
