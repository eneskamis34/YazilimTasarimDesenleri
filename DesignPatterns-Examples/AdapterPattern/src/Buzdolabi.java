public class Buzdolabi implements IElektrikliEvAletleri {

    private int volt;
    public Buzdolabi(){
        this.volt = 220;
    }
    @Override
    public int prizeTakveCalistir() {
        System.out.println("Buzdolabi Çalışıyor.");
        return volt;
    }
}
