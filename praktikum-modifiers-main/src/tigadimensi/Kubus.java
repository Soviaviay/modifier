package tigadimensi;
import duadimensi.Persegi;

public class Kubus extends Persegi{
    
    Kubus(Double sisi){
        super(sisi);
    }

    public Double volume(){
        return super.luas() * lebar;
    }
}
// V = s * s * s