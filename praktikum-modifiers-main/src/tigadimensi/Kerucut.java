package tigadimensi;

import duadimensi.Lingkaran;

public class Kerucut extends Lingkaran{
    final Double sepertiga = 0.3;
    Double tinggi;

    public Kerucut(Double jari, Double tinggi) {
        super(jari);
        this.tinggi = tinggi;
    }

    public Double volume() {
        return sepertiga * super.luas() * tinggi;
    }
}
//    1/3 X phi X rXr X t