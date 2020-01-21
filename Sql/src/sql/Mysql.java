package sql;
  
import java.sql.*;
public class Mysql {

	public static void main(String[] args) throws SQLException {
		// TODO Auto-generated method stub
       try
       {
    	   Class.forName("com.sql.jdbc.Driver");
          Connection com=DriverManager.getConnection("jdbc:mysql://localhost:3306/mini","root","mini");
          PreparedStatement ps=com.prepareStatement("select * from mini");
          ResultSet rs=ps.executeQuery();
          while(rs.next())
          {
        	  System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getInt(4));
          }
          com.close();
       }catch(ClassNotFoundException e)
       {
    	   e.printStackTrace();
       }
	}

}
