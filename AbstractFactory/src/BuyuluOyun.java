import java.util.ArrayList;

public class BuyuluOyun extends SoyutOyun {

    ArrayList<SoyutOda> odalar;

    public BuyuluOyun()
    {
        odalar = new ArrayList<SoyutOda>();
    }

    @Override
    public void odaEkle(SoyutOda oda) {
        odalar.add(oda);
    }

    @Override
    public void oyunCalistir() {
        System.out.println("Büyülü oyun çalısıyor.");
        if(odalar.size() > 0)
        {
            if(odalar.get(0).kapiAc())
            {
                System.out.println("Kapi açıldı");
            }
            else
            {
                System.out.println("Kapı açilmadı.");
            }
        }
    }
}
