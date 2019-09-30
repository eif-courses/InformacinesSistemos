package syntax.start.darbassukonsole;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class Zmogus{
  private int id;

  public Zmogus(int id) {
    this.id = id;
  }
}
public class Main {

  public static void displayEnteredValues(int n){

    Scanner input = new Scanner(System.in);

    List<Integer> list = new ArrayList<>();

    for (int i = 0; i < n; i++) {
      System.out.println("IVESKITE ID:");
      int ivedimas = input.nextInt();
      list.add(ivedimas);
    }
    for(Integer elem: list){
      System.out.println("elementas:"+elem);
    }
  }


  public static void main(String[] args) {

    displayEnteredValues(3);

  }





}
