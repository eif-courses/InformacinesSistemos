package syntax.start.bankas;

import syntax.start.Bankomatas;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class Swedbank extends Bankomatas {

  public int i = 5000000;

  @Override
  protected void id() {

  }
//  @Override
//  public void info(){
//    super.info();
//    System.out.println("SWEDBANK INFO");
//  }


  public static KlientasSwedbank getClient(){
    return new KlientasSwedbank();
  }
  @Override
  public void remove() {

  }
}
