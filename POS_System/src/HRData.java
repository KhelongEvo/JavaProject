import java.io.File;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class HRData {

	private String selectedFullName;
	private String selectedPassword;
	private String position;
	public HRData() {
		// TODO Auto-generated constructor stub
		
	}
	
	public Connection connectionSQLite() {
		Connection con = null;
		File newFile = new File("StaffDB.db");
		String url = newFile.getAbsolutePath().replace("\\", "\\\\");
		String connectString = "jdbc:sqlite:" + url;
		try {
			con = DriverManager.getConnection(connectString);
			
			
		} catch (SQLException e) {	
			System.out.println(e.getMessage());
		} 
		return con;
	}
	
	public void recordHr(String fullName, String email, String password,  String position) {
		if (position == "admin") {
			String sql = "INSERT INTO admin(FullName, Email, Password) VALUES(?,?,?)";
			
			try (Connection con = this.connectionSQLite();
					PreparedStatement statement = con.prepareStatement(sql)) {
				statement.setString(1, fullName);
				statement.setString(2, email);
				statement.setString(3, password);
				statement.executeUpdate();
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} 
			
		} else {
			String sql = "INSERT INTO staff(FullName, Email, Password) VALUES(?,?,?)";
			
			try (Connection con = this.connectionSQLite();
					PreparedStatement statement = con.prepareStatement(sql)) {
				statement.setString(1, fullName);
				statement.setString(2, email);
				statement.setString(3, password);
				statement.executeUpdate();
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			} 
			
		} 
	}
	
	public boolean CheckHr(String fullName, String password, String email, String position) {
		boolean checkUser = false; 
		if (position == "staff") {
			String sql = "SELECT * FROM staff WHERE FullName LIKE '"+fullName+"%' OR Email LIKE '"+email+"' AND Password LIKE '"+password+"'";
			
			try (Connection con = this.connectionSQLite();
					PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet result = statement.executeQuery();
				
				while (result.next()) {
					checkUser = true;
				}
				
				
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
			
		} else {
			String sql = "SELECT * FROM admin WHERE FullName LIKE '"+fullName+"%' OR Email LIKE '"+email+"' AND Password LIKE '"+password+"'";
			
			try (Connection con = this.connectionSQLite();
					PreparedStatement statement = con.prepareStatement(sql)) {
			ResultSet result = statement.executeQuery();
				
				while (result.next()) {
					checkUser = true;
				}
				
			
			} catch (SQLException e) {
				System.out.println(e.getMessage());
			}
		}
		return checkUser;
		
	}


	public String getSelectedPassword() {
		return selectedPassword;
	}

	public void setPassword(String selectedPassword) {
		this.selectedPassword = selectedPassword;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}


	public String getSelectedFullName() {
		return selectedFullName;
	}

	public void setSelectedFullName(String selectedFullName) {
		this.selectedFullName = selectedFullName;
	}

}
