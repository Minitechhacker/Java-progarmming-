import java.sql.*;
public class MysqlCon {

	public static void main(String args[]){  
		{  
			try
			{  
			Class.forName("com.mysql.jdbc.Driver");  //load driver
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/xic","root","mini");  
			//here sonoo is database name, root is username and password  
			PreparedStatement stmt=con.prepareStatement("insert into users values(?,?)"); 
			stmt.setInt(1, 12);
			stmt.setString(2, "mini");
			stmt.executeUpdate();
			System.out.println("updated");
			con.close();  
			}catch(Exception e){ System.out.println(e);}  
			}  
}
}
