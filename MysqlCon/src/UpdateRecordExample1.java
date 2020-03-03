import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author imssbora
 */
public class UpdateRecordExample1 {

  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/bala";
    String username = "root";
    String password = "mini";
    String sql = "update bala set name='bala' where UID=3";

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
        Statement stmt = conn.createStatement();) {
      
      stmt.executeUpdate(sql);
      System.out.println("Database updated successfully ");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}