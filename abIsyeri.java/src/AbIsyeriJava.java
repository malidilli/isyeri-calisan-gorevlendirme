
public class AbIsyeriJava {

 public static void main(String args[]) {
      Calisan[] c = new Calisan[3];
      // c[0] = new Calisan(); // soyut sınıflar  new ile direk  oluşturulamazlar
      c[0] = new Programci(); // yukarı cevirim  (upcasting)
      c[1] = new Pazarlamaci();// yukarı cevirim (upcasting)
      c[2] = new Mudur(); // yukari  cevirim (upcasting)
     mesaiBasla(c);
  }
}
