import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.color.*;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import javax.swing.JToggleButton;
import java.awt.CardLayout;
import javax.swing.JSpinner;
import javax.swing.SpinnerNumberModel;
import javax.swing.Icon;

public class Choice extends JFrame {

	private final JPanel contentPanel = new JPanel();
	private String itemName;
	private String eachItemName;
	private int quantity;
	private float total;
	private float optionAmount;
	private String typeCoffee;
	public Image dialogBackground;
	public FrontEndUI transferData;
	public JSpinner qtySpinner;
	/**
	 * Launch the application.
	 */
//	public static void main(String[] args) {
//		try {
//			Choice dialog = new Choice(transferData);
//			dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
//			dialog.setVisible(true);
//		} catch (Exception e) {
//			e.printStackTrace();
//		}
//	}
	/**
	 * Constructor
	 */

	public Choice() {
		
		// TODO Auto-generated constructor stub
		initComponents();
	}


	/**
	 * Create the dialog.
	 */
	public void initComponents() {
		setBounds(100, 100, 479, 323);
		setUndecorated(true);
		setBackground(null);
		getContentPane().setLayout(new BorderLayout());
		contentPanel.setBorder(new EmptyBorder(5, 5, 5, 5));
		getContentPane().add(contentPanel, BorderLayout.CENTER);
		dialogBackground = new ImageIcon(this.getClass().getResource("Artboard 1.png")).getImage().getScaledInstance(479, 323, Image.SCALE_SMOOTH);
		
		
		ButtonGroup group = new ButtonGroup();
		
		JToggleButton typeBtn = new JToggleButton("Type");
		typeBtn.setContentAreaFilled(false);
		typeBtn.setDisabledIcon(null);
		typeBtn.setSelected(false);
		typeBtn.setFont(new Font("Dialog", Font.BOLD, 14));
		typeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		typeBtn.setVerticalTextPosition(SwingConstants.CENTER);
		typeBtn.setForeground(Color.DARK_GRAY);
		typeBtn.setBounds(33, 58, 117, 32);
		Image newTypeBtnIcon = new ImageIcon(this.getClass().getResource("btn1.png")).getImage().getScaledInstance(117, 32, Image.SCALE_SMOOTH);
		Image newSizeBtn = new ImageIcon(this.getClass().getResource("btn1.png")).getImage().getScaledInstance(117, 32, Image.SCALE_SMOOTH);
		Image oldTypeBtnIcon = new ImageIcon(this.getClass().getResource("whiteBtn.png")).getImage().getScaledInstance(117, 32, Image.SCALE_SMOOTH);
		Image oldSizeBtn = new ImageIcon(this.getClass().getResource("whiteBtn.png")).getImage().getScaledInstance(117, 32, Image.SCALE_SMOOTH);;
		
		contentPanel.setLayout(null);
		
		JLabel lblQty = new JLabel("Quantity: ");
		lblQty.setFont(new Font("Dialog", Font.BOLD, 15));
		lblQty.setBounds(20, 223, 87, 21);
		contentPanel.add(lblQty);
		
		typeBtn.setIcon(new ImageIcon(oldTypeBtnIcon));
		typeBtn.setDisabledIcon(new ImageIcon(oldTypeBtnIcon));
		typeBtn.setPressedIcon(new ImageIcon(newTypeBtnIcon));
		typeBtn.setSelectedIcon(new ImageIcon(newTypeBtnIcon));
		typeBtn.setDisabledSelectedIcon(new ImageIcon(newTypeBtnIcon));
		
		typeBtn.setBackground(new Color(240, 240, 240));
		typeBtn.setBorderPainted(false);
		typeBtn.setIcon(new ImageIcon(oldTypeBtnIcon));
		contentPanel.add(typeBtn);
		
		group.add(typeBtn);
		
		Image oldAddBtn = new ImageIcon(this.getClass().getResource("oldAddBtn.png")).getImage().getScaledInstance(97, 30, Image.SCALE_SMOOTH);
		Image newAddBtn = new ImageIcon(this.getClass().getResource("newAddBtn.png")).getImage().getScaledInstance(97, 30, Image.SCALE_SMOOTH);
		
		JButton closeBtn = new JButton(new ImageIcon(oldAddBtn));
		closeBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		closeBtn.setText("Close");
		closeBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		closeBtn.setVerticalTextPosition(SwingConstants.CENTER);
		closeBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		closeBtn.setBackground(new Color(240, 240, 240));
		closeBtn.setForeground(Color.DARK_GRAY);
		closeBtn.setIcon(new ImageIcon(oldAddBtn));
		closeBtn.setDisabledIcon(new ImageIcon(oldAddBtn));
		closeBtn.setPressedIcon(new ImageIcon(newAddBtn));
		closeBtn.setSelectedIcon(new ImageIcon(newAddBtn));
		closeBtn.setDisabledSelectedIcon(new ImageIcon(newAddBtn));
		closeBtn.setBorder(null);
		closeBtn.setContentAreaFilled(false);
		closeBtn.setBorderPainted(false);
		closeBtn.setBounds(249, 280, 101, 32);
		contentPanel.add(closeBtn);
		
		JButton addBtn = new JButton(new ImageIcon(oldAddBtn));
		addBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				itemName = eachItemName + "-" + typeCoffee;
//				System.out.println(getItemName());
				if (eachItemName == "BrewedTea" || eachItemName == "Cloud&Mint" || eachItemName == "HoneyMintTea" || eachItemName == "ChaiLatte" ||
					eachItemName == "DBrewedTea" || eachItemName == "IceMacha"	|| eachItemName == "PumpkinSpice" || eachItemName == "IceChaiLatte" || 
					eachItemName == "LightSweetChai") {
					
					ItemDatabase teaInventory = new ItemDatabase();
					teaInventory.connectionSQLite();
					teaInventory.getTeaFromInventory(eachItemName);
					TransactionData teaTransaction = new TransactionData();
					teaTransaction.connectionSQLite();
					teaTransaction.recordData(teaInventory.getSelectItemName(), quantity, teaInventory.getSelectItemPrice(), getOptionAmount());
					
				} else if (eachItemName == "Brownie" || eachItemName == "CIceCream" || eachItemName == "CMachiato" || eachItemName == "ChocoBMuFFin" || 
						eachItemName == "ChocoCCake" || eachItemName == "ChocoCookie" || eachItemName == "LiqueurIce" || eachItemName == "ChocoTriffle" ||
						eachItemName == "PecanPie") {
					
					ItemDatabase dessertInventory = new ItemDatabase();
					dessertInventory.connectionSQLite();
					dessertInventory.getDessertFromInventory(eachItemName);
					TransactionData dessertTransaction = new TransactionData();
					dessertTransaction.recordData(dessertInventory.getSelectItemName(), quantity, dessertInventory.getSelectItemPrice(), getOptionAmount());
					
					
				} else if (eachItemName == "Americano" || eachItemName == "Cappuccino" || eachItemName == "Cafelatte" || eachItemName == "Expresso" || 
						eachItemName == "Flatwhite" || eachItemName == "Longblack" || eachItemName == "Macchiato" || eachItemName == "Mochaccino") {
					quantity = (int) qtySpinner.getValue();
					float eachItemAmount = getOptionAmount();
					
					ItemDatabase coffeeInventory = new ItemDatabase();
					coffeeInventory.connectionSQLite();
					coffeeInventory.getItemFromInventory(itemName, typeCoffee);
//					System.out.println(coffeeInventory.getSelectItemName());
//					System.out.println(coffeeInventory.getSelectItemPrice());
//					System.out.println(optionAmount);
					total = eachItemAmount * quantity;
//					System.out.println(quantity);
					TransactionData transaction = new TransactionData();
					transaction.connectionSQLite();
					transaction.recordData(coffeeInventory.getSelectItemName(), quantity, coffeeInventory.getSelectItemPrice(), total);
					setVisible(false);
				}
				
					
			}
		});
		addBtn.setIcon(new ImageIcon(oldAddBtn));
		addBtn.setDisabledIcon(new ImageIcon(oldAddBtn));
		addBtn.setPressedIcon(new ImageIcon(newAddBtn));
		addBtn.setSelectedIcon(new ImageIcon(newAddBtn));
		addBtn.setDisabledSelectedIcon(new ImageIcon(newAddBtn));
		addBtn.setText("Add");
		addBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		addBtn.setVerticalTextPosition(SwingConstants.CENTER);
		addBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		addBtn.setBackground(new Color(240, 240, 240));
		addBtn.setForeground(Color.DARK_GRAY);
		addBtn.setBorder(null);
		addBtn.setContentAreaFilled(false);
		addBtn.setBorderPainted(false);
		addBtn.setBounds(368, 280, 101, 32);
		contentPanel.add(addBtn);
		
		JPanel homePanel = new JPanel();
		homePanel.setForeground(Color.WHITE);
		homePanel.setBorder(null);
		homePanel.setBounds(10, 97, 459, 103);
		contentPanel.add(homePanel);
		homePanel.setLayout(new CardLayout(0, 0));
		
		JPanel panel1 = new JPanel();
		panel1.setBorder(null);
		homePanel.add(panel1, "name_261925863825505");
		panel1.setLayout(null);
		
		Image oldBtn = new ImageIcon(this.getClass().getResource("oldBtn.png")).getImage().getScaledInstance(134, 74, Image.SCALE_SMOOTH);
		Image newBtn = new ImageIcon(this.getClass().getResource("newOrangeBtn.png")).getImage().getScaledInstance(134, 74, Image.SCALE_SMOOTH);
		
		ButtonGroup typeGroup = new ButtonGroup();
		
		JToggleButton hotBtn = new JToggleButton(new ImageIcon(oldBtn));
		hotBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTypeCoffee("hot");
				setOptionAmount((float) 1.75);
