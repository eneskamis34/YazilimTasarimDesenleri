# Design Patterns

## Creational Design Patterns:
### Singleton Pattern:
Yalnızca **1 adet obje yaratmayı** garanti eden bir türdür.
- Ana mantığında ise nesneyi static bir yapıda oluşturuyoruz. 
- Static yapılar ise nesne oluşmadan oluşurlar bu yüzden **getX()** ile her çağırdığımızda aslında static olarak ilk defa oluşmuş nesneyi çağırmaktayız.
### Factory Pattern:
Benzer özellikleri olan nesneleri tek bir instance üzerinden yaratmamıza imkan tanımaktadır.
- Bu pattern ile nesne yaratılma işini inheritance yoluyla client-side'dan ayırıp sub-classes'lara vermek amaçlanır.
### Abstract Factory Pattern:
Birbiriyle alakalı veya bağımlı nesnelerin somut sınıflarını belirtmeden, yaratılması için gereken bir arayüz sağlar.
- Nesneleri yaratan fabrika sınıfından somut nesne yaratma işlemini çıkarmak istiyorsak, bu tasarım desenini kullanmak gereklidir.
- Ayrıca temel Factory Pattern'da bulunan if-else (spagetti) yapısından da kurtulmak için de kullanabiliriz.
### Builder Pattern:
Çoklu field barındıran classları kullanırken özellikle girilmesi zorunlu tuttuğumuz ya da opsiyonel olarak belirtmek istediğimiz durumlarda kargaşa ve karmaşık bir constructor yapısı olmaması için kullanılan yapıdır.
