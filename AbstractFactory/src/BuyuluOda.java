public class BuyuluOda extends SoyutOda {

    SoyutKapi kapi;

    @Override
    public void kapiEkle(SoyutKapi kapi) {
        this.kapi = kapi;
    }

    @Override
    public boolean kapiAc() {
        return kapi.kapiAc();
    }
}
