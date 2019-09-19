package syntax.start.zmogus;

import java.util.*;

public class Destytojas extends Asmuo implements Isgyvenimas{
  @Override
  public Issilavinimas issilavinimas() {
    return Issilavinimas.AUKSTASIS;
  }
  public Destytojas(String vardas, int amzius) {
    super(vardas, amzius);
  }

  @Override
  public void valgyti() {
    List<Isgyvenimas> list = new ArrayList<>();
    list.add(this);
    list.get(0).miegoti();
  }

  @Override
  public void miegoti() {

  }
}
