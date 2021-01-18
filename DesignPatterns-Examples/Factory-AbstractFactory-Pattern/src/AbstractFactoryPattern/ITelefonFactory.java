package AbstractFactoryPattern;

public interface ITelefonFactory {
    ITelefon getTelefon(String marka, String model, int batarya, int fiyat);
}
