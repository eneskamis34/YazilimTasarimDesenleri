public class main {
    public static void main(String[] args) {
        Priz priz = new Priz();
        Utu utu = new Utu();
        Buzdolabi buzdolabi = new Buzdolabi();

        priz.elektrikVer(utu);
        priz.elektrikVer(buzdolabi);

        NokiaTelefon nokiaTelefon = new NokiaTelefon();
        TelefonEEAAdapter adapter = new TelefonEEAAdapter(nokiaTelefon);
        priz.elektrikVer(adapter);
    }
}
