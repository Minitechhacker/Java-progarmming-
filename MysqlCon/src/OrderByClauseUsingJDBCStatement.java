import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
 
public class OrderByClauseUsingJDBCStatement {
 
    public static void main(String[] args) {
 
        // variables
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet = null;
 
        // Step 1: Loading or registering MySQL JDBC driver class
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//        }
//        catch(ClassNotFoundException cnfex) {
//            System.out.println("Problem in loading MySQL JDBC driver");
//            cnfex.printStackTrace();
//        }
 
        // Step 2: Opening database connection
        try {
 
            // Step 2.A: Create and get connection using DriverManager
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/bala","root","mini"); 
 
            // Step 2.B: Creating JDBC Statement 
            statement = connection.createStatement();
 
            // to get all players with more than 130 matches in desc
            String sqlSelectQuery = "SELECT * FROM bala"
                  
                    + " ORDER BY NAME DESC ";
 
            // Step 2.C: Executing SQL & retrieve data into ResultSet
            resultSet = statement.executeQuery(sqlSelectQuery);
 
            System.out.println("UID\tNAME\t\t\tDOB\tEMAIL");
            System.out.println("==\t================\t===\t=======");
 
            // processing returned data and printing into console
            while(resultSet.next()) {
                System.out.println(resultSet.getInt(1) + "\t" + 
                        resultSet.getString(2) + "\t" + 
                        resultSet.getDate(3) + "\t" +
                        resultSet.getString(4));
            }
        }
        catch(SQLException sqlex){
            sqlex.printStackTrace();
        }
        finally {
            // Step 3: Closing database connection
            try {
                if(null != connection) {
                    // cleanup resources, once after processing
                    statement.close();
 
                    // and then finally close connection
                    connection.close();
                }
            }
            catch (SQLException sqlex) {
                sqlex.printStackTrace();
            }
        }
    }
}