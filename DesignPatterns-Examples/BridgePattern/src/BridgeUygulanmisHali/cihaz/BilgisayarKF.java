package BridgeUygulanmisHali.cihaz;
import BridgeUygulanmisHali.Muzik;
import BridgeUygulanmisHali.muzikcalar.MuzikCalar;
import BridgeUygulanmisHali.muzikcalar.Fizy;
import BridgeUygulanmisHali.sescihazi.Kulaklik;

public class BilgisayarKF extends MuzikCalabilenBilgisayar{
    public BilgisayarKF(){
        sesCihazi = new Kulaklik();
        muzikCalar = new Fizy();
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("bilgisayar çalıstı");
        super.muzikCal(muzik);
    }
}
