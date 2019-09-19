package syntax.start.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {
 public static Connection init() {
    String host = "jdbc:mysql://localhost:3306/test";
    String user = "root";
    String password = "";
   try {
     return DriverManager.getConnection(host, user, password);
   } catch (SQLException e) {
     e.printStackTrace();
   }
   return null;
 }
}
