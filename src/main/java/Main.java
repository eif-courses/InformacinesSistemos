import syntax.start.Bankomatas;
import syntax.start.bankas.KlientasSwedbank;
import syntax.start.bankas.Seb;
import syntax.start.bankas.Swedbank;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;


class ProcesasPirmas extends Thread{
  @Override
  public void run() {
    System.out.println("Pirmas procesas");
  }
}
class ProcesasAntras extends Bankomatas implements Runnable{

  @Override
  protected void id() {

  }

  @Override
  public void remove() {

  }

  @Override
  public void run() {
    System.out.println("PROCESAS 2 paleistas");
  }
}




public class Main {

  public static final int PARUOSTAS = 3;
  public static void main(String[] args) {
    //Map m =


    Vector<Bankomatas> vector = new Vector<>();
    vector.add(new Swedbank());

     Bankomatas bank = new KlientasSwedbank();
     bank.info();
    ///System.out.println(bank.i);




    List<Bankomatas> list = new ArrayList<>();
    list.add(new Swedbank());
    list.add(new Seb());
    list.addAll(vector);

    for (Bankomatas bankomatas : list) {
      System.out.println(bankomatas);
    }



//    ProcesasPirmas procesasPirmas = new ProcesasPirmas();
//    procesasPirmas.start();
//
//    Thread th = new Thread(new ProcesasAntras());
//    th.start();

    //System.out.println(th.getName()+" "+ procesasPirmas.getName());



  }
}
