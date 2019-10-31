package syntax.start.db;

import javax.swing.*;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
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

  public static List<Object> gautiDuomenisISDB(int stupeliu_sk){

    List<Object> list = new ArrayList<>();

    try {
      PreparedStatement stmt = connection.prepareStatement("select * from test.animal");
      ResultSet rs=stmt.executeQuery();

      while(rs.next()){
        for (int i = 1; i <= stupeliu_sk; i++) {
          if(rs.getMetaData().getColumnClassName(i).equals("java.lang.String")) {
            list.add(rs.getString(i));
          }
          else{
            list.add(rs.getInt(i));
          }
        }
      }
    } catch (SQLException e) {
      e.printStackTrace();
    }
    return list;
  }



  @Override
  public void close() throws Exception {
    connection.close();
  }
}
