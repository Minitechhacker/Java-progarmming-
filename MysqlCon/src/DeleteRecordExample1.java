import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DeleteRecordExample1 {

  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/bala";
    String username = "root";
    String password = "mini";
    String sql = "delete from bala where UID=1";

    try (Connection conn = DriverManager.getConnection(jdbcUrl, username, password); 
        Statement stmt = conn.createStatement();) {
      
      stmt.executeUpdate(sql);
      System.out.println("Record deleted successfully");
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }
}