import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author imssbora
 */
public class SelectRecordExample1 {

  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/bala";
    String username = "root";
    String password = "mini";
    String sql = "select * from bala";
    
    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
        Statement stmt = conn.createStatement(); 
        ResultSet rs = stmt.executeQuery(sql);) {
      
      int row = 0;
      while (rs.next()) {
        System.out.println("----------Row " + (++row) + " ------------");
        System.out.println("UID=" + rs.getString(1));
        System.out.println("NAME=" + rs.getString(2));
        System.out.println("DOB=" + rs.getString(3));
        System.out.println("EMAIL=" + rs.getString(4));
      
        System.out.println();
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}