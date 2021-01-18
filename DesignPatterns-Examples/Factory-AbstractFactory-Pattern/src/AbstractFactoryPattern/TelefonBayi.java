package AbstractFactoryPattern;

public class TelefonBayi {
    public static void main(String[] args) {

        Iphone12Factory iphone12Factory = new Iphone12Factory();
        ITelefon iphone12 = iphone12Factory.getTelefon("Iphone","Iphone12",3300,7700);
        System.out.println(iphone12);

        S8Factory s8Factory = new S8Factory();
        ITelefon s8 = s8Factory.getTelefon("Samsung","s8",4000,5000);

    }
}
