public class Priz {

    public void elektrikVer(IElektrikliEvAletleri elektrikliEvAletleri)
    {
        int volt = elektrikliEvAletleri.prizeTakveCalistir();
        System.out.println("Prizden "+ volt + " volt elektrik alınıyor.");
    }
}
