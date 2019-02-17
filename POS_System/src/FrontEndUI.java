import java.awt.EventQueue;

import javax.imageio.ImageIO;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Cursor;

import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;
import java.awt.image.BufferedImage;

import javax.swing.border.Border;
import javax.swing.border.CompoundBorder;
import javax.swing.border.LineBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.JTableHeader;
import javax.swing.JTextField;
import javax.swing.JTable;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.JButton;
import javax.swing.JLayeredPane;
import javax.swing.JTabbedPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.JDialog;
import javax.swing.JScrollBar;
import javax.swing.JScrollPane;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.Icon;
import java.awt.SystemColor;
import javax.swing.JTextArea;
import java.awt.Component;

public class FrontEndUI {

	public JFrame frame;
	public JTable cashierTable;
	private JLabel chocoCookieLbl;
	public JScrollPane transactionPane;
	public Object[] columns;
//	public Object[][][][] data;
	public JPanel coffeeTab;
	public JPanel teaTab;
	public JPanel dessertTab;
	public JTabbedPane tabbedPane;
	public JButton btnAddToCart;
	public JButton payBtn;
	public JLabel americanoLbl;
	public JLabel capucinoLbl;
	public JLabel latteLbl;
	public JLabel expressoLbl;
	public JLabel flatWhiteLbl;
	public JLabel longBlackLbl;
	public JLabel macchiatoLbl;
	public JLabel mochaccinoLbl;
	public JLabel cBrewTea;
	public JButton btnComfortWellnessBrewed;
	public JLabel clAndMistGreenTea;
	public JButton btnCmGreenTea;
	public JLabel mintTeaLbl;
	public JButton btnHoneyminttea;
	public JLabel chaiLatteLbl;
	public JButton btnChaiLatte;
	public JLabel dBrewTeaLbl;
	public JButton btnDefensebrewedtea;
	public JLabel icedMatchaLbl;
	public JButton btnIcedMacha;
	public JLabel pumpkinSpiceLbl;
	public JButton btnIPumpkinSpice;
	public JLabel iceChaiLatte;
	public JButton btnIce;
	public JLabel lightSweetChai;
	public JButton btnLightsweetchai;
	public JLabel brownieLbl;
	public JButton brownieBtn;
	public JLabel cIceCreamLbl;
	public JLabel cMacchiatoLbl;
	public JButton macchiatoBtn;
	public JLabel ChocoBMuffinLbl;
	public JButton chocoBMuffinBtn;
	public JLabel chocoCappuCakeLbl;
	public JButton chocoCappuCakeBtn;
	public JButton btnChococookie;
	public JLabel liqueurIceCreamLbl;
	public JButton btnLiqueurice;
	public JLabel doubleChocoTriffleLbl;
	public JButton btnChocoTriffle;
	public JLabel chocoPecanPieLbl;
	public JButton btnPecanPie;
	public JButton btnCaramelIceCream;
	public DefaultTableModel model;
	public int rowCount;
	public int qty;
	public String itemName;
	public String eachItemName;
	public String typeCoffee;
	public float optionAmount;
	public int count;
	public JLabel discTxtArea ;
	public JLabel numTxtArea;
	public JLabel subTxtArea;
	public JLabel totalTxtArea;
	public JLabel balDueTxtArea;
	public float sum;
	public float balDue;
	public float eachItemPrice;
	public float totalPrice;
	public int numberOrder;
	private JButton americanoBtn;
	private JButton btnCappuccino;
	private JButton btnCafeLatte;
	private JButton btnExpresso;
	private JButton btnFlatwhite;
	private JButton btnLongBlack_1;
	private JButton btnMacchiato_1;
	private JButton btnMochaccino_1;
	private JLabel numberLbl;
	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the application.
	 */
	public FrontEndUI() {
		itemName = eachItemName + "-" + typeCoffee;
		qty = 0;
		numberOrder = 0;
		initialize();
//		initializeData();
//		updateTable();
		frame.setLocationRelativeTo(null);
		frame.setVisible(false);
	}

	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		
		frame = new JFrame();
		frame.setBounds(100, 100, 1024, 768);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setUndecorated(true);
		frame.getContentPane().setLayout(null);
		
		JPanel HeaderLabel = new JPanel();
		HeaderLabel.setLayout(null);
		HeaderLabel.setBackground(Color.BLACK);
		HeaderLabel.setBounds(0, 0, 1024, 27);
		frame.getContentPane().add(HeaderLabel);
		
		JLabel closeLbl = new JLabel("X");
		closeLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
//				TransactionData processDelete = new TransactionData();
//				processDelete.connectionSQLite();
//				processDelete.deleteAllData();
				System.exit(0);
			}
		});
		closeLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		closeLbl.setForeground(Color.WHITE);
		closeLbl.setFont(new Font("Tahoma", Font.BOLD, 15));
		closeLbl.setBounds(995, 3, 29, 26);
		HeaderLabel.add(closeLbl);
		
		JLabel minLbl = new JLabel("-");
		minLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				frame.setState(frame.ICONIFIED);
			}
		});
		minLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		minLbl.setForeground(Color.WHITE);
		minLbl.setFont(new Font("Tahoma", Font.BOLD, 24));
		minLbl.setBounds(970, -1, 10, 26);
		HeaderLabel.add(minLbl);

		
		JPanel cashPanel = new JPanel();
		cashPanel.setBorder(null);
		cashPanel.setBackground(Color.WHITE);
		cashPanel.setBounds(0, 26, 476, 742);
		frame.getContentPane().add(cashPanel);
		cashPanel.setLayout(null);
		
		JPanel tablePanel = new JPanel();
		tablePanel.setBackground(Color.WHITE);
		tablePanel.setBorder(null);
		tablePanel.setBounds(0, 56, 476, 686);
		cashPanel.add(tablePanel);
		tablePanel.setLayout(null);
		
		cashierTable = new JTable();
		
		//Header column for table
		columns = new Object[] {
			"Name", "Qty", "Each", "Total"	
		};
		
