package tigadimensi;

import duadimensi.PersegiPanjang;

public class Balok extends PersegiPanjang{

    Double tinggi;

    public Balok(Double panjang, Double lebar, Double tinggi){
        super(panjang,lebar);
        this.tinggi = tinggi;
    }
    
    public Double volume(){
        return super.luas() * tinggi;
    }
}