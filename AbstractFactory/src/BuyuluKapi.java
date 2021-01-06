import java.util.Scanner;

public class BuyuluKapi extends SoyutKapi {
    private  String sihirli;
    private boolean acik;

    public BuyuluKapi()
    {
        sihirli = "Açıl Susam Açıl";
        acik = false;
    }

    @Override
    public boolean kapiAc() {
        if(acik)
        {
            return true;
        }
        System.out.println("Kapıyı açmak için sihirli cümleyi giriniz");
        Scanner scanner = new Scanner(System.in);
        String cumle = scanner.nextLine();
        scanner.close();
        if(cumle.equalsIgnoreCase(sihirli))
        {
            acik = true;
            return acik;
        }
        else
        {
            return false;
        }
    }

    @Override
    public void kapiKapat() {
        acik = false;
    }
}
