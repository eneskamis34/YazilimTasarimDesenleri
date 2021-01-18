public class TelefonFabrikasi {

    public static ITelefon getTelefon(String marka, String model, int batarya, int fiyat){

        ITelefon telefon;

        if("S8".equalsIgnoreCase(model))
        {
            telefon = new S8("Samsung","S8",4000,5500);
        }
        else if("Iphone12".equalsIgnoreCase(model))
        {
            telefon = new Iphone12("Apple","Iphone12",3300,7000);
        }
        else
        {
            throw new RuntimeException("Geçersiz Model");
        }
        return telefon;
    }
}
