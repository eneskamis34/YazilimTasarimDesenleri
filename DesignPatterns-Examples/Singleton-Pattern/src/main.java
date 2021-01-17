public class main {
    public static void main(String[] args) {

        Singleton.getSingleton();

        //10 kere dolaşmasına rağmen sadece 1 kere "Ben Company'im Yazacak.
        for(int i = 0; i < 10; i++)
        {
            Company company = Company.getCompany();
        }
        //Bu nesne static bir değişken olarak oluşturuluyor.
        //static değişkenler ise daha nesne oluşturulmadan oluşturulurlar.
        //Daha sonrasında getCompany() metodu çağrılarak, hep o ilk baştaki nesne kullanılıyor. Yeni bir nesne oluşturulmuyor.

    }
}
