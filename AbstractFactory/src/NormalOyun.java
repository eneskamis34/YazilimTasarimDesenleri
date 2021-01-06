import java.util.ArrayList;

public class NormalOyun extends SoyutOyun {

    ArrayList<SoyutOda> odalar;

    public NormalOyun()
    {
        odalar = new ArrayList<SoyutOda>();
    }
    @Override
    public void odaEkle(SoyutOda oda) {
        odalar.add(oda);
    }

    @Override
    public void oyunCalistir() {
        System.out.println("Normal Oyun Çalışıyor");
        System.out.println("Oda Sayısı: "+odalar.size());
    }
}
