public class EvBuilder {

    private String il;
    private String ilce;
    private String mahalle;

    private int odaSayisi;
    private int tuvaletSayisi;
    private int katNo;

    private boolean isDublex;
    private boolean isHavuz;

    public static EvBuilder startNormalBuilder(String il, String ilce, int katNo)

    {
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.katNo = katNo;
        return  evBuilder;
    }
    public static EvBuilder startHavuzluBuilder(String il, String ilce, int katNo)
    {
        EvBuilder evBuilder = new EvBuilder();
        evBuilder.il = il;
        evBuilder.ilce = ilce;
        evBuilder.katNo = katNo;
        evBuilder.isHavuz = true;
        return  evBuilder;
    }


    public Ev build()
    {
        Ev ev = new Ev();
        ev.setIl(il);
        ev.setIlce(ilce);
        ev.setMahalle(mahalle);
        ev.setKatNo(katNo);
        ev.setDublex(isDublex);
        ev.setHavuz(isHavuz);
        ev.setOdaSayisi(odaSayisi);
        ev.setTuvaletSayisi(tuvaletSayisi);

        return ev;

    }


    public EvBuilder setMahalle(String mahalle) {
        this.mahalle = mahalle;
        return this;

    }

    public EvBuilder setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
        return this;

    }

    public EvBuilder setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
        return this;

    }


    public EvBuilder setDublex(boolean dublex) {
        isDublex = dublex;
        return this;

    }

    public EvBuilder setHavuz(boolean havuz) {
        isHavuz = havuz;
        return this;

    }
}