//				System.out.println(typeCoffee);
//				System.out.println(optionAmount);
			}
		});
		hotBtn.setText("Hot - $1.75");
		hotBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		hotBtn.setVerticalTextPosition(SwingConstants.CENTER);
		hotBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		hotBtn.setBackground(new Color(240, 240, 240));
		hotBtn.setForeground(Color.DARK_GRAY);
		hotBtn.setContentAreaFilled(false);
		hotBtn.setBorder(null);
		hotBtn.setIcon(new ImageIcon(oldBtn));
		hotBtn.setDisabledIcon(new ImageIcon(oldBtn));
		hotBtn.setPressedIcon(new ImageIcon(newBtn));
		hotBtn.setSelectedIcon(new ImageIcon(newBtn));
		hotBtn.setDisabledSelectedIcon(new ImageIcon(newBtn));
		hotBtn.setBounds(33, 11, 134, 74);
		panel1.add(hotBtn);
		
		JToggleButton iceBtn = new JToggleButton(new ImageIcon(oldBtn));
		iceBtn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setTypeCoffee("ice");
				setOptionAmount((float) 2.00);
//				System.out.println(typeCoffee);
//				System.out.println(optionAmount);
			}
		});
		iceBtn.setFont(new Font("Dialog", Font.BOLD, 15));
		iceBtn.setText("Ice - $2.00");
		iceBtn.setHorizontalTextPosition(SwingConstants.CENTER);
		iceBtn.setVerticalTextPosition(SwingConstants.CENTER);
		iceBtn.setBackground(new Color(240, 240, 240));
		iceBtn.setForeground(Color.DARK_GRAY);
		iceBtn.setBorderPainted(false);
		iceBtn.setContentAreaFilled(false);
		iceBtn.setBorder(null);
		iceBtn.setIcon(new ImageIcon(oldBtn));
		iceBtn.setDisabledIcon(new ImageIcon(oldBtn));
		iceBtn.setPressedIcon(new ImageIcon(newBtn));
		iceBtn.setSelectedIcon(new ImageIcon(newBtn));
		iceBtn.setDisabledSelectedIcon(new ImageIcon(newBtn));
		iceBtn.setBounds(187, 11, 134, 74);
		panel1.add(iceBtn);
		
		typeGroup.add(hotBtn);
		typeGroup.add(iceBtn);
		
