public class TelefonEEAAdapter implements IElektrikliEvAletleri {
    private Telefon telefon;

    public TelefonEEAAdapter(Telefon telefon)
    {
        this.telefon = telefon;
    }
    @Override
    public int prizeTakveCalistir() {
        return telefon.sarjEt();
    }
}
