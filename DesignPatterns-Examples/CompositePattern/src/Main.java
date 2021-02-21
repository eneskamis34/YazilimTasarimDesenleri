import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {
        Urun domates = new Urun("Domates", BigDecimal.TEN);
        Urun patates = new Urun("Patates", BigDecimal.TEN);
        Urun sogan = new Urun("Soğan", BigDecimal.ONE);

        Paket sebzePaketi = new Paket("Sebze Paketi");
        sebzePaketi.getUrunList().add(domates);
        sebzePaketi.getUrunList().add(sogan);
        sebzePaketi.getUrunList().add(patates);

        Urun sesSistemi = new Urun("Ses Sitemi", BigDecimal.valueOf(5000));
        Urun kulaklik = new Urun("Kulaklik",BigDecimal.valueOf(1000));

        Paket teknolojiPaketi = new Paket("Teknoloji Paketi");
        teknolojiPaketi.getUrunList().add(sesSistemi);
        teknolojiPaketi.getUrunList().add(kulaklik);

        Urun futbolTopu = new Urun("Futbol Topu", BigDecimal.TEN);
        Urun yag = new Urun("Yağ", BigDecimal.ONE);

        Kumanya kumanya = new Kumanya("Ramazan Kumanyası");
        kumanya.getUrunList().add(yag);
        kumanya.getPaketList().add(sebzePaketi);

        Sepet sepet = new Sepet("Sepet");
        sepet.getFiyatlanabilirList().add(futbolTopu);
        sepet.getFiyatlanabilirList().add(teknolojiPaketi);
        sepet.getFiyatlanabilirList().add(sebzePaketi);
        sepet.getFiyatlanabilirList().add(kumanya);

        BigDecimal toplamOdenecekTutar = sepet.toplamOdenecekTutar();

        System.out.println(toplamOdenecekTutar);

    }
}
