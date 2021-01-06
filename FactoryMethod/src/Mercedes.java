public class Mercedes extends Araba {

    public Mercedes()
    {
        maksHiz = 200;
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
        return "Mercedes";
    }

    @Override
    public void hiziBelirle(int surat)
    {
        anlikHiz = surat;
    }
}
