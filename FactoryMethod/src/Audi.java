public class Audi extends Araba{

    public Audi()
    {
        maksHiz = 220;
        anlikHiz = 0;
    }

    @Override
    public int MaksHiz()
    {
        return maksHiz;
    }

    @Override
    public String marka()
    {
        return "Auid";
    }

    @Override
    public void hiziBelirle(int surat)
    {
        anlikHiz = surat;
    }
}
