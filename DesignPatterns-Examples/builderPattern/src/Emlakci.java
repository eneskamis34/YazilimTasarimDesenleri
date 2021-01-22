public class Emlakci {
    public static void main(String[] args) {

        Ev ev1 = new Ev();
        printEv(ev1);

        Ev ev2 = new Ev("İstanbul","Esenler","Fatih",4,1,3,false,false);
        printEv(ev2);

        Ev ev3 = new Ev();
        ev3.setIl("Ankara");
        ev3.setIlce("Mamak");
        printEv(ev3);

    }
    public static void printEv(Ev ev)
    {
        System.out.println();

        System.out.println("Ev Eklendi => "+ev);

        System.out.println();

    }
}
