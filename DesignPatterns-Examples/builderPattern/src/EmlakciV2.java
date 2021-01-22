public class EmlakciV2 {
    public static void main(String[] args) {

        Ev ev1 = EvBuilder.startNormalBuilder("istanbul","esenler",2)
                .setMahalle("fatih")
                .setOdaSayisi(3)
                .setTuvaletSayisi(1)
                .setDublex(false)
                .setHavuz(false)
                .build();

        printEv(ev1);

        Ev ev2 = EvBuilder.startHavuzluBuilder("istanbul","ortaköy",1).build();
        printEv(ev2);
    }
    public static void printEv(Ev ev)
    {
        System.out.println();

        System.out.println("Ev Eklendi => "+ev);

        System.out.println();

    }
}
