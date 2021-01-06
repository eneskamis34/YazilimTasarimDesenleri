public class OncekiKanal implements Command {

    private Televizyon tv;

    public OncekiKanal(Televizyon tv)
    {
        this.tv = tv;
    }

    public void Execute()
    {
        tv.birOncekiKanal();
        System.out.println("Geçerli kanal: "+tv.gecerliKanal());
    }

    public String toString()
    {
        return "Önceki Kanal";
    }
}
