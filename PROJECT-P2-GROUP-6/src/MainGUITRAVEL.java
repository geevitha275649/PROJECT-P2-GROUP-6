import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.Image;
import java.awt.Color;
import javax.swing.JLabel;

public class MainGUITRAVEL extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MainGUITRAVEL frame = new MainGUITRAVEL();
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
	public MainGUITRAVEL() {
		setBackground(new Color(176, 224, 230));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1386, 749);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(176, 224, 230));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTourGuide = new JButton("Tour Guide");
		btnTourGuide.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTourGuide.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				TourGuideGUI fourthtopic = new TourGuideGUI();
				fourthtopic.setVisible(true);
			}
		});
		btnTourGuide.setBounds(107, 193, 263, 59);
		contentPane.add(btnTourGuide);
		
		JButton btnTravelAgent = new JButton("Travel Agent");
		btnTravelAgent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				travelAgent secondtopic = new travelAgent();
				secondtopic.setVisible(true);
			}
		});
		btnTravelAgent.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTravelAgent.setBounds(107, 511, 263, 59);
		contentPane.add(btnTravelAgent);
		
		JButton btnCruiseConsultant = new JButton("Cruise Consultant");
		btnCruiseConsultant.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CRUISEGUI thirdtopic = new CRUISEGUI();
				thirdtopic.setVisible(true);
			}
		});
		btnCruiseConsultant.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnCruiseConsultant.setBounds(544, 364, 263, 59);
		contentPane.add(btnCruiseConsultant);
		
		JButton btnTravelwb = new JButton("Travel Writer / Blogger");
		btnTravelwb.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnTravelwb.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				travelWriter firsttopic = new travelWriter();
				firsttopic.setVisible(true);
			}
		});
		btnTravelwb.setBounds(1003, 193, 263, 59);
		contentPane.add(btnTravelwb);
		
		JButton btnEventCoordinator = new JButton("Event Coordinator");
		btnEventCoordinator.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				Event fifthtopic = new Event();
				fifthtopic.setVisible(true);
			}
		});
		btnEventCoordinator.setFont(new Font("STZhongsong", Font.BOLD, 19));
		btnEventCoordinator.setBounds(1003, 511, 263, 59);
		contentPane.add(btnEventCoordinator);
		
		JLabel lblTG = new JLabel("");
		Image img1 = new ImageIcon(this.getClass().getResource("/iconTG.png")).getImage();
		lblTG.setIcon(new ImageIcon(img1));
		lblTG.setBounds(163, 44, 141, 119);
		contentPane.add(lblTG);
		
		JLabel lblTA = new JLabel("");
		Image img = new ImageIcon(this.getClass().getResource("/iconTA.png")).getImage();
		lblTA.setIcon(new ImageIcon(img));
		lblTA.setBounds(163, 357, 153, 119);
		contentPane.add(lblTA);
		
		JLabel lblEC = new JLabel("");
		Image img2 = new ImageIcon(this.getClass().getResource("/iconEC.png")).getImage();
		lblEC.setIcon(new ImageIcon(img2));
		lblEC.setBounds(1057, 357, 153, 119);
		contentPane.add(lblEC);
		
		JLabel lblCC = new JLabel("");
		Image img3 = new ImageIcon(this.getClass().getResource("/iconCC.png")).getImage();
		lblCC.setIcon(new ImageIcon(img3));
		lblCC.setBounds(605, 193, 141, 144);
		contentPane.add(lblCC);
		
		JLabel lblWB = new JLabel("");
		Image img4 = new ImageIcon(this.getClass().getResource("/iconWB.png")).getImage();
		lblWB.setIcon(new ImageIcon(img4));
		lblWB.setBounds(1081, 35, 146, 128);
		contentPane.add(lblWB);
	}
}
