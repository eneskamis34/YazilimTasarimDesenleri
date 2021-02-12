public class Utu implements IElektrikliEvAletleri {
    private int volt;

    public Utu(){
        this.volt = 220;
    }
    @Override
    public int prizeTakveCalistir() {
        System.out.println("ütü çalısıyor.");
        return volt;
    }
}
