package jdbcprojects;

import java.sql.*;
import java.util.Scanner;

public class JavaSqlProject {
    private static Connection con = null;
    private static Statement stmt = null;
    private static PreparedStatement pstmt = null;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            // Load Oracle JDBC Driver
            Class.forName("oracle.jdbc.driver.OracleDriver");
            // Establish the connection
            con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "system", "oracle");
            System.out.println("Connection established: " + con);

            while (true) {
                System.out.println("Choose an operation:");
                System.out.println("1. Create Table");
                System.out.println("2. Insert Data");
                System.out.println("3. Update Data");
                System.out.println("4. Delete Data");
                System.out.println("5. Alter Table");
                System.out.println("6. Truncate Table");
                System.out.println("7. Drop Table");
                System.out.println("8. Exit");
                System.out.println("Enter the option You want .............. ?");
                int choice = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                switch (choice) {
                    case 1:
                        createTable(scanner);
                        break;
                    case 2:
                        insertData(scanner);
                        break;
                    case 3:
                        updateData(scanner);
                        break;
                    case 4:
                        deleteData(scanner);
                        break;
                    case 5:
                        alterTable(scanner);
                        break;
                    case 6:
                        truncateTable(scanner);
                        break;
                    case 7:
                        dropTable(scanner);
                        break;
                    case 8:
                        System.out.println("Exiting program...");
                        return;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                }
            }

        } catch (ClassNotFoundException | SQLException e) {
            System.err.println("Error: " + e.getMessage());
            e.printStackTrace();
        } finally {
            // Close the resources
            try {
                if (stmt != null) stmt.close();
                if (pstmt != null) pstmt.close();
                if (con != null) con.close();
                scanner.close();
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    private static void createTable(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();
            System.out.println("Enter number of columns:");
            int columnCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            StringBuilder createTableSQL = new StringBuilder("CREATE TABLE " + tableName + " (");
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Enter column " + i + " name:");
                String columnName = scanner.nextLine();
                System.out.println("Enter column " + i + " data type (1 for VARCHAR, 2 for NUMBER):");
                int dataType = scanner.nextInt();
                scanner.nextLine(); // Consume newline

                createTableSQL.append(columnName);
                if (dataType == 1) {
                    createTableSQL.append(" VARCHAR2(100)");
                } else if (dataType == 2) {
                    createTableSQL.append(" NUMBER");
                } else {
                    System.out.println("Invalid data type. Aborting table creation.");
                    return;
                }
                if (i < columnCount) {
                    createTableSQL.append(", ");
                }
            }
            createTableSQL.append(")");

            stmt = con.createStatement();
            stmt.execute(createTableSQL.toString());
            System.out.println("Table " + tableName + " created successfully.");
        } catch (SQLException e) {
            System.err.println("Error creating table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void insertData(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();
            System.out.println("Enter number of columns:");
            int columnCount = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            StringBuilder insertSQL = new StringBuilder("INSERT INTO " + tableName + " (");
            StringBuilder valuesSQL = new StringBuilder("VALUES (");
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Enter column " + i + " name:");
                String columnName = scanner.nextLine();
                insertSQL.append(columnName);
                valuesSQL.append("?");
                if (i < columnCount) {
                    insertSQL.append(", ");
                    valuesSQL.append(", ");
                }
            }
            insertSQL.append(") ").append(valuesSQL).append(")");

            pstmt = con.prepareStatement(insertSQL.toString());
            for (int i = 1; i <= columnCount; i++) {
                System.out.println("Enter value for column " + i + ":");
                String value = scanner.nextLine();
                pstmt.setString(i, value);
            }
            pstmt.executeUpdate();
            System.out.println("Data inserted successfully.");
        } catch (SQLException e) {
            System.err.println("Error inserting data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void updateData(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();
            System.out.println("Enter column to update:");
            String updateColumn = scanner.nextLine();
            System.out.println("Enter new value:");
            String newValue = scanner.nextLine();
            System.out.println("Enter condition column:");
            String conditionColumn = scanner.nextLine();
            System.out.println("Enter condition value:");
            String conditionValue = scanner.nextLine();

            String updateSQL = "UPDATE " + tableName + " SET " + updateColumn + " = ? WHERE " + conditionColumn + " = ?";
            pstmt = con.prepareStatement(updateSQL);
            pstmt.setString(1, newValue);
            pstmt.setString(2, conditionValue);
            pstmt.executeUpdate();
            System.out.println("Data updated successfully.");
        } catch (SQLException e) {
            System.err.println("Error updating data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void deleteData(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();
            System.out.println("Enter condition column:");
            String conditionColumn = scanner.nextLine();
            System.out.println("Enter condition value:");
            String conditionValue = scanner.nextLine();

            String deleteSQL = "DELETE FROM " + tableName + " WHERE " + conditionColumn + " = ?";
            pstmt = con.prepareStatement(deleteSQL);
            pstmt.setString(1, conditionValue);
            pstmt.executeUpdate();
            System.out.println("Data deleted successfully.");
        } catch (SQLException e) {
            System.err.println("Error deleting data: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void alterTable(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();
            System.out.println("Enter column name to add:");
            String columnName = scanner.nextLine();
            System.out.println("Enter column data type (1 for VARCHAR, 2 for NUMBER):");
            int dataType = scanner.nextInt();
            scanner.nextLine(); // Consume newline

            String alterTableSQL = "ALTER TABLE " + tableName + " ADD " + columnName;
            if (dataType == 1) {
                alterTableSQL += " VARCHAR2(100)";
            } else if (dataType == 2) {
                alterTableSQL += " NUMBER";
            } else {
                System.out.println("Invalid data type. Aborting alter table.");
                return;
            }

            stmt = con.createStatement();
            stmt.execute(alterTableSQL);
            System.out.println("Table " + tableName + " altered successfully.");
        } catch (SQLException e) {
            System.err.println("Error altering table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void truncateTable(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();

            String truncateTableSQL = "TRUNCATE TABLE " + tableName;
            stmt = con.createStatement();
            stmt.execute(truncateTableSQL);
            System.out.println("Table " + tableName + " truncated successfully.");
        } catch (SQLException e) {
            System.err.println("Error truncating table: " + e.getMessage());
            e.printStackTrace();
        }
    }

    private static void dropTable(Scanner scanner) {
        try {
            System.out.println("Enter table name:");
            String tableName = scanner.nextLine();

            String dropTableSQL = "DROP TABLE " + tableName;
            stmt = con.createStatement();
            stmt.execute(dropTableSQL);
            System.out.println("Table " + tableName + " dropped successfully.");
        } catch (SQLException e) {
            System.err.println("Error dropping table: " + e.getMessage());
            e.printStackTrace();
        }
    }
}

