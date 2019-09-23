package syntax.start.statinis;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

  public static void translate(String zodis){
    Map<String, String> zodynas = new HashMap<>();
    zodynas.put("dog", "suo");
    zodynas.put("cat", "kate");
    zodynas.put("computer", "Kompiuteris");

    if(zodynas.get(zodis) != null) {
      System.out.println(zodynas.get(zodis));
    }else {
      System.out.println("Atsiprasome toks zoodis neegzistuoja:");

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      String name = null;
      try {
        System.out.println("IVESKITE Paaiskinima: ");
        name = reader.readLine();
        zodynas.put(zodis, name);
        System.out.println("Jusu naujas zodis bus pridetas i zodyna");
      } catch (IOException e) {
        e.printStackTrace();
      }


      for (String s : zodynas.keySet()) {
        System.out.println(s);
      }


    }
  }






  public static void main(String[] args) {




    List<Stalas> stalai = new ArrayList<>();
    Stalas ikea = new Stalas("Ikea virtuvinis");
    stalai.add(ikea);
    stalai.add(new Stalas("Kolegijos stalas"));


    List<Integer> fiksuotas = Arrays.asList(10,20, 30, 90, 50, 90, 50, 10);

    Set<Integer> aibe = new HashSet<>();



    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String name = null;
    try {
      System.out.println("IVESKITE ZODI: ");
      name = reader.readLine();

      translate(name);

      //System.out.println(name);
    } catch (IOException e) {
      e.printStackTrace();
    }



    //System.out.println("ZODZIO REIKSME: "+zodynas.get("cat"));






    aibe.add(50);
    aibe.add(50);
    aibe.add(50);
    aibe.addAll(fiksuotas);

    for (Integer integer : aibe) {
      System.out.println(integer);
    }


//    for (Stalas stalas : stalai) {
//      System.out.println(stalas.getVardas());
//    }








  }
}
