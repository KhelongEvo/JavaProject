import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextArea;
import javax.swing.Icon;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class PosCalculator extends JFrame {
	public JButton fiftyBuckBtn;
	public JButton fourBtn;
	public JButton sevenBtn;
	public JButton tenBuckBtn;
	public JButton nineBtn;
	public JButton eightBtn;
	public JButton fiveBtn;
	public JButton sixBtn;
	public JButton oneBtn;
	public JButton twentyBuckBtn;
	public JButton twoBtn;
	public JButton threeBtn;
	public JButton cancelBtn;
	public JButton zeroBtn;
	public JButton commaBtn;
	public JButton payBtn;
	public JButton backBtn;
	public JButton doneBtn;
	public JLabel balanceLbl;
//	public JTextArea balanceTxtArea;
	public JLabel amountRecLbl;
	public JLabel changeTextLbl;
	public JLabel changeLbl;
	public JLabel amountReceiveLbl;
	public JLabel totalBalanceLBl;
	public JLabel frameLbl;
	public float changeCash;
	private float totalCash;
	public float tenderedCash;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		try {
			PosCalculator dialog = new PosCalculator();
			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
			dialog.setVisible(true);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void setTotalCash(float totalCash) {
		this.totalCash = totalCash;
		setTotalLbl();
	}
	
	public float getTotalCash() {
		return totalCash;
	}
	
	public void initComponent() {
		setBounds(100, 100, 500, 600);
		setUndecorated(true);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		
		Image oldNumBtn = new ImageIcon(this.getClass().getResource("white3dBtn.png")).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		Image newNumBtn = new ImageIcon(this.getClass().getResource("Orange3dBtn.png")).getImage().getScaledInstance(80, 80, Image.SCALE_SMOOTH);
		
		fiftyBuckBtn = new JButton(new ImageIcon(oldNumBtn));
		fiftyBuckBtn.setText("$50");
		fiftyBuckBtn.setForeground(new Color(199, 119, 5));
		fiftyBuckBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		fiftyBuckBtn.setVerticalTextPosition(SwingConstants.CENTER);
		fiftyBuckBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		fiftyBuckBtn.setIcon(new ImageIcon(oldNumBtn));
		fiftyBuckBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		fiftyBuckBtn.setPressedIcon(new ImageIcon(newNumBtn));
		fiftyBuckBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		fiftyBuckBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		fiftyBuckBtn.setBorderPainted(false);
		fiftyBuckBtn.setBorder(null);
		fiftyBuckBtn.setContentAreaFilled(false);
		fiftyBuckBtn.setBounds(360, 336, 80, 80);
		getContentPane().add(fiftyBuckBtn);
		
		fourBtn = new JButton(new ImageIcon(oldNumBtn));
		fourBtn.setText("4");
		fourBtn.setForeground(new Color(199, 119, 5));
		fourBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		fourBtn.setVerticalTextPosition(SwingConstants.CENTER);
		fourBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		fourBtn.setIcon(new ImageIcon(oldNumBtn));
		fourBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		fourBtn.setPressedIcon(new ImageIcon(newNumBtn));
		fourBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		fourBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		fourBtn.setBorderPainted(false);
		fourBtn.setBorder(null);
		fourBtn.setContentAreaFilled(false);
		fourBtn.setBounds(60, 236, 80, 80);
		getContentPane().add(fourBtn);
		
		sevenBtn = new JButton(new ImageIcon(oldNumBtn));
		sevenBtn.setText("7");
		sevenBtn.setForeground(new Color(199, 119, 5));
		sevenBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		sevenBtn.setVerticalTextPosition(SwingConstants.CENTER);
		sevenBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		sevenBtn.setIcon(new ImageIcon(oldNumBtn));
		sevenBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		sevenBtn.setPressedIcon(new ImageIcon(newNumBtn));
		sevenBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		sevenBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		sevenBtn.setBorderPainted(false);
		sevenBtn.setBorder(null);
		sevenBtn.setContentAreaFilled(false);
		sevenBtn.setBounds(60, 136, 80, 80);
		getContentPane().add(sevenBtn);
		
		tenBuckBtn = new JButton(new ImageIcon(oldNumBtn));
		tenBuckBtn.setText("$10");
		tenBuckBtn.setForeground(new Color(199, 119, 5));
		tenBuckBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		tenBuckBtn.setVerticalTextPosition(SwingConstants.CENTER);
		tenBuckBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		tenBuckBtn.setIcon(new ImageIcon(oldNumBtn));
		tenBuckBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		tenBuckBtn.setPressedIcon(new ImageIcon(newNumBtn));
		tenBuckBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		tenBuckBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		tenBuckBtn.setBorderPainted(false);
		tenBuckBtn.setBorder(null);
		tenBuckBtn.setContentAreaFilled(false);
		tenBuckBtn.setBounds(360, 136, 80, 80);
		getContentPane().add(tenBuckBtn);
		
		nineBtn = new JButton(new ImageIcon(oldNumBtn));
		nineBtn.setText("9");
		nineBtn.setForeground(new Color(199, 119, 5));
		nineBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		nineBtn.setVerticalTextPosition(SwingConstants.CENTER);
		nineBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		nineBtn.setIcon(new ImageIcon(oldNumBtn));
		nineBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		nineBtn.setPressedIcon(new ImageIcon(newNumBtn));
		nineBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		nineBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		nineBtn.setBorderPainted(false);
		nineBtn.setBorder(null);
		nineBtn.setContentAreaFilled(false);
		nineBtn.setBounds(260, 136, 80, 80);
		getContentPane().add(nineBtn);
		
		eightBtn = new JButton(new ImageIcon(oldNumBtn));
		eightBtn.setText("8");
		eightBtn.setForeground(new Color(199, 119, 5));
		eightBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		eightBtn.setVerticalTextPosition(SwingConstants.CENTER);
		eightBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		eightBtn.setIcon(new ImageIcon(oldNumBtn));
		eightBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		eightBtn.setPressedIcon(new ImageIcon(newNumBtn));
		eightBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		eightBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		eightBtn.setBorderPainted(false);
		eightBtn.setBorder(null);
		eightBtn.setContentAreaFilled(false);
		eightBtn.setBounds(160, 136, 80, 80);
		getContentPane().add(eightBtn);
		
		fiveBtn = new JButton(new ImageIcon(oldNumBtn));
		fiveBtn.setText("5");
		fiveBtn.setForeground(new Color(199, 119, 5));
		fiveBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		fiveBtn.setVerticalTextPosition(SwingConstants.CENTER);
		fiveBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		fiveBtn.setIcon(new ImageIcon(oldNumBtn));
		fiveBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		fiveBtn.setPressedIcon(new ImageIcon(newNumBtn));
		fiveBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		fiveBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		fiveBtn.setBorderPainted(false);
		fiveBtn.setBorder(null);
		fiveBtn.setContentAreaFilled(false);
		fiveBtn.setBounds(160, 236, 80, 80);
		getContentPane().add(fiveBtn);
		
		sixBtn = new JButton(new ImageIcon(oldNumBtn));
		sixBtn.setText("6");
		sixBtn.setForeground(new Color(199, 119, 5));
		sixBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		sixBtn.setVerticalTextPosition(SwingConstants.CENTER);
		sixBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		sixBtn.setIcon(new ImageIcon(oldNumBtn));
		sixBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		sixBtn.setPressedIcon(new ImageIcon(newNumBtn));
		sixBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		sixBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		sixBtn.setBorderPainted(false);
		sixBtn.setBorder(null);
		sixBtn.setContentAreaFilled(false);
		sixBtn.setBounds(260, 236, 80, 80);
		getContentPane().add(sixBtn);
		
		oneBtn = new JButton(new ImageIcon(oldNumBtn));
		oneBtn.setText("1");
		oneBtn.setForeground(new Color(199, 119, 5));
		oneBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		oneBtn.setVerticalTextPosition(SwingConstants.CENTER);
		oneBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		oneBtn.setIcon(new ImageIcon(oldNumBtn));
		oneBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		oneBtn.setPressedIcon(new ImageIcon(newNumBtn));
		oneBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		oneBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		oneBtn.setBorderPainted(false);
		oneBtn.setBorder(null);
		oneBtn.setContentAreaFilled(false);
		oneBtn.setBounds(60, 336, 80, 80);
		getContentPane().add(oneBtn);
		
		twentyBuckBtn = new JButton(new ImageIcon(oldNumBtn));
		twentyBuckBtn.setText("$20");
		twentyBuckBtn.setForeground(new Color(199, 119, 5));
		twentyBuckBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		twentyBuckBtn.setVerticalTextPosition(SwingConstants.CENTER);
		twentyBuckBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		twentyBuckBtn.setIcon(new ImageIcon(oldNumBtn));
		twentyBuckBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		twentyBuckBtn.setPressedIcon(new ImageIcon(newNumBtn));
		twentyBuckBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		twentyBuckBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		twentyBuckBtn.setBorderPainted(false);
		twentyBuckBtn.setBorder(null);
		twentyBuckBtn.setContentAreaFilled(false);
		twentyBuckBtn.setBounds(360, 236, 80, 80);
		getContentPane().add(twentyBuckBtn);
		
		twoBtn = new JButton(new ImageIcon(oldNumBtn));
		twoBtn.setText("2");
		twoBtn.setForeground(new Color(199, 119, 5));
		twoBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		twoBtn.setVerticalTextPosition(SwingConstants.CENTER);
		twoBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		twoBtn.setIcon(new ImageIcon(oldNumBtn));
		twoBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		twoBtn.setPressedIcon(new ImageIcon(newNumBtn));
		twoBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		twoBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		twoBtn.setBorderPainted(false);
		twoBtn.setBorder(null);
		twoBtn.setContentAreaFilled(false);
		twoBtn.setBounds(160, 336, 80, 80);
		getContentPane().add(twoBtn);
		
		threeBtn = new JButton(new ImageIcon(oldNumBtn));
		threeBtn.setText("3");
		threeBtn.setForeground(new Color(199, 119, 5));
		threeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		threeBtn.setVerticalTextPosition(SwingConstants.CENTER);
		threeBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		threeBtn.setIcon(new ImageIcon(oldNumBtn));
		threeBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		threeBtn.setPressedIcon(new ImageIcon(newNumBtn));
		threeBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		threeBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		threeBtn.setBorderPainted(false);
		threeBtn.setBorder(null);
		threeBtn.setContentAreaFilled(false);
		threeBtn.setBounds(260, 336, 80, 80);
		getContentPane().add(threeBtn);
		
		Image homeIcon = new ImageIcon(this.getClass().getResource("frame.jpg")).getImage().getScaledInstance(500, 600, Image.SCALE_SMOOTH);
		
		cancelBtn = new JButton(new ImageIcon(oldNumBtn));
		cancelBtn.setText("C");
		cancelBtn.setForeground(new Color(199, 119, 5));
		cancelBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		cancelBtn.setVerticalTextPosition(SwingConstants.CENTER);
		cancelBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		cancelBtn.setIcon(new ImageIcon(oldNumBtn));
		cancelBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		cancelBtn.setPressedIcon(new ImageIcon(newNumBtn));
		cancelBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		cancelBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		cancelBtn.setBorderPainted(false);
		cancelBtn.setBorder(null);
		cancelBtn.setContentAreaFilled(false);
		cancelBtn.setBounds(60, 436, 80, 80);
		getContentPane().add(cancelBtn);
		
		zeroBtn = new JButton(new ImageIcon(oldNumBtn));
		zeroBtn.setText("0");
		zeroBtn.setForeground(new Color(199, 119, 5));
		zeroBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		zeroBtn.setVerticalTextPosition(SwingConstants.CENTER);
		zeroBtn.setFont(new Font("Dialog", Font.BOLD, 25));
		zeroBtn.setIcon(new ImageIcon(oldNumBtn));
		zeroBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		zeroBtn.setPressedIcon(new ImageIcon(newNumBtn));
		zeroBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		zeroBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		zeroBtn.setBorderPainted(false);
		zeroBtn.setBorder(null);
		zeroBtn.setContentAreaFilled(false);
		zeroBtn.setBounds(160, 436, 80, 80);
		getContentPane().add(zeroBtn);
		
		commaBtn = new JButton(new ImageIcon(oldNumBtn));
		commaBtn.setText(".");
		commaBtn.setForeground(new Color(199, 119, 5));
		commaBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		commaBtn.setVerticalTextPosition(SwingConstants.CENTER);
		commaBtn.setFont(new Font("Dialog", Font.BOLD, 33));
		commaBtn.setIcon(new ImageIcon(oldNumBtn));
		commaBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		commaBtn.setPressedIcon(new ImageIcon(newNumBtn));
		commaBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		commaBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		commaBtn.setBorderPainted(false);
		commaBtn.setBorder(null);
		commaBtn.setContentAreaFilled(false);
		commaBtn.setBounds(260, 436, 80, 80);
		getContentPane().add(commaBtn);
		
		payBtn = new JButton(new ImageIcon(oldNumBtn));
		payBtn.setText("Enter");
		payBtn.setForeground(new Color(199, 119, 5));
		payBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		payBtn.setVerticalTextPosition(SwingConstants.CENTER);
		payBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		payBtn.setIcon(new ImageIcon(oldNumBtn));
		payBtn.setDisabledIcon(new ImageIcon(oldNumBtn));
		payBtn.setPressedIcon(new ImageIcon(newNumBtn));
		payBtn.setSelectedIcon(new ImageIcon(newNumBtn));
		payBtn.setDisabledSelectedIcon(new ImageIcon(newNumBtn));
		payBtn.setBorderPainted(false);
		payBtn.setBorder(null);
		payBtn.setContentAreaFilled(false);
		payBtn.setBounds(360, 436, 80, 80);
		getContentPane().add(payBtn);
		
		Image whiteDoneBtn = new ImageIcon(this.getClass().getResource("whiteDoneIcon.png")).getImage().getScaledInstance(125, 40, Image.SCALE_SMOOTH);
		Image orangeDoneBtn = new ImageIcon(this.getClass().getResource("orangeDoneIcon.png")).getImage().getScaledInstance(125, 40, Image.SCALE_SMOOTH);
		
		backBtn = new JButton((Icon) new ImageIcon(whiteDoneBtn));
		backBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balanceLbl.setText(balanceLbl.getText().replaceAll(balanceLbl.getText(), ""));
				setVisible(false);
			}
		});
		backBtn.setIcon(new ImageIcon(whiteDoneBtn));
		backBtn.setDisabledIcon(new ImageIcon(whiteDoneBtn));
		backBtn.setPressedIcon(new ImageIcon(orangeDoneBtn));
		backBtn.setSelectedIcon(new ImageIcon(orangeDoneBtn));
		backBtn.setDisabledIcon(new ImageIcon(orangeDoneBtn));
		backBtn.setVerticalTextPosition(SwingConstants.CENTER);
		backBtn.setText("Back");
		backBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		backBtn.setForeground(new Color(199, 119, 5));
		backBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		backBtn.setContentAreaFilled(false);
		backBtn.setBorderPainted(false);
		backBtn.setBorder(null);
		backBtn.setBounds(60, 537, 125, 40);
		getContentPane().add(backBtn);
		
		
		doneBtn = new JButton(new ImageIcon(whiteDoneBtn));
		doneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				balanceLbl.setText(balanceLbl.getText().replaceAll(balanceLbl.getText(), ""));
				amountRecLbl.setText(amountRecLbl.getText().replaceAll(amountRecLbl.getText(), ""));
				changeTextLbl.setText(changeTextLbl.getText().replaceAll(changeTextLbl.getText(), ""));
				setVisible(false);
				
			}
		});
		doneBtn.setText("Done");
		doneBtn.setForeground(new Color(199, 119, 5));
		doneBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		doneBtn.setVerticalTextPosition(SwingConstants.CENTER);
		doneBtn.setFont(new Font("Dialog", Font.BOLD, 20));
		doneBtn.setIcon(new ImageIcon(whiteDoneBtn));
		doneBtn.setDisabledIcon(new ImageIcon(whiteDoneBtn));
		doneBtn.setPressedIcon(new ImageIcon(orangeDoneBtn));
		doneBtn.setSelectedIcon(new ImageIcon(orangeDoneBtn));
		doneBtn.setDisabledIcon(new ImageIcon(orangeDoneBtn));
		doneBtn.setBorderPainted(false);
		doneBtn.setBorder(null);
		doneBtn.setContentAreaFilled(false);
		doneBtn.setBounds(315, 537, 125, 40);
		getContentPane().add(doneBtn);
		
		amountRecLbl = new JLabel();
		amountRecLbl.setFont(new Font("Dialog", Font.BOLD, 20));
		amountRecLbl.setBounds(188, 52, 136, 50);
		getContentPane().add(amountRecLbl);
		
		changeTextLbl = new JLabel();
		changeTextLbl.setForeground(new Color(178, 34, 34));
		changeTextLbl.setFont(new Font("Dialog", Font.BOLD, 20));
		changeTextLbl.setBounds(331, 52, 109, 50);
		getContentPane().add(changeTextLbl);
		
		changeLbl = new JLabel("Change");
		changeLbl.setHorizontalAlignment(SwingConstants.TRAILING);
		changeLbl.setFont(new Font("Dialog", Font.BOLD, 13));
		changeLbl.setBounds(338, 26, 102, 26);
		getContentPane().add(changeLbl);
		
		amountReceiveLbl = new JLabel("Amount Tendered");
		amountReceiveLbl.setLabelFor(amountRecLbl);
		amountReceiveLbl.setHorizontalAlignment(SwingConstants.TRAILING);
		amountReceiveLbl.setFont(new Font("Dialog", Font.BOLD, 13));
		amountReceiveLbl.setBounds(187, 26, 136, 26);
		getContentPane().add(amountReceiveLbl);
		
		totalBalanceLBl = new JLabel("Total Price");
		totalBalanceLBl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				balanceLbl.setText(String.valueOf(totalCash));
			}
		});
		totalBalanceLBl.setFont(new Font("Dialog", Font.BOLD, 13));
		totalBalanceLBl.setBounds(60, 26, 102, 26);
		getContentPane().add(totalBalanceLBl);
		
		oneBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "1");
			}
		});
		
		twoBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "2");
			}
		});
		
		threeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "3");
			}
		});
		
		fourBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "4");
			}
		});
		
		fiveBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "5");
			}
		});
		
		sixBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "6");
			}
		});
		
		sevenBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "7");
			}
		});
		
		eightBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "8");
			}
		});

		nineBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "9");
			}
		});
		
		zeroBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "0");
			}
		});
		
		commaBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + ".");
			}
		});
		
		tenBuckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "10.00");
			}
		});
		
		twentyBuckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "20.00");
			}
		});
		
		fiftyBuckBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText() + "50.00");
			}
		});
		
		cancelBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				amountRecLbl.setText(amountRecLbl.getText().replaceAll(amountRecLbl.getText(), ""));
			}
		});
		
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				tenderedCash = Float.parseFloat(amountRecLbl.getText());
				
				changeCash = tenderedCash - totalCash;
				
				changeTextLbl.setText(String.valueOf(changeCash));
				
			}
		});
		
		balanceLbl = new JLabel("");
//		balanceLbl.setText(new FrontEndUI().balDueTxtArea.getText());
		balanceLbl.setFont(new Font("Dialog", Font.BOLD, 20));
		balanceLbl.setBackground(Color.WHITE);
		balanceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		balanceLbl.setBounds(60, 52, 118, 50);
		getContentPane().add(balanceLbl);
		
		frameLbl = new JLabel("");
		frameLbl.setHorizontalAlignment(SwingConstants.CENTER);
		frameLbl.setBounds(0, 0, 500, 600);
		getContentPane().add(frameLbl);
		frameLbl.setIcon(new ImageIcon(homeIcon));
	}

	public void setTotalLbl() {
//		String tem = String.valueOf(totalCash);
		balanceLbl.setText(String.valueOf(totalCash));
	}

	/**
	 * Create the dialog.
	 */

	public PosCalculator() {
		// TODO Auto-generated constructor stub
		
		initComponent();
		
	}


	
}
