import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CRUISEGUI extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CRUISEGUI frame = new CRUISEGUI();
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
	public CRUISEGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 674, 465);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Passenger Detail Registration");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				

				PassengerR thirdPage = new PassengerR();
				thirdPage.setVisible(true);
				
			}
		});
		btnNewButton.setBounds(74, 36, 173, 72);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Travel Schedule");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TravelSchedule fourthPage = new TravelSchedule();
				fourthPage.setVisible(true);
				
			}
		});
		btnNewButton_1.setBounds(276, 36, 134, 72);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Cruise Package");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Package fifthPage = new Package();
				fifthPage.setVisible(true);
			}
		});
		btnNewButton_2.setBounds(450, 36, 134, 72);
		contentPane.add(btnNewButton_2);
		
		JButton btnNewButton_2_1 = new JButton("Cruise Facilities");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				facilities sixthPage = new facilities();
				sixthPage.setVisible(true);
				
			}
		});
		btnNewButton_2_1.setBounds(166, 150, 134, 72);
		contentPane.add(btnNewButton_2_1);
		
		JButton btnNewButton_3 = new JButton("Inquiries");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				InputOutputCC seventhPage = new InputOutputCC();
				seventhPage.setVisible(true);
			}
		});
		btnNewButton_3.setBounds(371, 150, 146, 72);
		contentPane.add(btnNewButton_3);
	}
}
