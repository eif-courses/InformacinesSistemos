package syntax.start.statinis;

public class Baldas {

  private String vardas;

  public Baldas(String vardas) {
    this.vardas = vardas;
  }

  public static int unikalusId(){
    return 55;
  }
  public final void info(){
    System.out.println("baldo info");
  }

  public String getVardas() {
    return vardas;
  }
}
