package AbstractFactoryPattern;

public class Iphone12Factory implements ITelefonFactory {
    @Override
    public ITelefon getTelefon(String marka, String model, int batarya, int fiyat) {
        return new Iphone12(marka,model,batarya,fiyat);
    }
}
