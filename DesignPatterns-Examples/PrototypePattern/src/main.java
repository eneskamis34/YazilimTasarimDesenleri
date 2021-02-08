import java.util.Date;

public class main {
    public static void main(String[] args) {
        GenelEntityService genelEntityService = new GenelEntityService();

        long id1 = 1L;
        long id2 = 2L;

        Date ilkTarih =new Date();
        Belge belge1 = genelEntityService.findBelgeById(id1);
        Date sonTarih = belgeyiveSaniyeFarkiniYazdir(ilkTarih, belge1);

  /*      Date ilkTarih2 =new Date();
        Belge belge2 = genelEntityService.findBelgeById(id2);
        Date sonTarih2 = belgeyiveSaniyeFarkiniYazdir(ilkTarih, belge2);*/

        Date ilkTarih3 = new Date();
        Belge belgeClone = null;
        try {
            belgeClone = belge1.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        belgeClone.setAdi("Clone");
        belgeClone.setVeri("Clone Veri");
        belgeClone.getBelgeTuru().setAdi("Clone 2");
        belgeyiveSaniyeFarkiniYazdir(ilkTarih3,belgeClone);

        System.out.println(belge1);
    }

    private static Date belgeyiveSaniyeFarkiniYazdir(Date ilkTarih, Belge belge1) {
        Date sonTarih = new Date();
        Long saniyeFarki = getSaniyeFarki(ilkTarih, sonTarih);
        System.out.println(belge1);
        System.out.println(saniyeFarki);
        return sonTarih;
    }

    private static Long getSaniyeFarki(Date ilkTarih, Date sonTarih) {
        long hassasiyet = 1000;
        long saniyeFarki =(sonTarih.getTime() /hassasiyet) - (ilkTarih.getTime()/hassasiyet);
        return saniyeFarki;
    }
}
