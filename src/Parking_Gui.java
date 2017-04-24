
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


@SuppressWarnings("serial")
public class Parking_Gui extends JFrame {

	private JPanel contentPane;


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					
					Parking_Gui frame = new Parking_Gui();
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
	
	
	public Parking_Gui() {
		
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1078, 746);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.textHighlight);
		contentPane.setForeground(Color.BLACK);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		
		
		
		
		
		
// Second Panel for the Tiles Moving----------------------------------------------------------------------------------------- 
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(SystemColor.menu);
		panel_1.setBounds(598, 33, 450, 641);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel lblxThingsHere = new JLabel("8X8 THINGS HERE");
		lblxThingsHere.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblxThingsHere.setBounds(132, 301, 252, 16);
		panel_1.add(lblxThingsHere);
		
		
//=====Welcome Panel=================================================================================================		
		
		JPanel panel = new JPanel();
		panel.setBackground(SystemColor.menu);
		panel.setBounds(26, 33, 427, 641);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel1 = new JLabel("Welcome to High-Density");
		lblNewLabel1.setBounds(58, 23, 254, 42);
		lblNewLabel1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		panel.add(lblNewLabel1);
		
		JLabel lblParking = new JLabel("Parking");
		lblParking.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblParking.setBounds(153, 78, 87, 25);
		panel.add(lblParking);
		
		
		
		
		
		
		
		
//=========Retrieval==============================================================================================
		
		JPanel Dpanel = new JPanel();
		Dpanel.setBackground(SystemColor.menu);
		Dpanel.setBounds(26, 33, 427, 641);
		Dpanel.setLayout(null);
		
		JButton btnNewButton = new JButton("Retrieve");
		
		
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				contentPane.remove(panel);
				contentPane.add(Dpanel);
				contentPane.revalidate();
				contentPane.repaint();
				
				
				JLabel lblNewLabel = new JLabel("High-Density Parking System");
				lblNewLabel.setBounds(58, 23, 350, 50);
				lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 22));
				Dpanel.add(lblNewLabel);
				
				JLabel lblReceipt = new JLabel ("Please swipe your card");
				Dpanel.add(lblReceipt);
				lblReceipt.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblReceipt.setBounds(90, 150, 254, 25);
				
				JTextField retrieve= new JTextField();
				retrieve.setBounds(90, 200, 256, 25);
				Dpanel.add(retrieve);
				
				JButton btndretrieve = new JButton ("Submit");
				btndretrieve.setBackground(Color.WHITE);
				btndretrieve.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btndretrieve.setBounds(90, 230, 109, 50);
				Dpanel.add(btndretrieve);
		
				
				
//========Third Panel for Retrieval====================================================================================			
				btndretrieve.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						

						JPanel Fpanel = new JPanel();
						Fpanel.setBackground(SystemColor.menu);
						Fpanel.setBounds(26, 33, 427, 641);
						Fpanel.setLayout(null);
						
						contentPane.remove(Dpanel);
						contentPane.add(Fpanel);
						contentPane.revalidate();
						contentPane.repaint();
						
						
						

						JLabel lblFinal = new JLabel("Would you like your receipt ?");
						lblFinal.setBounds(58, 23, 350, 50);
						lblFinal.setFont(new Font("Tahoma", Font.PLAIN, 22));
						Fpanel.add(lblFinal);
						
				
				 
					}}); 
				
				
				
				
			}
		});
		
		
		
		
		
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 16));
		btnNewButton.setBounds(58, 531, 109, 50);
		panel.add(btnNewButton);
	
		
		
		
//======Drop off=================================================================================================
		
		JPanel Rpanel = new JPanel ();
		Rpanel.setBackground(SystemColor.menu);
		Rpanel.setBounds(26, 33, 427, 641);
		Rpanel.setLayout(null);
		
		
		JButton btnNewButton_1 = new JButton("DropOff");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				
				contentPane.remove(panel);
				contentPane.add(Rpanel);
				contentPane.revalidate();
				contentPane.repaint();
				
				
				JLabel lblNewLabel2 = new JLabel(" High-Density Parking System ");
				lblNewLabel2.setBounds(58, 23, 350, 50);
				lblNewLabel2.setFont(new Font("Tahoma", Font.PLAIN, 22));
				Rpanel.add(lblNewLabel2);
				
				
				JLabel lblReceipt1 = new JLabel ("Please swipe your card");
				Rpanel.add(lblReceipt1);
				lblReceipt1.setFont(new Font("Tahoma", Font.PLAIN, 20));
				lblReceipt1.setBounds(90, 150, 254, 25);
				
				
				JTextField dropoff = new JTextField();
				dropoff.setBounds(90, 200, 256, 25);
				Rpanel.add(dropoff);
				
				JButton btndropoff = new JButton ("Submit");
				btndropoff.setBackground(Color.WHITE);
				btndropoff.setFont(new Font("Tahoma", Font.PLAIN, 16));
				btndropoff.setBounds(90, 230, 109, 50);
				Rpanel.add(btndropoff);
				
				
				 btndropoff.addActionListener(new ActionListener() {
					public void actionPerformed(ActionEvent e) {
						
						JPanel Timepanel = new JPanel ();
						Timepanel.setBackground(SystemColor.menu);
						Timepanel.setBounds(26, 33, 427, 641);
						Timepanel.setLayout(null);
						
						
						contentPane.remove(Rpanel);
						contentPane.add(Timepanel);
						contentPane.revalidate();
						contentPane.repaint();
						
						
						JLabel timelbl = new JLabel(" Please Choose your Time ");
						timelbl.setBounds(58, 23, 350, 50);
						timelbl.setFont(new Font("Tahoma", Font.PLAIN, 22));
						Timepanel.add(timelbl);
						
						
						
						JButton Thirty_mins = new JButton("30 Mins");
						Thirty_mins.setBackground(Color.WHITE);
						Thirty_mins.setFont(new Font("Tahoma", Font.PLAIN, 16));
						Thirty_mins.setBounds(50, 230, 130, 50);
						Timepanel.add(Thirty_mins);
						
						JButton one_hour = new JButton("1 Hrs");
						one_hour.setBackground(Color.WHITE);
						one_hour.setFont(new Font("Tahoma", Font.PLAIN, 16));
						one_hour.setBounds(200, 230, 130, 50);
						Timepanel.add(one_hour);
				
					
				
						JButton two_hour = new JButton("2 Hrs");
						two_hour.setBackground(Color.WHITE);
						two_hour.setFont(new Font("Tahoma", Font.PLAIN, 16));
						two_hour.setBounds(50, 290, 130, 50);
						Timepanel.add(two_hour);
				
						JButton three_hour = new JButton("3 Hrs");
						three_hour.setBackground(Color.WHITE);
						three_hour.setFont(new Font("Tahoma", Font.PLAIN, 16));
						three_hour.setBounds(200, 290, 130, 50);
						Timepanel.add(three_hour);
				
						JButton four_hour = new JButton("4 Hrs");
						four_hour.setBackground(Color.WHITE);
						four_hour.setFont(new Font("Tahoma", Font.PLAIN, 16));
						four_hour.setBounds(125, 350, 130, 50);
						Timepanel.add(four_hour);
				
						
						
						
						
						
						
					}});
				
				
				
				
			}
		});
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnNewButton_1.setBounds(281, 530, 109, 50);
		panel.add(btnNewButton_1);
		
		
	}
	
	
}
