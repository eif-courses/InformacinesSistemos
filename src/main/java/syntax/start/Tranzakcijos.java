package syntax.start;

import java.util.Random;

public interface Tranzakcijos {
  void add();
  void remove();

  default void info(){

  }
  static int transactionID(){
    return new Random().nextInt(788977);
  }
}
