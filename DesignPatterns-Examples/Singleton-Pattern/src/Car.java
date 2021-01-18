public class Car {

    private static Car car = null;

    private Car()
    {
        System.out.println("Araç oluşturuldu.");
    }
    //null ile kontrol sağlandığında bu sefer multithread işlemlerinde bir açık meydana geliyor.
    //Ancak bu sefer her defasında kontrol edileceği için Syncronaydez ile kontrol sağlıyoruz.
    //Early Loading hatasına yakalanmamak için if ile kontrol sağlıyoruz.ve Layz Loading yapıyoruz.
    //Buna da Double Checked Locking deniyor.
    public static Car getCar()
    {
        if(car == null)
        {
            synchronized (Car.class)
            {
                if(car == null)
                {
                    car = new Car();
                }
            }
        }
        return car;
    }
}
