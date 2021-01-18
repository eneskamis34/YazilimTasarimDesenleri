public class TelefonFabrikasi {

    public static ITelefon getTelefon(String marka, String model, int batarya, int fiyat){

        ITelefon telefon;

        if("S8".equalsIgnoreCase(model))
        {
            telefon = new S8(marka,model,batarya,fiyat);
        }
        else if("Iphone12".equalsIgnoreCase(model))
        {
            telefon = new Iphone12(marka,model,batarya,fiyat);
        }
        else
        {
            throw new RuntimeException("Geçersiz Model");
        }
        return telefon;
    }
}
