import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.table.DefaultTableModel;

public class ItemDatabase {

	private String itemName;
	private String eachItemName;
	private String typeOfCoffee;
	private String selectItemName;
	private float selectItemPrice;
	private float total;
	private int quantity;
	public ItemDatabase() {
		// TODO Auto-generated constructor stub
	}

	public String getTypeOfCoffee() {
		return typeOfCoffee;
	}
	
	public void setTypeOfCoffee(String typeOfCoffee) {
		this.typeOfCoffee = typeOfCoffee;
	}
	
	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	
	public Connection connectionSQLite() {
		Connection con = null;
		File newFile = new File("POSdb.db");
		String url = newFile.getAbsolutePath().replace("\\", "\\\\");
		String connectString = "jdbc:sqlite:" + url;
		try {
			con = DriverManager.getConnection(connectString);
			
			
		} catch (SQLException e) {	
			System.out.println(e.getMessage());
		} 
		return con;
	}
	// Method to check if there is any item in inventory
	public void getItemFromInventory(String itemName, String typeOfCoffee) {
		String sql = "SELECT * FROM coffee WHERE name LIKE '"+itemName+"%' AND type LIKE '"+typeOfCoffee+"'";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
		ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				selectItemName = result.getString("name");
				selectItemPrice = result.getFloat("price");
				setSelectItemName(selectItemName);
				setSelectItemPrice(selectItemPrice);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void getTeaFromInventory(String itemName) {
		String sql = "SELECT * FROM tea WHERE name LIKE '"+itemName+"' ";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
		ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				selectItemName = result.getString("name");
				selectItemPrice = result.getFloat("price");
				setSelectItemName(selectItemName);
				setSelectItemPrice(selectItemPrice);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public void getDessertFromInventory(String itemName) {
		String sql = "SELECT * FROM dessert WHERE name LIKE '"+itemName+"' ";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
		ResultSet result = statement.executeQuery();
			
			while (result.next()) {
				selectItemName = result.getString("name");
				selectItemPrice = result.getFloat("price");
				setSelectItemName(selectItemName);
				setSelectItemPrice(selectItemPrice);
			}
			
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public String getSelectItemName() {
		return selectItemName;
	}

	public void setSelectItemName(String selectItemName) {
		this.selectItemName = selectItemName;
	}

	public float getSelectItemPrice() {
		return selectItemPrice;
	}

	public void setSelectItemPrice(float selectItemPrice) {
		this.selectItemPrice = selectItemPrice;
	}

	public float getTotal() {
		return total;
	}

	public void setTotal(float total) {
		this.total = total;
	}

	public int getQuantity() {
		return quantity;
	}

	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}

	public String getEachItemName() {
		return eachItemName;
	}

	public void setEachItemName(String eachItemName) {
		this.eachItemName = eachItemName;
	}
	
//	public static void main(String[] args) {
//		String itemName = "Cappuccino-ice";
//		int qty = 1;
//		String itemType = "ice";
//		float total = (float) 1.75;
//		ItemDatabase demo = new ItemDatabase(itemName, itemType, qty, total);
//		demo.connectionSQLite();
//		demo.getItemFromInventory();
//		System.out.println(demo.getSelectItemName());
//		System.out.println(demo.getQuantity());
//		System.out.println(demo.getSelectItemPrice());
//		System.out.println(demo.getTotal());
//	}
	
}
