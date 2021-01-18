public class TelefonBayi {
    public static void main(String[] args) {
        ITelefon s8 = TelefonFabrikasi.getTelefon("Samsung","S8",232,3432);
        System.out.println(s8.toString());

        /*
        Factory Design dezavantajlarından birisi: TelefonFabrikasi kısmında birçok model gelirse her model için
        bir if else kontrolü yapılacak olmasıdır. Bu yüzden bu kısmı çözmek için Abstract Factory Design yapılmalıdır.
         */
    }
}

