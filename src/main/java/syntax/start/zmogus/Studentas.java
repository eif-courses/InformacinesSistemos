package syntax.start.zmogus;

public class Studentas extends Asmuo implements Isgyvenimas{
  public Studentas(String vardas, int amzius) {
    super(vardas, amzius);
  }
  @Override
  public Issilavinimas issilavinimas() {
    return Issilavinimas.VIDURINIS;
  }
  public void poilsiauti(int trukme){
    System.out.println("Atostogauju"+trukme+"dienas");
  }

  @Override
  public void valgyti() {

  }

  @Override
  public void miegoti() {

  }
}
