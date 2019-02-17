import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.Image;

import javax.swing.JSeparator;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JToggleButton;

import java.awt.SystemColor;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.ButtonGroup;
import javax.swing.ButtonModel;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class register extends JFrame {

	private JPanel contentPane;
	public JButton RegisterBtn;
	public JPanel panel;
	public JLabel lblNewLabel_2;
	public JLabel lblCoffee;
	public JLabel lblNewLabel_3;
	public JLabel lblNewLabel_1;
	public JLabel Pos;
	public JLabel System;
	public JTextField emailField;
	public JTextField firstNameField;
	public JLabel firstNameLbl;
	public JLabel lblEmail;
	public JLabel lblRegister;
	public JTextField lastNameField;
	public JPasswordField passwordField;
	public JPasswordField repasswordField;
	public JLabel lblLastName;
	public JLabel lblRepassword;
	public JLabel lblPassword;
	public JToggleButton adminBtn;
	public JToggleButton staffBtn;
	public JPanel panel_1;
	public JLabel X;
	public JLabel label;
	private String position;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_4;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		EventQueue.invokeLater(new Runnable() {
//			public void run() {
//				try {
//					register frame = new register();
//					frame.setVisible(true);
//				} catch (Exception e) {
//					e.printStackTrace();
//				}
//			}
//		});
//	}

	/**
	 * Create the frame.
	 */
	public register() {
		initComponents();
		this.setLocationRelativeTo(null);
//		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		this.setVisible(false);
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
		
		panel = new JPanel();
		panel.setForeground(new Color(255, 99, 71));
		panel.setBackground(new Color(255, 215, 0));
		panel.setBounds(586, 23, 480, 745);
		panel.setBorder(null);
		contentPane.add(panel);
		panel.setLayout(null);
		
		Image coffeeFlat = new ImageIcon(this.getClass().getResource("coffee-flat.png")).getImage();
		Image simpleBean = new ImageIcon(this.getClass().getResource("simple-beans.png")).getImage();
		
		lblNewLabel_2 = new JLabel("");
		lblNewLabel_2.setIcon(new ImageIcon(coffeeFlat));
		lblNewLabel_2.setBounds(101, 378, 256, 289);
		panel.add(lblNewLabel_2);
		lblCoffee = new JLabel("COFFEE ");
		lblCoffee.setForeground(new Color(139, 69, 19));
		lblCoffee.setFont(new Font("OCR A Extended", Font.BOLD, 65));
		lblCoffee.setBounds(101, 69, 316, 132);
		panel.add(lblCoffee);
		
		lblNewLabel_3 = new JLabel("New label");
		lblNewLabel_3.setBounds(41, 475, 190, 196);
		panel.add(lblNewLabel_3);
		lblNewLabel_3.setIcon(new ImageIcon(simpleBean));
		
		
		lblNewLabel_1 = new JLabel("New label");
		lblNewLabel_1.setBounds(241, 506, 176, 196);
		panel.add(lblNewLabel_1);
		lblNewLabel_1.setIcon(new ImageIcon(simpleBean));
		
		lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon(simpleBean));
		lblNewLabel.setBounds(52, 339, 196, 156);
		panel.add(lblNewLabel);
		
		lblNewLabel_4 = new JLabel("");
		lblNewLabel_4.setIcon(new ImageIcon(simpleBean));
		lblNewLabel_4.setBounds(199, 320, 203, 175);
		panel.add(lblNewLabel_4);
		
		Pos = new JLabel("POS");
		Pos.setForeground(Color.ORANGE);
		Pos.setFont(new Font("Stencil", Font.PLAIN, 40));
		Pos.setBounds(150, 54,169, 49);
		contentPane.add(Pos);
		
		System = new JLabel("SYSTEM");
		System.setFont(new Font("Stencil", Font.PLAIN, 40));
		System.setBounds(235, 54, 169, 49);
		contentPane.add(System);
		
		emailField = new JTextField();
		emailField.setBackground(SystemColor.control);
		emailField.setBounds(155, 311, 249, 27);
		contentPane.add(emailField);
		
		firstNameField = new JTextField();
		firstNameField.setBackground(SystemColor.control);
		firstNameField.setBounds(155, 253, 121, 27);
		contentPane.add(firstNameField);
		
		firstNameLbl = new JLabel("First Name");
		firstNameLbl.setBounds(155, 239, 74, 12);
		contentPane.add(firstNameLbl);
		
		lblEmail = new JLabel("Email");
		lblEmail.setBounds(155, 297, 46, 14);
		contentPane.add(lblEmail);
		
		lblRegister = new JLabel("Register");
		lblRegister.setFont(new Font("Tahoma", Font.PLAIN, 30));
		lblRegister.setBounds(155, 151, 131, 43);
		contentPane.add(lblRegister);
		
		lastNameField = new JTextField();
		lastNameField.setBackground(SystemColor.control);
		lastNameField.setBounds(286, 253, 121, 27);
		contentPane.add(lastNameField);
		
		passwordField = new JPasswordField();
		passwordField.setColumns(15);
		passwordField.setBackground(SystemColor.control);
		passwordField.setBounds(155, 367, 249, 27);
		contentPane.add(passwordField);
		
		repasswordField = new JPasswordField();
		repasswordField.setColumns(15);
		repasswordField.setBackground(SystemColor.control);
		repasswordField.setBounds(155, 428, 249, 27);
		contentPane.add(repasswordField);
		
		lblLastName = new JLabel("Last Name");
		lblLastName.setBounds(286, 239, 74, 12);
		contentPane.add(lblLastName);
		
		lblRepassword = new JLabel("Re-Password");
		lblRepassword.setBounds(155, 414, 89, 14);
		contentPane.add(lblRepassword);
		
		lblPassword = new JLabel("Password");
		lblPassword.setBounds(155, 353, 74, 14);
		contentPane.add(lblPassword);
		ButtonGroup group = new ButtonGroup();
		
		adminBtn = new JToggleButton("Admin");
		adminBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPosition("admin");
			}
		});
		adminBtn.setBackground(Color.LIGHT_GRAY);
		adminBtn.setBorder(null);
		adminBtn.setBounds(155, 509, 89, 23);
		contentPane.add(adminBtn);
		
		staffBtn = new JToggleButton("Staff");
		staffBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setPosition("staff");
			}
		});
		staffBtn.setBackground(Color.LIGHT_GRAY);
		staffBtn.setBorder(null);
		staffBtn.setBounds(315, 509, 89, 23);
		contentPane.add(staffBtn);
		
		group.add(adminBtn);
		group.add(staffBtn);
		
		panel_1 = new JPanel();
		panel_1.setBackground(Color.BLACK);
		panel_1.setBounds(-22, -26, 1046, 49);
		contentPane.add(panel_1);
		panel_1.setLayout(null);
		
		X = new JLabel("X");
		X.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				System.exit(0);
			}
		});
		X.setBounds(1011, 23, 35, 27);
		panel_1.add(X);
		X.setFont(new Font("Tahoma", Font.BOLD, 15));
		X.setHorizontalAlignment(SwingConstants.CENTER);
		X.setForeground(Color.WHITE);
		
		label = new JLabel("-");
		label.setBounds(983, 21,  35, 27);
		panel_1.add(label);
		label.setForeground(Color.WHITE);
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Tahoma", Font.PLAIN, 34));
		
		RegisterBtn = new JButton("Register");
		RegisterBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String firstName = firstNameField.getText();
				String lastName = lastNameField.getText();
				String fullName = firstName + lastName;
				String password = passwordField.getText();
				String rePassword = repasswordField.getText();
				String email = emailField.getText();
				HRData checkSystem = new HRData();
				checkSystem.connectionSQLite();
				boolean check = checkSystem.CheckHr(firstName+lastName, rePassword, email, getPosition());
				// Check condition if rePass == Pass
				if (firstName.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a firstName!");
				} else if (lastName.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a lastName!");
				} else if (!password.equals(rePassword)) {
					JOptionPane.showMessageDialog(null, "Re-Type password again!");
				} else if (email.equals("")) {
					JOptionPane.showMessageDialog(null, "Add a email!");
				} else if (getPosition().equals("")) {
					JOptionPane.showMessageDialog(null, "Choose a position in our cafe");
				} else if (check == true) {
					JOptionPane.showMessageDialog(null, "It seems it already has a name in our system!");
				}
//				if (password != rePassword) {
//					JOptionPane.showMessageDialog(null, "The Re-password is incorrect!");
//				} 
				
//				ButtonModel btnSelected = group.getSelection();
//				
//				String position = btnSelected.getSelectedObjects();
				checkSystem.recordHr(fullName, email, rePassword, getPosition());
				pos login = new pos();
				login.setLocationRelativeTo(null);
				setVisible(false);
				login.setVisible(true);
				
			}
		});
		RegisterBtn.setForeground(Color.WHITE);
		RegisterBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		RegisterBtn.setBackground(new Color(255, 215, 0));
		RegisterBtn.setBounds(155, 572, 249, 33);
		RegisterBtn.setBorder(null);
		contentPane.add(RegisterBtn);
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}
	
//	public void transferData(String firstName, ) {
//		firstNameField.getText();
//		
//	}
}
