public class Ev {

    private String il;
    private String ilce;
    private String mahalle;

    private int odaSayisi;
    private int tuvaletSayisi;
    private int katNo;

    private boolean isDublex;
    private boolean isHavuz;

    public Ev(){}

    public Ev(String il, String ilce, String mahalle, int odaSayisi, int tuvaletSayisi, int katNo, boolean isDublex, boolean isHavuz) {
        this.il = il;
        this.ilce = ilce;
        this.mahalle = mahalle;
        this.odaSayisi = odaSayisi;
        this.tuvaletSayisi = tuvaletSayisi;
        this.katNo = katNo;
        this.isDublex = isDublex;
        this.isHavuz = isHavuz;
    }

    public String getIl() {
        return il;
    }

    public void setIl(String il) {
        this.il = il;
    }

    public String getIlce() {
        return ilce;
    }

    public void setIlce(String ilce) {
        this.ilce = ilce;
    }

    public String getMahalle() {
        return mahalle;
    }

    public void setMahalle(String mahalle) {
        this.mahalle = mahalle;
    }

    public int getOdaSayisi() {
        return odaSayisi;
    }

    public void setOdaSayisi(int odaSayisi) {
        this.odaSayisi = odaSayisi;
    }

    public int getTuvaletSayisi() {
        return tuvaletSayisi;
    }

    public void setTuvaletSayisi(int tuvaletSayisi) {
        this.tuvaletSayisi = tuvaletSayisi;
    }

    public int getKatNo() {
        return katNo;
    }

    public void setKatNo(int katNo) {
        this.katNo = katNo;
    }

    public boolean isDublex() {
        return isDublex;
    }

    public void setDublex(boolean dublex) {
        isDublex = dublex;
    }

    public boolean isHavuz() {
        return isHavuz;
    }

    public void setHavuz(boolean havuz) {
        isHavuz = havuz;
    }

    @Override
    public String toString() {
        return "Ev{" +
                "il='" + il + '\'' +
                ", ilce='" + ilce + '\'' +
                ", mahalle='" + mahalle + '\'' +
                ", odaSayisi=" + odaSayisi +
                ", tuvaletSayisi=" + tuvaletSayisi +
                ", katNo=" + katNo +
                ", isDublex=" + isDublex +
                ", isHavuz=" + isHavuz +
                '}';
    }
}
