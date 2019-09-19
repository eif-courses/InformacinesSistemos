package syntax.start;

import syntax.start.Tranzakcijos;

public abstract class Bankomatas implements Tranzakcijos {

  public int i = 100;
  @Override
  public void info(){
    System.out.println("Pagrindines klases info");
  }
  @Override
  public void add(){
    System.out.println("add method");
  }
  protected abstract void id();
}
