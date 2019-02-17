import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Image;
import javax.swing.ImageIcon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import java.awt.event.MouseAdapter;

public class pos extends JFrame {

	private JPanel contentPane;
	private JTextField usernameTxtField;
	private JPasswordField passTxtField;
	private JComboBox positionBox;
	private boolean systemCheck;

	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					pos frame = new pos();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}
	public boolean getSystemCheck() {
		return systemCheck;
	}
	
	public void setSystemCheck(boolean systemCheck) {
		this.systemCheck = systemCheck;
		
	}
	/**
	 * Create the frame.
	 */
	public pos() {
		initComponents();
		this.setLocationRelativeTo(null);
		this.setVisible(true);
	}
	
	public void initComponents() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1024, 768);
		contentPane = new JPanel();
		setUndecorated(true);
		setLocationRelativeTo(null);
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setForeground(Color.BLACK);
		panel.setBackground(new Color(255, 215, 0));
		panel.setBorder(null);
		panel.setBounds(0, 22, 480, 746);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel NewLabel = new JLabel("");
		NewLabel.setIcon(new ImageIcon("D:\\project\\coffee-flat.png"));
		NewLabel.setBounds(104, 225, 274, 307);
		panel.add(NewLabel);
		
		JLabel cafe1 = new JLabel("New label");
		cafe1.setIcon(new ImageIcon("D:\\project\\simple-beans.png"));
		cafe1.setBounds(295, 407, 175, 155);
		panel.add(cafe1);
		
		JLabel lblNewLabel = new JLabel("");
		lblNewLabel.setIcon(new ImageIcon("D:\\project\\simple-beans.png"));
		lblNewLabel.setBounds(0, 518, 214, 217);
		panel.add(lblNewLabel);
		
		JLabel lblCafe = new JLabel("COFFEE");
		lblCafe.setForeground(new Color(139, 69, 19));
		lblCafe.setFont(new Font("OCR A Extended", Font.PLAIN, 70));
		lblCafe.setBounds(115, 36, 274, 195);
		panel.add(lblCafe);
//		Image newIcon = new ImageIcon(this.getClass().getResource("pos image-01.png")).getImage().getScaledInstance(480, 729, Image.SCALE_SMOOTH);
		
		usernameTxtField = new JTextField();
		usernameTxtField.setBorder(null);
		usernameTxtField.setForeground(Color.BLACK);
		usernameTxtField.setBackground(SystemColor.control);
		usernameTxtField.setBounds(604, 308, 243, 27);
		contentPane.add(usernameTxtField);
		usernameTxtField.setColumns(10);
		
		JLabel pos = new JLabel("POS");
		pos.setForeground(Color.ORANGE);
		pos.setFont(new Font("Stencil", Font.PLAIN, 40));
		pos.setHorizontalAlignment(SwingConstants.CENTER);
		pos.setBounds(604, 113, 126, 36);
		contentPane.add(pos);
		
		JLabel system = new JLabel("SYSTEM");
		system.setFont(new Font("Stencil", Font.PLAIN, 40));
		system.setBounds(716, 107, 169, 49);
		contentPane.add(system);
		
		passTxtField = new JPasswordField(15);
		passTxtField.setForeground(Color.BLACK);
		passTxtField.setBorder(null);
		passTxtField.setBackground(SystemColor.control);
		passTxtField.setBounds(604, 372, 243, 27);
		contentPane.add(passTxtField);
		
		JLabel Password = new JLabel("Password");
		Password.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Password.setBounds(604, 358, 101, 14);
		contentPane.add(Password);
		
		JLabel Username = new JLabel("Username / Email");
		Username.setFont(new Font("Tahoma", Font.PLAIN, 12));
		Username.setBackground(Color.WHITE);
		Username.setBounds(604, 293, 101, 14);
		contentPane.add(Username);
		
		JButton LogIn = new JButton("Login");
		LogIn.setFont(new Font("Tahoma", Font.PLAIN, 17));
		LogIn.setForeground(Color.WHITE);
		LogIn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String username = usernameTxtField.getText();
				String email = usernameTxtField.getText();
				@SuppressWarnings("deprecation")
				String password = (String) passTxtField.getText();
				String position = (String) positionBox.getSelectedItem();
				System.out.println(password);
				HRData hrSystem = new HRData();
				hrSystem.connectionSQLite();
				systemCheck = (boolean) hrSystem.CheckHr(username, password, email, position);
				System.out.println(systemCheck);
				if (systemCheck == false) {
					LoginError warningMessage = new LoginError();
					warningMessage.setLocationRelativeTo(null);
					warningMessage.setVisible(true);
				} else {
					setVisible(false);
					FrontEndUI dashBoard = new FrontEndUI();
					dashBoard.frame.setLocationRelativeTo(null);
					dashBoard.frame.setVisible(true);
					new Performance();
				}
					
				
			}
		});
		LogIn.setBackground(new Color(255, 215, 0));
		LogIn.setBounds(675, 515, 116, 36);
		LogIn.setBorder(null);
		contentPane.add(LogIn);
		
		JLabel lblForgotPassword = new JLabel("forgot password ? ");
		lblForgotPassword.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblForgotPassword.setBounds(744, 479, 103, 14);
		contentPane.add(lblForgotPassword);
		
		JButton registerBtn = new JButton("create new account");
		registerBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				register registerWindow = new register();
				registerWindow.setLocationRelativeTo(null);
				setVisible(false);
				registerWindow.setVisible(true);
			}
		});
		registerBtn.setForeground(Color.WHITE);
		registerBtn.setBorder(null);
		registerBtn.setBackground(new Color(65, 105, 225));
		registerBtn.setFont(new Font("Tahoma", Font.PLAIN, 18));
		registerBtn.setBounds(598, 602, 269, 43);
		contentPane.add(registerBtn);
		
		JPanel panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(-22, -26, 1046, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		JLabel X = new JLabel("X");
		X.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				System.exit(0);
			}
		});
		X.setBounds(1011, 23, 35, 27);
		panel_1.add(X);  
		X.setFont(new Font("Tahoma", Font.BOLD, 15));
		X.setHorizontalAlignment(SwingConstants.CENTER);
		X.setForeground(Color.WHITE);
		
		JLabel label = new JLabel("-");
		label.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setState(ICONIFIED);
			}
		});
		label.setBounds(983, 21,  35, 27);
		panel_1.add(label);
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 34));
		
		JLabel lblLogin = new JLabel("Login");
		lblLogin.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblLogin.setBounds(604, 233, 126, 36);
		contentPane.add(lblLogin);
		
		JLabel lblChooseYourPosition = new JLabel("Choose your position");
		lblChooseYourPosition.setFont(new Font("Tahoma", Font.PLAIN, 12));
		lblChooseYourPosition.setBounds(604, 413, 137, 14);
		contentPane.add(lblChooseYourPosition);
		
		positionBox = new JComboBox();
		positionBox.setModel(new DefaultComboBoxModel(new String[] {"admin", "staff"}));
		positionBox.setBackground(SystemColor.control);
		positionBox.setBounds(604, 433, 243, 27);
		contentPane.add(positionBox);
	}
}
