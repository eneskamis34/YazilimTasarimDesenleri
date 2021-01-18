public class S8 implements ITelefon {

    private String model;
    private String marka;
    private int batarya;
    private int fiyat;

    public S8(String marka, String model, int batarya, int fiyat) {
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
        return "Bu bir Samsung S8 Modelidir.";
    }
}