//		data = new Object[][][][] {
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			{null, null, null, null},
//			
//		};
		
		
		model = new DefaultTableModel();
		
		model.setColumnIdentifiers(columns);
		cashierTable.setModel(model);
		cashierTable.setRowHeight(30);
		cashierTable.setGridColor(new Color(255, 255, 255));
		cashierTable.setSelectionBackground(new Color(248, 148, 6));
		cashierTable.setSelectionForeground(new Color(240, 240, 240));
		transactionPane = new JScrollPane(cashierTable);
		transactionPane.setBackground(Color.WHITE);
		transactionPane.setForeground(new Color(51, 51, 51));
		transactionPane.setFont(new Font("Segoe UI", Font.PLAIN, 16));
		transactionPane.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		transactionPane.setBounds(20, 84, 434, 382);
		tablePanel.add(transactionPane);
	
		
		JLabel numOrder = new JLabel("ORDER#");
		numOrder.setHorizontalAlignment(SwingConstants.CENTER);
		numOrder.setFont(new Font("Tahoma", Font.PLAIN, 17));
		numOrder.setBounds(195, 47, 87, 30);
		tablePanel.add(numOrder);
		Image addIcon = new ImageIcon(this.getClass().getResource("plus-7-64.png")).getImage().getScaledInstance(48, 48, Image.SCALE_SMOOTH);
		
		JLabel lblNewLabel_1 = new JLabel("Discounts :");
		lblNewLabel_1.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblNewLabel_1.setBounds(20, 484, 87, 21);
		tablePanel.add(lblNewLabel_1);
		
		JLabel lblSubtotal = new JLabel("Sub Total :");
		lblSubtotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblSubtotal.setBounds(20, 516, 87, 21);
		tablePanel.add(lblSubtotal);
		
		JLabel lblTax = new JLabel("TOTAL :");
		lblTax.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTax.setBounds(280, 484, 60, 21);
		tablePanel.add(lblTax);
		
		JLabel lblTotal = new JLabel("Balance Due :");
		lblTotal.setFont(new Font("Segoe UI", Font.PLAIN, 15));
		lblTotal.setBounds(280, 516, 99, 21);
		tablePanel.add(lblTotal);
		
		JButton discardBtn = new JButton("Discard");
		discardBtn.setForeground(Color.WHITE);
		discardBtn.setBorder(null);
		discardBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DefaultTableModel dm = (DefaultTableModel) cashierTable.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
			}
		});
		discardBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		discardBtn.setBackground(Color.ORANGE);
		discardBtn.setFont(new Font("Tahoma", Font.PLAIN, 13));
		discardBtn.setBounds(20, 563, 99, 30);
		tablePanel.add(discardBtn);
		
		discTxtArea = new JLabel();
		discTxtArea.setBackground(new Color(240, 240, 240));
		discTxtArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
		discTxtArea.setBounds(92, 484, 77, 22);
		tablePanel.add(discTxtArea);
		
		subTxtArea = new JLabel();
		subTxtArea.setBackground(new Color(240, 240, 240));
		subTxtArea.setFont(new Font("Segoe UI", Font.BOLD, 14));
		subTxtArea.setBounds(92, 516, 77, 22);
		tablePanel.add(subTxtArea);
		
		totalTxtArea = new JLabel();
		totalTxtArea.setBackground(new Color(240, 240, 240));
		totalTxtArea.setFont(new Font("Segoe UI", Font.BOLD, 22));
		totalTxtArea.setBounds(333, 484, 121, 21);
		tablePanel.add(totalTxtArea);
		
		balDueTxtArea = new JLabel();
		balDueTxtArea.setBackground(new Color(240, 240, 240));
		balDueTxtArea.setFont(new Font("Segoe UI", Font.BOLD, 15));
		balDueTxtArea.setBounds(377, 515, 77, 22);
		tablePanel.add(balDueTxtArea);
		
		numTxtArea = new JLabel();
		numTxtArea.setBackground(new Color(240, 240, 240));
		numTxtArea.setFont(new Font("Segoe UI", Font.BOLD, 17));
		numTxtArea.setBounds(224, 27, 22, 28);
		tablePanel.add(numTxtArea);
		
		
		Image transactionBtn = new ImageIcon(this.getClass().getResource("transaction.png")).getImage().getScaledInstance(64, 64, Image.SCALE_SMOOTH);
		

		UIManager.put("TabbedPane.selected", new Color(248, 148, 6));
		Image americanoIcon = new ImageIcon(this.getClass().getResource("americano coffee.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image capucinoIcon = new ImageIcon(this.getClass().getResource("capucinoCoffee.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image latteIcon = new ImageIcon(this.getClass().getResource("latteCafe.jpg")).getImage().getScaledInstance(168, 126, Image.SCALE_SMOOTH);
		Image expressoIcon = new ImageIcon(this.getClass().getResource("expressoCoffee.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image flatWhiteIcon = new ImageIcon(this.getClass().getResource("flat-white.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image longBlackIcon = new ImageIcon(this.getClass().getResource("longBlackCoffee.jpg")).getImage().getScaledInstance(168, 126, Image.SCALE_SMOOTH);
		Image macchiatoIcon = new ImageIcon(this.getClass().getResource("macchiatoLatte.jpg")).getImage().getScaledInstance(168, 126, Image.SCALE_SMOOTH);
		Image mochaccinoIcon = new ImageIcon(this.getClass().getResource("Mochaccino.jpg")).getImage().getScaledInstance(168, 126, Image.SCALE_SMOOTH);
		Image cBrewTeaIcon = new ImageIcon(this.getClass().getResource("cbrewedTea.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image clAndMistIcon = new ImageIcon(this.getClass().getResource("cloud&MistGreenTea.jpg")).getImage().getScaledInstance(121, 126, Image.SCALE_SMOOTH);
		Image mintTeaIcon = new ImageIcon(this.getClass().getResource("honeyMintTea.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image chaiLatteIcon = new ImageIcon(this.getClass().getResource("chaiLatte.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image dBrewTeaIcon = new ImageIcon(this.getClass().getResource("DbrewedTea.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image icedMatchaIcon = new ImageIcon(this.getClass().getResource("icedMatcha.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image pumpkinSpiceIcon = new ImageIcon(this.getClass().getResource("icedPumpkinSpice.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image iceChaiLatteIcon = new ImageIcon(this.getClass().getResource("icedChaiLatte.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image lightSweetChaiIcon = new ImageIcon(this.getClass().getResource("icedLightlySweetChai.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image brownieIcon = new ImageIcon(this.getClass().getResource("Brownie.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image cIceCreamIcon = new ImageIcon(this.getClass().getResource("caramelceCream.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image cMacchiatoIcon = new ImageIcon(this.getClass().getResource("caramelMacchaitoB.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image ChocoBMuffinIcon = new ImageIcon(this.getClass().getResource("chocoBMuffin.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image chocoCappuCakeIcon = new ImageIcon(this.getClass().getResource("chocoCappuCCake.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image chocoCookieIcon = new ImageIcon(this.getClass().getResource("chocoCookie.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image liqueurIceCreamIcon = new ImageIcon(this.getClass().getResource("liqueurIceCream.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image doubleChocoTriffleIcon = new ImageIcon(this.getClass().getResource("doubleChocoTrifle.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		Image chocoPecanPieIcon = new ImageIcon(this.getClass().getResource("chocoPecanPie.jpg")).getImage().getScaledInstance(126, 121, Image.SCALE_SMOOTH);
		tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(475, 26, 549, 742);
		frame.getContentPane().add(tabbedPane);
		tabbedPane.setBorder(null);
		tabbedPane.setBackground(Color.ORANGE);
		tabbedPane.setForeground(new Color(240, 240, 240));
		
		coffeeTab = new JPanel();
		coffeeTab.setBackground(SystemColor.control);
		coffeeTab.setForeground(new Color(240, 240, 240));
		coffeeTab.setBorder(null);
		tabbedPane.addTab("Coffee", null, coffeeTab, null);
		coffeeTab.setLayout(null);
		
		americanoLbl = new JLabel("");
		americanoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionWindow = new Choice();
				eachItemName = "Americano";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
				
				
			}
		});
		americanoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		americanoLbl.setIcon(new ImageIcon(americanoIcon));
		americanoLbl.setBounds(24, 24, 121, 126);
		americanoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		coffeeTab.add(americanoLbl);
		
		capucinoLbl = new JLabel("");
		capucinoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionWindow = new Choice();
				qty = 1;
				eachItemName = "Cappuccino";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setQuantity(qty);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		capucinoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		capucinoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		
		capucinoLbl.setBounds(204, 24, 121, 126);
		capucinoLbl.setIcon(new ImageIcon(capucinoIcon));
		coffeeTab.add(capucinoLbl);
		
		latteLbl = new JLabel("");
		latteLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionWindow = new Choice();
				qty = 1;
				eachItemName = "Cafelatte";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setQuantity(qty);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		latteLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		latteLbl.setHorizontalAlignment(SwingConstants.CENTER);
		latteLbl.setBounds(394, 24, 121, 126);
		latteLbl.setIcon(new ImageIcon(latteIcon));
		coffeeTab.add(latteLbl);
		
		expressoLbl = new JLabel("");
		expressoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionWindow = new Choice();
				qty = 1;
				eachItemName = "Expresso";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setQuantity(qty);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		
		expressoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		expressoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		expressoLbl.setBounds(24, 204, 121, 126);
		expressoLbl.setIcon(new ImageIcon(expressoIcon));
		coffeeTab.add(expressoLbl);
		
		flatWhiteLbl = new JLabel("");
		flatWhiteLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionDialog = new Choice();
				qty =1 ;
				eachItemName = "Flatwhite";
				optionDialog.setLocationRelativeTo(null);
				optionDialog.setQuantity(qty);
				optionDialog.setEachItemName(eachItemName);
				optionDialog.setVisible(true);
			}
		});
		flatWhiteLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		flatWhiteLbl.setHorizontalAlignment(SwingConstants.CENTER);
		flatWhiteLbl.setBounds(204, 204, 121, 126);
		flatWhiteLbl.setIcon(new ImageIcon(flatWhiteIcon));
		coffeeTab.add(flatWhiteLbl);
		
		longBlackLbl = new JLabel("");
		longBlackLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionDialog = new Choice();
				qty = 1;
				eachItemName = "Longblack";
				optionDialog.setLocationRelativeTo(null);
				optionDialog.setQuantity(qty);
				optionDialog.setEachItemName(eachItemName);
				optionDialog.setVisible(true);
			}
		});
		longBlackLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		longBlackLbl.setHorizontalAlignment(SwingConstants.CENTER);
		longBlackLbl.setBounds(394, 204, 121, 126);
		longBlackLbl.setIcon(new ImageIcon(longBlackIcon));
		coffeeTab.add(longBlackLbl);
		
		macchiatoLbl = new JLabel("");
		macchiatoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionWindow = new Choice();
				qty = 1;
				eachItemName = "Macchiato";
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setQuantity(qty);
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setVisible(true);
			}
		});
		macchiatoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		macchiatoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		macchiatoLbl.setBounds(24, 389, 121, 126);
		macchiatoLbl.setIcon(new ImageIcon(macchiatoIcon));
		coffeeTab.add(macchiatoLbl);
		
		mochaccinoLbl = new JLabel("");
		mochaccinoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				Choice optionDialog = new Choice();
				qty = 1;
				eachItemName = "Mochaccino";
				optionDialog.setLocationRelativeTo(null);
				optionDialog.setQuantity(qty);
				optionDialog.setEachItemName(eachItemName);
				optionDialog.setVisible(true);
			}
		});
		mochaccinoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mochaccinoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mochaccinoLbl.setBounds(204, 389, 121, 126);
		mochaccinoLbl.setIcon(new ImageIcon(mochaccinoIcon));
		coffeeTab.add(mochaccinoLbl);
		
		Image newOrangeBtn = new ImageIcon(this.getClass().getResource("btn1.png")).getImage().getScaledInstance(121, 32, Image.SCALE_SMOOTH);
		Image oldWhiteBtn = new ImageIcon(this.getClass().getResource("whiteBtn.png")).getImage().getScaledInstance(121, 32, Image.SCALE_SMOOTH);
		
		americanoBtn = new JButton("Americano");
		americanoBtn.setForeground(Color.WHITE);
		americanoBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		americanoBtn.setBackground(SystemColor.controlDkShadow);
		americanoBtn.setBounds(24, 150, 121, 33);
		americanoBtn.setBorder(null);
		coffeeTab.add(americanoBtn);
		
		btnCappuccino = new JButton("Cappuccino");
		btnCappuccino.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnCappuccino.setForeground(Color.WHITE);
		btnCappuccino.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCappuccino.setBorder(null);
		btnCappuccino.setBackground(SystemColor.controlDkShadow);
		btnCappuccino.setBounds(204, 150, 121, 33);
		coffeeTab.add(btnCappuccino);
		
		btnCafeLatte = new JButton("Cafe Latte");
		btnCafeLatte.setForeground(Color.WHITE);
		btnCafeLatte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCafeLatte.setBorder(null);
		btnCafeLatte.setBackground(SystemColor.controlDkShadow);
		btnCafeLatte.setBounds(394, 150, 121, 33);
		coffeeTab.add(btnCafeLatte);
		
		btnExpresso = new JButton("Expresso");
		btnExpresso.setForeground(Color.WHITE);
		btnExpresso.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnExpresso.setBorder(null);
		btnExpresso.setBackground(SystemColor.controlDkShadow);
		btnExpresso.setBounds(24, 330, 121, 33);
		coffeeTab.add(btnExpresso);
		
		btnFlatwhite = new JButton("Flat-White");
		btnFlatwhite.setForeground(Color.WHITE);
		btnFlatwhite.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnFlatwhite.setBorder(null);
		btnFlatwhite.setBackground(SystemColor.controlDkShadow);
		btnFlatwhite.setBounds(204, 330, 121, 33);
		coffeeTab.add(btnFlatwhite);
		
		btnLongBlack_1 = new JButton("Long Black");
		btnLongBlack_1.setForeground(Color.WHITE);
		btnLongBlack_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLongBlack_1.setBorder(null);
		btnLongBlack_1.setBackground(SystemColor.controlDkShadow);
		btnLongBlack_1.setBounds(394, 330, 121, 33);
		coffeeTab.add(btnLongBlack_1);
		
		btnMacchiato_1 = new JButton("Macchiato");
		btnMacchiato_1.setForeground(Color.WHITE);
		btnMacchiato_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMacchiato_1.setBorder(null);
		btnMacchiato_1.setBackground(SystemColor.controlDkShadow);
		btnMacchiato_1.setBounds(24, 513, 121, 33);
		coffeeTab.add(btnMacchiato_1);
		
		btnMochaccino_1 = new JButton("Mochaccino");
		btnMochaccino_1.setForeground(Color.WHITE);
		btnMochaccino_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnMochaccino_1.setBorder(null);
		btnMochaccino_1.setBackground(SystemColor.controlDkShadow);
		btnMochaccino_1.setBounds(204, 513, 121, 33);
		coffeeTab.add(btnMochaccino_1);
		
		teaTab = new JPanel();
		teaTab.setBackground(SystemColor.control);
		teaTab.setForeground(new Color(240, 240, 240));
		teaTab.setBorder(null);
		tabbedPane.addTab("Tea", null, teaTab, null);
		teaTab.setLayout(null);
		
		cBrewTea = new JLabel("");
		cBrewTea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "BrewedTea";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		cBrewTea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cBrewTea.setIcon(new ImageIcon(cBrewTeaIcon));
		cBrewTea.setHorizontalAlignment(SwingConstants.CENTER);
		cBrewTea.setBounds(26, 26, 121, 126);
		teaTab.add(cBrewTea);
		
		btnComfortWellnessBrewed = new JButton("C Brewed Tea");
		btnComfortWellnessBrewed.setForeground(Color.WHITE);
		btnComfortWellnessBrewed.setBorder(null);
		btnComfortWellnessBrewed.setBackground(SystemColor.controlDkShadow);
		btnComfortWellnessBrewed.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnComfortWellnessBrewed.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnComfortWellnessBrewed.setHorizontalTextPosition(SwingConstants.CENTER);
		btnComfortWellnessBrewed.setVerticalTextPosition(SwingConstants.CENTER);
		btnComfortWellnessBrewed.setBounds(26, 152, 121, 32);
		teaTab.add(btnComfortWellnessBrewed);
		
		
		clAndMistGreenTea = new JLabel("");
		clAndMistGreenTea.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "Cloud&Mint";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		clAndMistGreenTea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		clAndMistGreenTea.setIcon(new ImageIcon(clAndMistIcon));
		clAndMistGreenTea.setHorizontalAlignment(SwingConstants.CENTER);
		clAndMistGreenTea.setBounds(210, 26, 121, 126);
		teaTab.add(clAndMistGreenTea);
		
		btnCmGreenTea = new JButton("Cloud&Mi");
		btnCmGreenTea.setForeground(Color.WHITE);
		btnCmGreenTea.setBorder(null);
		btnCmGreenTea.setBackground(SystemColor.controlDkShadow);
		btnCmGreenTea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCmGreenTea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCmGreenTea.setBounds(210, 152, 121, 33);
		teaTab.add(btnCmGreenTea);
			
		mintTeaLbl = new JLabel("");
		mintTeaLbl.setBorder(null);
		mintTeaLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "HoneyMintTea";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		
		mintTeaLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		mintTeaLbl.setIcon(new ImageIcon(mintTeaIcon));
		mintTeaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		mintTeaLbl.setBounds(396, 26, 121, 126);
		teaTab.add(mintTeaLbl);
		
		btnHoneyminttea = new JButton("HoneyMint_Tea");
		btnHoneyminttea.setForeground(Color.WHITE);
		btnHoneyminttea.setBorder(null);
		btnHoneyminttea.setBackground(SystemColor.controlDkShadow);
		btnHoneyminttea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnHoneyminttea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnHoneyminttea.setHorizontalTextPosition(SwingConstants.CENTER);
		btnHoneyminttea.setVerticalTextPosition(SwingConstants.CENTER);
		btnHoneyminttea.setBounds(396, 151, 121, 33);
		teaTab.add(btnHoneyminttea);
			
		chaiLatteLbl = new JLabel("");
		chaiLatteLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "ChaiLatte";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		chaiLatteLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chaiLatteLbl.setIcon(new ImageIcon(chaiLatteIcon));
		chaiLatteLbl.setHorizontalAlignment(SwingConstants.CENTER);
		chaiLatteLbl.setBounds(26, 195, 121, 126);
		teaTab.add(chaiLatteLbl);
		
		btnChaiLatte = new JButton("Chai Latte");
		btnChaiLatte.setForeground(Color.WHITE);
		btnChaiLatte.setBorder(null);
		btnChaiLatte.setBackground(SystemColor.controlDkShadow);
		btnChaiLatte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChaiLatte.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChaiLatte.setBounds(26, 321, 121, 33);
		teaTab.add(btnChaiLatte);
		
		
		dBrewTeaLbl = new JLabel("");
		dBrewTeaLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "DBrewedTea";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		dBrewTeaLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		dBrewTeaLbl.setIcon(new ImageIcon(dBrewTeaIcon));
		dBrewTeaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		dBrewTeaLbl.setBounds(210, 195, 121, 126);
		teaTab.add(dBrewTeaLbl);
		
		btnDefensebrewedtea = new JButton("D Brewed Tea");
		btnDefensebrewedtea.setForeground(Color.WHITE);
		btnDefensebrewedtea.setBorder(null);
		btnDefensebrewedtea.setBackground(SystemColor.controlDkShadow);
		btnDefensebrewedtea.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnDefensebrewedtea.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnDefensebrewedtea.setBounds(210, 321, 121, 33);
		teaTab.add(btnDefensebrewedtea);

		
		
		icedMatchaLbl = new JLabel("");
		icedMatchaLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "IceMacha";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		icedMatchaLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		icedMatchaLbl.setIcon(new ImageIcon(icedMatchaIcon));
		icedMatchaLbl.setHorizontalAlignment(SwingConstants.CENTER);
		icedMatchaLbl.setBounds(396, 195, 121, 126);
		teaTab.add(icedMatchaLbl);
		
		btnIcedMacha = new JButton("Iced Macha ");
		btnIcedMacha.setForeground(Color.WHITE);
		btnIcedMacha.setBorder(null);
		btnIcedMacha.setBackground(SystemColor.controlDkShadow);
		btnIcedMacha.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIcedMacha.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIcedMacha.setBounds(396, 321, 121, 33);
		teaTab.add(btnIcedMacha);
		
		pumpkinSpiceLbl = new JLabel("");
		pumpkinSpiceLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "PumpkinSpice";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		pumpkinSpiceLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		pumpkinSpiceLbl.setIcon(new ImageIcon(pumpkinSpiceIcon));
		pumpkinSpiceLbl.setHorizontalAlignment(SwingConstants.CENTER);
		pumpkinSpiceLbl.setBounds(26, 363, 121, 126);
		teaTab.add(pumpkinSpiceLbl);
		
		btnIPumpkinSpice = new JButton("Pumpkin Spice");
		btnIPumpkinSpice.setForeground(Color.WHITE);
		btnIPumpkinSpice.setBorder(null);
		btnIPumpkinSpice.setBackground(SystemColor.controlDkShadow);
		btnIPumpkinSpice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIPumpkinSpice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIPumpkinSpice.setBounds(26, 489, 121, 33);
		teaTab.add(btnIPumpkinSpice);
		
		iceChaiLatte = new JLabel("");
		iceChaiLatte.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "IceChaiLatte";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		iceChaiLatte.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iceChaiLatte.setIcon(new ImageIcon(iceChaiLatteIcon));
		iceChaiLatte.setHorizontalAlignment(SwingConstants.CENTER);
		iceChaiLatte.setBounds(210, 363, 121, 126);
		teaTab.add(iceChaiLatte);
		
		btnIce = new JButton("IceChaiLatte");
		btnIce.setForeground(Color.WHITE);
		btnIce.setBorder(null);
		btnIce.setBackground(SystemColor.controlDkShadow);
		btnIce.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnIce.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnIce.setBounds(210, 489, 121, 33);
		teaTab.add(btnIce);
	
		lightSweetChai = new JLabel("");
		lightSweetChai.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "LightSweetChai";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		lightSweetChai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		lightSweetChai.setIcon(new ImageIcon(lightSweetChaiIcon));
		lightSweetChai.setHorizontalAlignment(SwingConstants.CENTER);
		lightSweetChai.setBounds(396, 363, 121, 126);
		teaTab.add(lightSweetChai);
		
		btnLightsweetchai = new JButton("LightSweetChai");
		btnLightsweetchai.setForeground(Color.WHITE);
		btnLightsweetchai.setBorder(null);
		btnLightsweetchai.setBackground(SystemColor.controlDkShadow);
		btnLightsweetchai.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLightsweetchai.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLightsweetchai.setBounds(396, 489, 121, 33);
		teaTab.add(btnLightsweetchai);
		
		dessertTab = new JPanel();
		dessertTab.setBackground(SystemColor.control);
		dessertTab.setForeground(new Color(240, 240, 240));
		dessertTab.setBorder(null);
		tabbedPane.addTab("Dessert", null, dessertTab, null);
		dessertTab.setLayout(null);
		
		brownieLbl = new JLabel("");
		brownieLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "Brownie";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		brownieLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		brownieLbl.setIcon(new ImageIcon(brownieIcon));
		brownieLbl.setHorizontalAlignment(SwingConstants.CENTER);
		brownieLbl.setBounds(29, 25, 121, 126);
		dessertTab.add(brownieLbl);
		
		brownieBtn = new JButton("Brownie");
		brownieBtn.setForeground(Color.WHITE);
		brownieBtn.setBorder(null);
		brownieBtn.setBackground(SystemColor.controlDkShadow);
		brownieBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		brownieBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		dessertTab.add(brownieBtn);
		brownieBtn.setBounds(29, 151, 121, 33);
		
		cIceCreamLbl = new JLabel("");
		cIceCreamLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "CIceCream";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		cIceCreamLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cIceCreamLbl.setIcon(new ImageIcon(cIceCreamIcon));
		cIceCreamLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cIceCreamLbl.setBounds(214, 25, 121, 126);
		dessertTab.add(cIceCreamLbl);
		
		btnCaramelIceCream = new JButton("C Ice Cream");
		btnCaramelIceCream.setForeground(Color.WHITE);
		btnCaramelIceCream.setBorder(null);
		btnCaramelIceCream.setBackground(SystemColor.controlDkShadow);
		btnCaramelIceCream.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnCaramelIceCream.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnCaramelIceCream.setBounds(214, 151, 121, 33);
		dessertTab.add(btnCaramelIceCream);
		
		cMacchiatoLbl = new JLabel("");
		cMacchiatoLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "CMachiato";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		cMacchiatoLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cMacchiatoLbl.setIcon(new ImageIcon(cMacchiatoIcon));
		cMacchiatoLbl.setHorizontalAlignment(SwingConstants.CENTER);
		cMacchiatoLbl.setBounds(397, 25, 121, 126);
		dessertTab.add(cMacchiatoLbl);
		
		JButton macchiatoBtn_1 = new JButton("C Macchiato");
		macchiatoBtn_1.setForeground(Color.WHITE);
		macchiatoBtn_1.setBorder(null);
		macchiatoBtn_1.setBackground(SystemColor.controlDkShadow);
		macchiatoBtn_1.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		macchiatoBtn_1.setFont(new Font("Tahoma", Font.PLAIN, 14));
		macchiatoBtn_1.setBounds(397, 151, 121, 33);
		dessertTab.add(macchiatoBtn_1);
		
		ChocoBMuffinLbl = new JLabel("");
		ChocoBMuffinLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "ChocoBMuFFin";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		ChocoBMuffinLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		ChocoBMuffinLbl.setIcon(new ImageIcon(ChocoBMuffinIcon));
		ChocoBMuffinLbl.setHorizontalAlignment(SwingConstants.CENTER);
		ChocoBMuffinLbl.setBounds(29, 192, 121, 126);
		dessertTab.add(ChocoBMuffinLbl);
	
		
		chocoBMuffinBtn = new JButton("ChocoBMuffin");
		chocoBMuffinBtn.setForeground(Color.WHITE);
		chocoBMuffinBtn.setBorder(null);
		chocoBMuffinBtn.setBackground(SystemColor.controlDkShadow);
		chocoBMuffinBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoBMuffinBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chocoBMuffinBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoBMuffinBtn.setBounds(29, 318, 121, 33);
		dessertTab.add(chocoBMuffinBtn);
		
		chocoCappuCakeLbl = new JLabel("");
		chocoCappuCakeLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "ChocoCCake";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		chocoCappuCakeLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoCappuCakeLbl.setIcon(new ImageIcon(chocoCappuCakeIcon));
		chocoCappuCakeLbl.setHorizontalAlignment(SwingConstants.CENTER);
		chocoCappuCakeLbl.setBounds(214, 192, 121, 126);
		dessertTab.add(chocoCappuCakeLbl);
		
		chocoCappuCakeBtn = new JButton("ChocoCCake");
		chocoCappuCakeBtn.setForeground(Color.WHITE);
		chocoCappuCakeBtn.setBorder(null);
		chocoCappuCakeBtn.setBackground(SystemColor.controlDkShadow);
		chocoCappuCakeBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoCappuCakeBtn.setFont(new Font("Tahoma", Font.PLAIN, 14));
		chocoCappuCakeBtn.setBounds(214, 318, 121, 33);
		dessertTab.add(chocoCappuCakeBtn);
		
		chocoCookieLbl = new JLabel("");
		chocoCookieLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "ChocoCookie";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		chocoCookieLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoCookieLbl.setIcon(new ImageIcon(chocoCookieIcon));
		chocoCookieLbl.setHorizontalAlignment(SwingConstants.CENTER);
		chocoCookieLbl.setBounds(397, 192, 121, 126);
		dessertTab.add(chocoCookieLbl);
		
		btnChococookie = new JButton("ChocoCookie");
		btnChococookie.setForeground(Color.WHITE);
		btnChococookie.setBorder(null);
		btnChococookie.setBackground(SystemColor.controlDkShadow);
		btnChococookie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChococookie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChococookie.setBounds(397, 318, 121, 33);
		dessertTab.add(btnChococookie);
		
		liqueurIceCreamLbl = new JLabel("");
		liqueurIceCreamLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "LiqueurIce";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		liqueurIceCreamLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		liqueurIceCreamLbl.setIcon(new ImageIcon(liqueurIceCreamIcon));
		liqueurIceCreamLbl.setHorizontalAlignment(SwingConstants.CENTER);
		liqueurIceCreamLbl.setBounds(29, 357, 121, 126);
		dessertTab.add(liqueurIceCreamLbl);
		
		btnLiqueurice = new JButton("liqueur Ice ");
		btnLiqueurice.setForeground(Color.WHITE);
		btnLiqueurice.setBorder(null);
		btnLiqueurice.setBackground(SystemColor.controlDkShadow);
		btnLiqueurice.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnLiqueurice.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnLiqueurice.setBounds(29, 483, 121, 33);
		dessertTab.add(btnLiqueurice);
		
		doubleChocoTriffleLbl = new JLabel("");
		doubleChocoTriffleLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "ChocoTriffle";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		doubleChocoTriffleLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		doubleChocoTriffleLbl.setIcon(new ImageIcon(doubleChocoTriffleIcon));
		doubleChocoTriffleLbl.setHorizontalAlignment(SwingConstants.CENTER);
		doubleChocoTriffleLbl.setBounds(214, 357, 121, 126);
		dessertTab.add(doubleChocoTriffleLbl);
		
		btnChocoTriffle = new JButton("Choco Triffle");
		btnChocoTriffle.setForeground(Color.WHITE);
		btnChocoTriffle.setBorder(null);
		btnChocoTriffle.setBackground(SystemColor.controlDkShadow);
		btnChocoTriffle.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnChocoTriffle.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnChocoTriffle.setBounds(214, 483, 121, 33);
		dessertTab.add(btnChocoTriffle);
		
		chocoPecanPieLbl = new JLabel("");
		chocoPecanPieLbl.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				TChoice optionWindow = new TChoice();
				eachItemName = "PecanPie";
				optionWindow.setEachItemName(eachItemName);
				optionWindow.setLocationRelativeTo(null);
				optionWindow.setVisible(true);
			}
		});
		chocoPecanPieLbl.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		chocoPecanPieLbl.setIcon(new ImageIcon(chocoPecanPieIcon));
		chocoPecanPieLbl.setHorizontalAlignment(SwingConstants.CENTER);
		chocoPecanPieLbl.setBounds(397, 357, 121, 126);
		dessertTab.add(chocoPecanPieLbl);
		
		btnPecanPie = new JButton("Pecan Pie");
		btnPecanPie.setForeground(Color.WHITE);
		btnPecanPie.setBorder(null);
		btnPecanPie.setBackground(SystemColor.controlDkShadow);
		btnPecanPie.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnPecanPie.setFont(new Font("Tahoma", Font.PLAIN, 14));
		btnPecanPie.setBounds(397, 483, 121, 33);
		dessertTab.add(btnPecanPie);
		
		btnAddToCart = new JButton("Add to Cart");
		btnAddToCart.setBackground(new Color(30, 144, 255));
		btnAddToCart.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TransactionData data = new TransactionData();
				data.connectionSQLite();
				data.getData();
				itemName = data.getDataItemName();
				qty = data.getDataQty();
				eachItemPrice = data.getDataEachPrice();
				totalPrice = data.getDataTotalPrice();
				System.out.println(itemName);
				System.out.println(qty);
				System.out.println(eachItemPrice);
				System.out.println(totalPrice);
				model.addRow(new Object[] {data.getDataItemName(), data.getDataQty(), data.getDataEachPrice(), data.getDataTotalPrice()});
				cashierTable.setModel(model);
				discTxtArea.setText("0.00");
				sum = sum + totalPrice;
				float discount = Float.parseFloat(discTxtArea.getText());
				float subTotal = sum - discount;
				float total = subTotal;
				balDue = total;
				System.out.println(discount);
				System.out.println(subTotal);
				System.out.println(total);
				subTxtArea.setText(Float.toString(subTotal));
				totalTxtArea.setText(Float.toString(total));
				balDueTxtArea.setText(Float.toString(balDue));
			}
		});
		btnAddToCart.setBounds(333, 562, 121, 32);
		tablePanel.add(btnAddToCart);
		
		
		btnAddToCart.setFont(new Font("Tahoma", Font.PLAIN, 14));

		
		btnAddToCart.setVerticalTextPosition(SwingConstants.CENTER);
		btnAddToCart.setText("Add To Cart");
		btnAddToCart.setHorizontalTextPosition(SwingConstants.CENTER);
		btnAddToCart.setForeground(Color.WHITE);
		btnAddToCart.setFont(new Font("Segoe UI", Font.PLAIN, 13));
		btnAddToCart.setBorder(null);
//		btnAddToCart.setBackground(SystemColor.CONTROL_DK_SHADOW);
		
		JButton btnAdd = new JButton("+");
		btnAdd.setBorder(null);
		btnAdd.setForeground(Color.WHITE);
		btnAdd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				numberOrder++;
				DefaultTableModel dm = (DefaultTableModel) cashierTable.getModel();
				dm.getDataVector().removeAllElements();
				dm.fireTableDataChanged();
				sum = (float) 0.00;
				discTxtArea.setText(discTxtArea.getText().replaceAll(discTxtArea.getText(), ""));
				subTxtArea.setText(subTxtArea.getText().replaceAll(subTxtArea.getText(), ""));
				totalTxtArea.setText(totalTxtArea.getText().replaceAll(totalTxtArea.getText(), ""));
				balDueTxtArea.setText(balDueTxtArea.getText().replaceAll(balDueTxtArea.getText(), ""));
				numberLbl.setText(String.valueOf(numberOrder));
			}
		});
		btnAdd.setFont(new Font("Tahoma", Font.BOLD, 20));
		btnAdd.setBackground(Color.ORANGE);
		btnAdd.setBounds(419, 50, 35, 23);
		tablePanel.add(btnAdd);
		
		payBtn = new JButton("");
		payBtn.setBounds(195, 594, 64, 64);
		payBtn.setBorder(null);
		tablePanel.add(payBtn);
		payBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				PosCalculator payment = new PosCalculator();
				payment.setTotalCash(sum);
				payment.setLocationRelativeTo(null);
				payment.setVisible(true);
			}
		});
		payBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		payBtn.setIcon(new ImageIcon(transactionBtn));
		payBtn.setOpaque(true);
		payBtn.setBorder(null);
		payBtn.setBackground(Color.WHITE);
		
		JLabel payLabel = new JLabel("Pay");
		payLabel.setBounds(205, 660, 48, 26);
		tablePanel.add(payLabel);
		payLabel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		payLabel.setHorizontalAlignment(SwingConstants.CENTER);
		payLabel.setFont(new Font("Segoe UI", Font.BOLD, 13));
		
		numberLbl = new JLabel("0");
		numberLbl.setHorizontalAlignment(SwingConstants.CENTER);
		numberLbl.setFont(new Font("Tahoma", Font.PLAIN, 17));
		numberLbl.setBounds(280, 47, 16, 30);
		tablePanel.add(numberLbl);
		
		JLabel label = new JLabel("POS");
		label.setBounds(118, 11, 169, 49);
		cashPanel.add(label);
		label.setForeground(Color.ORANGE);
		label.setFont(new Font("Stencil", Font.PLAIN, 40));
		
		JLabel label_1 = new JLabel("SYSTEM");
		label_1.setBounds(203, 11, 169, 49);
		cashPanel.add(label_1);
		label_1.setFont(new Font("Stencil", Font.PLAIN, 40));
	}
	
	public void setPanelColor(JPanel panel) {
		panel.setBackground(new Color(248, 148, 6));
	}
	
	public void resetPanelColor(JPanel teaTab2) {
		teaTab2.setBackground(new Color(250, 170, 56));
	}
	
}
