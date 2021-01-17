public class Company {

    private static Company company = new Company();
    public static int kacKereOlustu = 0;

    private Company(){
        System.out.println("Ben Company'im");
    }

    public static Company getCompany()
    {
         kacKereOlustu += 1;
         System.out.println(kacKereOlustu);

         return company;
    }
}