//		ButtonGroup sizeGroup = new ButtonGroup();
		
		qtySpinner = new JSpinner();
		qtySpinner.setFont(new Font("Dialog", Font.BOLD, 13));
		qtySpinner.setModel(new SpinnerNumberModel(0, 0, 10, 1));
		qtySpinner.setBounds(103, 225, 94, 21);
		contentPanel.add(qtySpinner);
		
		JToggleButton tglbtnUpgradeSize = new JToggleButton(new ImageIcon(oldBtn));
		tglbtnUpgradeSize.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setOptionAmount((float) (optionAmount + 0.50));
//				System.out.println(typeCoffee);
//				System.out.println(optionAmount);
			}
		});
		tglbtnUpgradeSize.setIcon(new ImageIcon(oldBtn));
		tglbtnUpgradeSize.setDisabledIcon(new ImageIcon(oldBtn));
		tglbtnUpgradeSize.setPressedIcon(new ImageIcon(newBtn));
		tglbtnUpgradeSize.setSelectedIcon(new ImageIcon(newBtn));
		tglbtnUpgradeSize.setDisabledSelectedIcon(new ImageIcon(newBtn));
		tglbtnUpgradeSize.setVerticalTextPosition(SwingConstants.CENTER);
		tglbtnUpgradeSize.setText("Large");
		tglbtnUpgradeSize.setHorizontalTextPosition(SwingConstants.CENTER);
		tglbtnUpgradeSize.setForeground(Color.DARK_GRAY);
		tglbtnUpgradeSize.setFont(new Font("Dialog", Font.BOLD, 14));
		tglbtnUpgradeSize.setContentAreaFilled(false);
		tglbtnUpgradeSize.setBorderPainted(false);
		tglbtnUpgradeSize.setBackground(SystemColor.menu);
		tglbtnUpgradeSize.setBounds(313, 217, 156, 32);
		contentPanel.add(tglbtnUpgradeSize);
		JLabel backgroundLbl = new JLabel("");
		backgroundLbl.setBounds(0, 0, 479, 323);
		backgroundLbl.setForeground(java.awt.Color.WHITE);
		backgroundLbl.setBackground(java.awt.Color.WHITE);
		backgroundLbl.setHorizontalAlignment(SwingConstants.CENTER);
		backgroundLbl.setIcon(new ImageIcon(dialogBackground));
		contentPanel.add(backgroundLbl);
		
		
	}
	
	
	public float getOptionAmount() {
		return optionAmount;
	}

	public void setOptionAmount(float optionAmount) {
		this.optionAmount = optionAmount;
	}

	public String getTypeCoffee() {
		return typeCoffee;
	}

	public void setTypeCoffee(String typeCoffee) {
		this.typeCoffee = typeCoffee;
	}


	public String getItemName() {
		return itemName;
	}


	public void setItemName(String itemName) {
		this.itemName = itemName;
	}


	public int getQuantity() {
		return quantity;
	}


	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}


	public float getTotal() {
		return total;
	}


	public void setTotal(float total) {
		this.total = total;
	}


	public String getEachItemName() {
		return eachItemName;
	}


	public void setEachItemName(String eachItemName) {
		this.eachItemName = eachItemName;
	}
	
}
