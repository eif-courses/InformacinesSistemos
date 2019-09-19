package syntax.start.db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class Data implements AutoCloseable{

  private static Connection connection = MyConnection.init();

  public static void insert(String name){
    String sql = "insert into test.animal values (?,?)";
    try {
      PreparedStatement preparedStatement = connection.prepareStatement(sql);
      preparedStatement.setInt(1, new Random().nextInt(99999));
      preparedStatement.setString(2, name);
      preparedStatement.executeUpdate();
      System.out.println("Inserted new Record!");
    } catch (SQLException e) {
      JOptionPane.showMessageDialog(null, name+": toks gyvunas jau egzistuoja");
      e.printStackTrace();
    }
  }
  public static void display(){
    try {
      PreparedStatement stmt = connection.prepareStatement("select * from test.animal");
      ResultSet rs=stmt.executeQuery();
      while(rs.next()){
        System.out.println(rs.getInt(1)+" "+rs.getString(2));
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void close() throws Exception {
    connection.close();
  }
}
