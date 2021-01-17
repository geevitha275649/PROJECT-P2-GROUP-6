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
import javax.management.relation.RoleList;
import javax.swing.AbstractButton;
import javax.swing.DefaultListModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.lang.StackWalker.StackFrame;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import javax.swing.JComboBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JSplitPane;
import java.awt.SystemColor;


public class Event extends JFrame {

	private JPanel contentPane;
	private JTextField showF;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Event frame = new Event();
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
	public Event() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1347, 1006);
		contentPane = new JPanel();
		contentPane.setBorder(new TitledBorder(new EtchedBorder(EtchedBorder.LOWERED, new Color(255, 255, 255), new Color(160, 160, 160)), "Here we serve you to your own Event!", TitledBorder.CENTER, TitledBorder.TOP, null, new Color(0, 0, 255)));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextPane textPane = new JTextPane();
		textPane.setFont(new Font("Tahoma", Font.PLAIN, 11));
		textPane.setBackground(Color.WHITE);
		textPane.setBounds(846, 31, 404, 466);
		contentPane.add(textPane);
		

		
		JButton WeddingButton = new JButton("Wedding");
		WeddingButton.setBackground(Color.PINK);
		WeddingButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Event : Wedding Event\r\n"
						+ "\nTheme:\n 1) Beach\r\n"
						+ " 2) Garden\r\n"
						+ " 3) Classic and Tradisional\r\n"
						+ " 4) Contemporary and Glamorous\r\n"
						+ " 5) Other: ____\r\n"
						+ "\nPrice Rate: RM 1000 - RM 3000 ++\r\n"
						+ "\nColour:\n 1) Black and White\r\n"
						+ " 2) Navy Blue\r\n"
						+ " 3) Pink and White\r\n"
						+ " 4) Other: ____\r\n"
						+ "\nMeals:\n 1) Lobster with mash potatoes\r\n"
						+ " 2) Vegetarians Vegetables\r\n"
						+ " 3) Grilled chicken\r\n"
						+ " 4) Tradisional food\r\n"
						+ "\nWedding Studiobooth: \n 1) Studiobooth\r\n"
						+ " 2) Photobox\r\n"
						+ "\nFree gift: \n 1) Flowers\r\n"
						+ " 2) Photobooth Design\r\n"
						+ " 3) Veil\r\n"
						+ " 4) 100 Pictures");
			}
		});
		WeddingButton.setForeground(Color.BLACK);
		WeddingButton.setBounds(66, 104, 106, 49);
		contentPane.add(WeddingButton);
		
		JButton BirthdayPartyEventButton = new JButton("Birthday");
		BirthdayPartyEventButton.setBackground(Color.PINK);
		BirthdayPartyEventButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Event : Birthday Part Event\r\n"
						+ "\nTheme:\n 1) Beach\r\n"
						+ " 2) Garden\r\n"
						+ " 3) Halloween\r\n"
						+ " 4) Contemporary and Glamorous\r\n"
						+ " 5) Other: ____\r\n"
						+ "\nPrice Rate: RM 200 - RM 1000 ++\r\n"
						+ "\nColour:\n 1) Black and White\r\n"
						+ " 2) Navy Blue\r\n"
						+ " 3) Pink and White\r\n"
						+ " 4) Other: ____\r\n"
						+ "\nMeals:\n 1) Chicken Chop\r\n"
						+ " 2) Lamb Chop\r\n"
						+ " 3) Grilled chicken\r\n"
						+ " 4) Full of Cake\r\n"
						+ "\nBooth: \n 1) Studiobooth\r\n"
						+ " 2) Photobox\r\n"
						+ "\nFree gift: \n 1) Flowers\r\n"
						+ " 2) Doorgift\r\n"
						+ " 3) Price\r\n"
						+ " 4) 100 Pictures");
			}
		});
		BirthdayPartyEventButton.setForeground(Color.BLACK);
		BirthdayPartyEventButton.setBounds(475, 104, 106, 49);
		contentPane.add(BirthdayPartyEventButton);
		
		JButton ConferencesEvent = new JButton("Conferences");
		ConferencesEvent.setBackground(Color.PINK);
		ConferencesEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Event : Conferences Event\r\n"
						+ "\nTheme:\n 1) Formal\r\n"
						+ " 2) Indoor\r\n"
						+ " 3) Outdoor\r\n"
						+ " 4) Other: ____\r\n"
						+ "\nPrice Rate: RM 200 - RM 1000 ++\r\n"
						+ "\nColour:\n 1) Black and White\r\n"
						+ " 2) Navy Blue\r\n"
						+ " 3) Pink and White\r\n"
						+ " 4) Other: ____\r\n"
						+ "\nMeals:\n 1) Chicken Chop\r\n"
						+ " 2) Lamb Chop\r\n"
						+ " 3) Grilled chicken\r\n");
			}
		});
		ConferencesEvent.setForeground(Color.BLACK);
		ConferencesEvent.setBounds(66, 338, 106, 49);
		contentPane.add(ConferencesEvent);
		
		JButton AwardsandCompetitionEvent = new JButton("Awards and Competition");
		AwardsandCompetitionEvent.setBackground(Color.PINK);
		AwardsandCompetitionEvent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textPane.setText("Event : Awards and Competition Event\r\n"
						+ "\nTheme:\n 1) Beach\r\n"
						+ " 2) Garden\r\n"
						+ " 3) Indoor\r\n"
						+ " 4) Contemporary and Glamorous\r\n"
						+ " 5) Other: ____\r\n"
						+ "\nPrice Rate: RM 500 - RM 1000 ++\r\n"
						+ "\nColour:\n 1) Black and White\r\n"
						+ " 2) Navy Blue\r\n"
						+ " 3) Pink and White\r\n"
						+ " 4) Other: ____\r\n"
						+ "\nMeals:\n 1) Chicken Chop\r\n"
						+ " 2) Lamb Chop\r\n"
						+ " 3) Grilled chicken\r\n"
						+ " 4) Full of Cake\r\n"
						+ "\nBooth: \n 1) Studiobooth\r\n"
						+ " 2) Photobox\r\n"
						+ "\nFree gift: \n 1) Flowers\r\n"
						+ " 2) Doorgift\r\n"
						+ " 3) Price\r\n"
						+ " 4) 100 Pictures");
			}
		});
		AwardsandCompetitionEvent.setForeground(Color.BLACK);
		AwardsandCompetitionEvent.setBounds(475, 338, 106, 49);
		contentPane.add(AwardsandCompetitionEvent);
		
		JLabel lblNewLabel = new JLabel("Click here for the details!");
		lblNewLabel.setFont(new Font("Constantia", Font.BOLD, 14));
		lblNewLabel.setBounds(10, 31, 319, 23);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/wedding.png")).getImage();
		lblNewLabel_1.setIcon(new ImageIcon(img));
		lblNewLabel_1.setBounds(201, 49, 156, 158);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/conference.png")).getImage();
		lblNewLabel_2.setIcon(new ImageIcon(img1));
		lblNewLabel_2.setBounds(201, 259, 234, 198);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/birthday.png")).getImage();
		lblNewLabel_3.setIcon(new ImageIcon(img2));
		lblNewLabel_3.setBounds(620, 49, 156, 158);
		contentPane.add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/award.png")).getImage();
		lblNewLabel_4.setIcon(new ImageIcon(img3));
		lblNewLabel_4.setBounds(620, 299, 156, 158);
		contentPane.add(lblNewLabel_4);
		
		JList list = new JList();
		list.setBounds(298, 561, 386, 171);
		contentPane.add(list);
		
		JButton btnNewButton = new JButton("\"Click here if you want to choose the type of Event!\"");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 11));
		btnNewButton.setForeground(SystemColor.desktop);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultListModel DLM = new DefaultListModel ();
				DLM.addElement("Wedding Event");
				DLM.addElement("Birthday Party Event");
				DLM.addElement("Conference Event");
				DLM.addElement("Award and Competition Event");
				list.setModel(DLM);
			}
		});
		btnNewButton.setBounds(83, 485, 398, 49);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("\"For Booking\"");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(contentPane, 
					    "Booking is currently unavailable due to Covid19. Sorry inconvenience. Thank you");
			}
		});
		btnNewButton_1.setBounds(525, 756, 193, 49);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Exit");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.exit(0);
			}
		});
		btnNewButton_2.setBounds(341, 833, 116, 38);
		contentPane.add(btnNewButton_2);
			
		
	}}