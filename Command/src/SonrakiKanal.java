public class SonrakiKanal implements Command {
    private Televizyon tv;

    public SonrakiKanal(Televizyon tv)
    {
        this.tv = tv;
    }

    public void Execute()
    {
        tv.birSonrakiKanal();
        System.out.println("Geçerli kanal: "+tv.gecerliKanal());
    }

    public String toString()
    {
        return "Sonraki Kanal";
    }
}
