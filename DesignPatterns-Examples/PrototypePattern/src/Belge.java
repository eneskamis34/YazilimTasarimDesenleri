public class Belge implements Cloneable {

    private Long id;
    private String adi;
    private BelgeTuru belgeTuru;
    private Kategori kategori;
    private String veri;

    public Belge() {
    }

    public Belge(Long id, String adi, BelgeTuru belgeTuru, Kategori kategori, String veri) {
        this.id = id;
        this.adi = adi;
        this.belgeTuru = belgeTuru;
        this.kategori = kategori;
        this.veri = veri;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdi() {
        return adi;
    }

    public void setAdi(String adi) {
        this.adi = adi;
    }

    public BelgeTuru getBelgeTuru() {
        return belgeTuru;
    }

    public void setBelgeTuru(BelgeTuru belgeTuru) {
        this.belgeTuru = belgeTuru;
    }

    public Kategori getKategori() {
        return kategori;
    }

    public void setKategori(Kategori kategori) {
        this.kategori = kategori;
    }

    public String getVeri() {
        return veri;
    }

    public void setVeri(String veri) {
        this.veri = veri;
    }

    @Override
    public String toString() {
        return "Belge{" +
                "id=" + id +
                ", \nadi='" + adi + '\'' +
                ", \nbelgeTuru=" + belgeTuru +
                ", \nkategori=" + kategori +
                ", \nveri='" + veri + '\'' +
                '}';
    }
    /* shallow copy*/
 //   @Override
//    protected Belge clone() throws CloneNotSupportedException {
//        return (Belge) super.clone();//   }



    /*Deep copy*/
    protected Belge clone() throws CloneNotSupportedException {
        Belge belge = (Belge) super.clone();
        BelgeTuru belgeTuru = (BelgeTuru) getBelgeTuru().clone();
        Kategori kategori = belge.getKategori().clone();

        belge.setBelgeTuru(belgeTuru);
        belge.setKategori(kategori);
        return belge;
    }
}
