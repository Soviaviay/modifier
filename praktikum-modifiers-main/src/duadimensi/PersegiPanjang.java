package duadimensi;

public class PersegiPanjang extends Persegi{
    
    Double panjang;

    public PersegiPanjang(Double panjang, Double lebar) {
        super(lebar);
        this.panjang = panjang;
    }

    @Override
    public Double luas(){
        return panjang * lebar;
    }
    
}
