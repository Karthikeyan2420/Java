import java.sql.*;

public class javasql1 {
    public static void main(String[] args) {
        Connection con = null;
        Statement stmt = null;
        try {
            Class.forName("oracle.jdbc.driver.OracleDriver");
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
            System.out.println("Connection established: " + con);

            String createTableSQL = "CREATE TABLE t3 id NUMBER PRIMARY KEY, name VARCHAR2(100))";
            stmt = con.createStatement();
            stmt.execute(createTableSQL);
            
            System.out.println("Table t1 created successfully.");

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Oracle JDBC Driver not found.");
            e.printStackTrace();

        }
    }
}
