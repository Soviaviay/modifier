package duadimensi;

public class Belahketupat {
    Double diagonal1;
    Double diagonal2;
    final Double seperdua = 0.5;


    public Belahketupat(Double d1, Double d2) {
        this.diagonal1 = d1;
        this.diagonal2 = d2;
    }

    public Double luas() {
        return  seperdua * diagonal1 * diagonal2;
    }
}
//L= 0,5 X d1 X d2