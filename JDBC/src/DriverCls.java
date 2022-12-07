import java.sql.*;

public class DriverCls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con;
			con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","system");
			Statement stmt;
			stmt=con.createStatement();
			ResultSet rs;
			rs=stmt.executeQuery("select* from cbit_cse");
			while(rs.next()) {
				System.out.println(rs.getInt(1)+" "+rs.getString(2));
			}
			con.close();
		}
		catch(Exception e) {
			System.out.println(e);
		}
	}

}
