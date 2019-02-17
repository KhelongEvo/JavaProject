import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class TransactionData {
	private String itemName;
	private int qty;
	private float eachPrice;
	private float totalPrice;
	
	private String dataItemName;
	private int dataQty;
	private float dataEachPrice;
	private float dataTotalPrice;
	private float dataSum;
	public TransactionData() {
		// TODO Auto-generated constructor stub
		this.setItemName(itemName);
		this.setQty(qty);
		this.setEachPrice(eachPrice);
		this.setTotalPrice(totalPrice);
	}
	
	public Connection connectionSQLite() {
		Connection con = null;
		File newFile = new File("Transaction.db");
		String url = newFile.getAbsolutePath().replace("\\", "\\\\");
		String connectString = "jdbc:sqlite:" + url;
		try {
			con = DriverManager.getConnection(connectString);
			
			
		} catch (SQLException e) {	
			System.out.println(e.getMessage());
		} 
		return con;
	}
	
//	public void sumUpData() {
//		
//	}
	
	public void getData() {
		String sql = "SELECT * FROM itemTransaction";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet rs = statement.executeQuery();
			while (rs.next()) {
				dataItemName = rs.getString("Name");
				dataQty = rs.getInt("Qty");
				dataEachPrice = rs.getFloat("Each");
				dataTotalPrice = rs.getFloat("Total");				
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void recordData(String itemName, int qty, float eachPrice, float totalPrice) {
		String sql = "INSERT INTO itemTransaction(Name, Qty, Each, Total) VALUES(?,?,?,?)";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
			statement.setString(1, itemName);
			statement.setInt(2, qty);
			statement.setFloat(3, eachPrice);
			statement.setFloat(4, totalPrice);
			statement.executeUpdate();
			
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}
	
	public void deleteAllData() {
		String sql = "DELETE FROM transaction";
		
		try (Connection con = this.connectionSQLite();
				PreparedStatement statement = con.prepareStatement(sql)) {
			statement.executeUpdate();
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		}
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public void setTotalPrice(float totalPrice) {
		this.totalPrice = totalPrice;
	}

	public float getEachPrice() {
		return eachPrice;
	}

	public void setEachPrice(float eachPrice) {
		this.eachPrice = eachPrice;
	}

	public String getDataItemName() {
		return dataItemName;
	}

	public void setDataItemName(String dataItemName) {
		this.dataItemName = dataItemName;
	}

	public int getDataQty() {
		return dataQty;
	}

	public void setDataQty(int dataQty) {
		this.dataQty = dataQty;
	}

	public float getDataEachPrice() {
		return dataEachPrice;
	}

	public void setDataEachPrice(float dataEachPrice) {
		this.dataEachPrice = dataEachPrice;
	}

	public float getDataTotalPrice() {
		return dataTotalPrice;
	}

	public void setDataTotalPrice(float dataTotalPrice) {
		this.dataTotalPrice = dataTotalPrice;
	}

	public float getDataSum() {
		return dataSum;
	}

	public void setDataSum(float dataSum) {
		this.dataSum = dataSum;
	}

}
