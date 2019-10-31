package syntax.start.db;

import java.util.Date;
import java.util.List;

public class Main {
  public static void main(String[] args) {
    //Data.display();
    //Data.insert("Gorila");
    //Data.display();
    uzpildytiLentele(2);

  }
  public static void uzpildytiLentele(int stulpeliu_sk){
    Object [] row = new Object[stulpeliu_sk];

    List<Object> list =  Data.gautiDuomenisISDB(stulpeliu_sk);

    int count = 0;
    for (int i = 0; i < list.size(); i++) {
      if(count < row.length){
        row[count] = list.get(i);
        System.out.print(list.get(i));
        count++;
      }
      else{
        count = 0;
        System.out.println("");
      }

    }

  }


}
