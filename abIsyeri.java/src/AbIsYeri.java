abstract class Calisan {
  public String pozisyon="Calisan" ;
  public abstract void calis() ;// soyut yordam 
  public void zamIste() { // soyut olmayan yordam
      System.out.println("Calisan zamIste");
  }
}
class Mudur extends Calisan {
  public Mudur () { // yapılandırıcı
      pozisyon = "Mudur" ;
  }
  @Override
  public void calis() { // iptal etme (override)
      System.out.println("Mudur Calisiyor");
  }
}
class Programci extends Calisan {
  public Programci() { // yapılandırıcı
      pozisyon = "Programci" ;
  }
  @Override
  public void calis() { // iptal etme (override)
      System.out.println("Programci Calisiyor");
  }
  @Override
  public void zamIste() { // iptal etme (override)
      System.out.println("Programci Zam Istiyor");
  }
}
class Pazarlamaci extends Calisan {
  public Pazarlamaci() { // yapılandırıcı
      pozisyon = "Pazarlamaci" ;
  }
  public void calis() { // iptal etme (override)
      System.out.println("Pazarlamaci Calisiyor");
  }
}
public class AbIsYeri {
  public static void mesaiBasla(Calisan[] c ) {
      for (int i = 0 ; i < c.length ; i++) {
        c[i].calis(); // !Dikkat!
      }
  }
}