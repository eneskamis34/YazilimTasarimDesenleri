package AbstractFactoryPattern;

public class Iphone12 implements ITelefon {

    private String model;
    private String marka;
    private int batarya;
    private int fiyat;

    public Iphone12(String model, String marka, int batarya, int fiyat) {
        this.model = model;
        this.marka = marka;
        this.batarya = batarya;
        this.fiyat = fiyat;
    }

    @Override
    public String getMarka() {
        return marka;
    }

    @Override
    public String getModel() {
        return model;
    }

    @Override
    public int getBatarya() {
        return batarya;
    }

    @Override
    public int getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return "Bu bir Iphone 12 Modelidir.";
    }
}
