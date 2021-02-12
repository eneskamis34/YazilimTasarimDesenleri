public class NokiaTelefon implements Telefon {

    private int volt;

    public NokiaTelefon()
    {
        this.volt = 5;
    }
    @Override
    public int sarjEt() {
        System.out.println("Telefon Şarj Ediliyor.");
        return volt;
    }
}
