//import java.sql.Connection;
//import java.sql.DriverManager;
//import java.sql.PreparedStatement;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.sql.Statement;
import java.sql.*;

public class Where {

	  public static void main(String[] args) throws SQLException {
	    String jdbcUrl = "jdbc:mysql://localhost:3306/bala";
	    String username = "root";
	    String password = "mini";
//	    String sql = "delete from bala where UID=1";

	    String query = "SELECT UID, NAME FROM bala WHERE UID=2;"
                + "SELECT UID, NAME FROM bala WHERE UID=3;";
//               + "SELECT Id, Name FROM bala WHERE Id=3";

        try (Connection con = DriverManager.getConnection(jdbcUrl, username, password);
                PreparedStatement pst = con.prepareStatement(query);) {

            boolean isResult = pst.execute();

            do {
                try (ResultSet rs = pst.getResultSet()) {

                    while (rs.next()) {

                        System.out.print(rs.getInt(1));
                        System.out.print(": ");
                        System.out.println(rs.getString(2));
                    }

                    isResult = pst.getMoreResults();
                }

            } while (isResult);
        }
    }
}