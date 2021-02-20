package BridgeUygulanmisHali.cihaz;

import BridgeUygulanmisHali.Muzik;
import BridgeUygulanmisHali.muzikcalar.MuzikCalar;
import BridgeUygulanmisHali.sescihazi.SesCihazi;

public class Telefon extends MuzikCalabilenBilgisayar {
    public Telefon(SesCihazi sesCihazi, MuzikCalar muzikCalar) {

        super(sesCihazi, muzikCalar);
    }

    @Override
    public void muzikCal(Muzik muzik) {
        System.out.println("Telefon muzik çalıyor");
        super.muzikCal(muzik);
    }
}
