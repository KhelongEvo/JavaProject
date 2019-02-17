import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Icon;
import java.awt.SystemColor;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class LoginError extends JDialog {

	private final JPanel contentPanel = new JPanel();

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			LoginError dialog = new LoginError();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Create the dialog.
	 */
	public LoginError() {
		initComponents();
		setLocationRelativeTo(null);
		setVisible(true);
	}
	
	public void initComponents() {
		setBounds(100, 100, 479, 323);
		setUndecorated(true);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		contentPanel.setLayout(null);
		
		Image newBackground = new ImageIcon(this.getClass().getResource("warningBackground.png")).getImage().getScaledInstance(479, 323, Image.SCALE_SMOOTH);
		Image oldAddBtn = new ImageIcon(this.getClass().getResource("oldAddBtn.png")).getImage().getScaledInstance(97, 30, Image.SCALE_SMOOTH);
		Image newAddBtn = new ImageIcon(this.getClass().getResource("newAddBtn.png")).getImage().getScaledInstance(97, 30, Image.SCALE_SMOOTH);
		Image warningIcon = new ImageIcon(this.getClass().getResource("orange-warning-icon-3.png")).getImage().getScaledInstance(134, 134, Image.SCALE_SMOOTH);
		
		JButton OkBtn = new JButton((Icon) null);
		OkBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		OkBtn.setIcon(new ImageIcon(oldAddBtn));
		OkBtn.setDisabledIcon(new ImageIcon(oldAddBtn));
		OkBtn.setPressedIcon(new ImageIcon(newAddBtn));
		OkBtn.setSelectedIcon(new ImageIcon(newAddBtn));
		OkBtn.setDisabledSelectedIcon(new ImageIcon(newAddBtn));
		OkBtn.setBorder(null);
		OkBtn.setContentAreaFilled(false);
		OkBtn.setBorderPainted(false);
		OkBtn.setVerticalTextPosition(SwingConstants.CENTER);
		OkBtn.setText("OK");
		OkBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		OkBtn.setForeground(Color.DARK_GRAY);
		OkBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		OkBtn.setContentAreaFilled(false);
		OkBtn.setBorderPainted(false);
		OkBtn.setBorder(null);
		OkBtn.setBackground(SystemColor.menu);
		OkBtn.setBounds(368, 280, 101, 32);
		contentPanel.add(OkBtn);
		
		JLabel lblNewLabel = new JLabel("There is no such name and email  in system!");
		lblNewLabel.setForeground(SystemColor.controlDkShadow);
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setFont(new Font("Dialog", Font.BOLD, 20));
		lblNewLabel.setBounds(32, 170, 422, 60);
		contentPanel.add(lblNewLabel);
		
		JLabel warningLbl = new JLabel(new ImageIcon(warningIcon));
		warningLbl.setBounds(163, 48, 134, 134);
		contentPanel.add(warningLbl);
		
		JLabel title = new JLabel("Warning");
		title.setForeground(new Color(240, 240, 240));
		title.setHorizontalAlignment(SwingConstants.CENTER);
		title.setFont(new Font("Tahoma", Font.BOLD, 16));
		title.setBounds(22, 11, 77, 20);
		contentPanel.add(title);
		JLabel background = new JLabel(new ImageIcon(newBackground));
		background.setBounds(0, 0, 479, 323);
		contentPanel.add(background);
	}
}
