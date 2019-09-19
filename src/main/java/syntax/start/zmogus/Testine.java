package syntax.start.zmogus;

import sun.security.krb5.internal.crypto.Des;

import java.util.*;

public class Testine {
  public static void main(String[] args) {
    List<Asmuo> asmenys = new ArrayList<>();

    Studentas studentas = new Studentas("Paulius", 18);
    Destytojas destytojas = new Destytojas("Darius", 25);

    asmenys.add(destytojas);
    asmenys.add(studentas);

    destytojas.valgyti();

    for (Asmuo asmuo : asmenys) {
      System.out.println(asmuo);
    }

  }
}
