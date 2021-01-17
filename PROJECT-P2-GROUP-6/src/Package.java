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


public class Package extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Package frame = new Package();
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
	public Package() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1071, 788);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "We are Here to Serve You. Your Best Travel Partner", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnBooking = new JButton("Go for Facility Page");
		btnBooking.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
			    "Now you will be redirected to Facility Page. Thank you");
				
				facilities sixthPage = new facilities();
				sixthPage.setVisible(true);
			}
		});
		btnBooking.setBounds(622, 592, 350, 23);
		contentPane.add(btnBooking);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(587, 158, 404, 380);
		contentPane.add(textPane);

		
		JButton SagaButton = new JButton("Package A");
		SagaButton.setBackground(Color.LIGHT_GRAY);
		SagaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Package : A - Couple Ticket\r\n"
						+ "\nPrice : RM 3570\r\n"
						+ "\nPeriod : 3 day 2 nights - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Swimming pool and Bar facility are free of charge\r\n"
						);
			}
		});
		SagaButton.setForeground(Color.BLACK);
		SagaButton.setBounds(193, 158, 267, 98);
		contentPane.add(SagaButton);
		
		JButton PersonaButton = new JButton("Package B");
		PersonaButton.setBackground(Color.LIGHT_GRAY);
		PersonaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Package : B - Family Ticket\r\n"
						+ "\nPrice : RM 4900\r\n"
						+ "\nPeriod : 4 day 3 nights - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Restaurant - Dinner and lunch for the first day and last day will be free of charge\r\n"
						);
			}
		});
		PersonaButton.setForeground(Color.BLACK);
		PersonaButton.setBounds(193, 289, 267, 110);
		contentPane.add(PersonaButton);
		
		JButton X50Button = new JButton("Package C");
		X50Button.setBackground(Color.LIGHT_GRAY);
		X50Button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Package : C - Single Ticket\r\n"
						+ "\nPrice : RM 4900\r\n"
						+ "\nPeriod : 2 day 1 night - Days are fixed. Extra days will be charged differently\r\n"
						+ "\nSpecial Offer : Can purchase items for RM200 in particular shops for free - T&C Applied.\r\n"
						);
			}
		});
		X50Button.setForeground(Color.BLACK);
		X50Button.setBounds(193, 438, 267, 98);
		contentPane.add(X50Button);
		
		JLabel lblNewLabel = new JLabel("Click the Package to see what is included!");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(181, 107, 319, 23);
		contentPane.add(lblNewLabel);
			
		
	}
}
