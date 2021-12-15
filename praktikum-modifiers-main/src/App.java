import duadimensi.Belahketupat;
import duadimensi.Jajargenjang;
import tigadimensi.Kerucut;
import tigadimensi.Balok;
public class App {
    public static void main(String[] args) throws Exception {
        Belahketupat dimensi2 = new Belahketupat(4.0, 5.0);
        System.out.println("Luas Belahketupat = " + dimensi2.luas());
        Jajargenjang dimensiii = new Jajargenjang(4.0, 5.0);
        System.out.println("Luas Jajargenjang = " + dimensiii.luas());
        Kerucut dimens3 = new Kerucut(4.0, 5.0);
        System.out.println("Volume Kerucut = " + dimens3.volume());
        Balok dimensi3 = new Balok(4.0, 5.0, 6.0);
        System.out.println("Volume Balok = " + dimensi3.volume());
    }
}