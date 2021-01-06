public class Main {
    public static void main(String[] args) {
        araba(new AudiFactory());
        araba(new MercedesFactory());
    }
    public static void araba(ArabaFactory factory)
    {
        Araba araba = factory.arabaUret();
        System.out.println(araba.marka() + " markalı araç üretildi.");
    }
}
