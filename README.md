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
- Çok fazla field olduğunda oluşabilecek karmaşaların önüne geçmek için kullanılabilir.
### Prototype Pattern:
Nesnelerin bellek kullanımı göz önüne alındığında verimli bir bellek kullanımı için gerektiği yerlerde yeni nesne üretmek yerine üretilmiş bir nesneyi **klonlama** işlemi için kullanılan yapıdır.
- İki tip klonlama yöntemi bulunuyor ve bu yöntemler: **Shallow Copy** ya da **Deep Copy** olarak karşımıza çıkıyor.
- Shallow Copy ya da Türkçesi ile Yüzeysel kopyalama olarak ele alırsak bu Pattern için bize hiç uygun olmayacaktır, çünkü sadece ana sınıfı klonlarken fieldlerı değiştirmeyecektır. Bu yüzden **bu patternde Deep Copy kullanılmalıdır.**

## Structural Design Patterns:
### Adapter Pattern:
Birbirinden farklı ve ilişkisi olmayan interfaceleri birlikte kullanmamızı sağlayan bir yapısal tasarımdır.
- Bir nevi dönüşüm işlemi yapmaktadır. Adaptör görevi görerek çalışır. 
- Bu sayede kodların tekrar yazılmasının önüne geçmiş olur.
### Bridge Pattern:
Soyut sınıflarla diğer sınıfları farklı hiyeraşik bir yapıda toplayarak esnek bir kullanım sağlayan yapısal tasarımdır.
- Temel hedef, genişlemeye ve geliştirmeye açık ama değişime kapalı bir yapı oluşturmaktır.
