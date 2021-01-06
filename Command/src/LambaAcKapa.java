public class LambaAcKapa implements Command {
    Lamba lamba;

    public LambaAcKapa(Lamba lamba)
    {
        this.lamba = lamba;
    }

    public void Execute()
    {
        if(lamba.lambaDegeri() == 1)
        {
            lamba.lambaKapat();
        }
        else
        {
            lamba.lambaAc();
        }
    }

    public String toString()
    {
        if(lamba.lambaDegeri() == 1)
        {
            return "Lambayı Kapat";
        }
        else
        {
            return "Lambayı Aç";
        }
    }
}
