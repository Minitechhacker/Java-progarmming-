import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author imssbora
 */
public class InsertRecordExample {

  public static void main(String[] args) {
    String jdbcUrl = "jdbc:mysql://localhost:3306/bala";
    String username = "root";
    String password = "mini";

    Connection conn = null;
    Statement stmt = null;

    try {
      //Open connection
      conn = DriverManager.getConnection(jdbcUrl, username, password);
      
      //Create statement
      stmt = conn.createStatement();

//      //Insert first reocod
//      String record1="INSERT INTO bala (UID, NAME, DOB, EMAIL) "
//          + "VALUES (1,'Joseph','1988-12-25','joe@example.com')";
//      stmt.executeUpdate(record1);
//      
    //Insert second reocod
      String record2="INSERT INTO bala (UID, NAME, DOB, EMAIL) "
          + "VALUES (2,'Andrew','1975-05-20','andrew@example.com')";
      stmt.executeUpdate(record2);
      
      String record3="INSERT INTO bala  (UID, NAME, DOB, EMAIL) "
              + "VALUES (3,'meena','1996-11-05','meenasri@gmail.com')";
          stmt.executeUpdate(record3);

      System.out.println("Records inserted");

    } catch (SQLException e) {
      e.printStackTrace();
    } finally {
      try {
        // Close connection
        if (stmt != null) {
          stmt.close();
        }
        if (conn != null) {
          conn.close();
        }
      } catch (Exception e) {
        e.printStackTrace();
      }
    }
  }
}