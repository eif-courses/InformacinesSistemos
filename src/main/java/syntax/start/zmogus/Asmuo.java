package syntax.start.zmogus;

public abstract class Asmuo {
  private String vardas;
  private int amzius;

  public Asmuo(String vardas, int amzius) {
    this.vardas = vardas;
    this.amzius = amzius;
  }

  public abstract Issilavinimas issilavinimas();

  public String getVardas() {
    return vardas;
  }

  public void setVardas(String vardas) {
    this.vardas = vardas;
  }

  public int getAmzius() {
    return amzius;
  }
  public void setAmzius(int amzius) {
    this.amzius = amzius;
  }

  @Override
  public String toString() {
    return "Asmuo{" + "vardas='" + vardas + '\'' + ", amzius=" + amzius + '}';
  }
}
