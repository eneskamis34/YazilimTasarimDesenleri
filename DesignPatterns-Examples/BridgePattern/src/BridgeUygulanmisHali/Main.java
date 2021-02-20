package BridgeUygulanmisHali;

import BridgeUygulanmisHali.cihaz.BilgisayarKF;
import BridgeUygulanmisHali.cihaz.Telefon;
import BridgeUygulanmisHali.muzikcalar.Fizy;
import BridgeUygulanmisHali.muzikcalar.Spotify;
import BridgeUygulanmisHali.sescihazi.Kulaklik;

public class Main {
    public static void main(String[] args) {

        Muzik muzik = new Muzik("Tarkan","inci tanem");
        BilgisayarKF bilgisayarKF = new BilgisayarKF();
        bilgisayarKF.muzikCal(muzik);
        System.out.println("*********");

        Telefon telefon = new Telefon(new Kulaklik(),new Fizy());
        telefon.muzikCal(muzik);

        Telefon telefon1 = new Telefon(new Kulaklik(), new Spotify());
        telefon1.muzikCal(muzik);
    }
}
