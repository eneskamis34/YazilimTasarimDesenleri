package AbstractFactoryPattern;

public class S8Factory implements ITelefonFactory {

    @Override
    public ITelefon getTelefon(String marka, String model, int batarya, int fiyat) {
        return new S8(marka,model,batarya,fiyat);
    }
}
