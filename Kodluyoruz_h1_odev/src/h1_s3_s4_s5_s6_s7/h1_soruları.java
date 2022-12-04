package h1_s3_s4_s5_s6_s7;

public class h1_soruları {
    /*
        Soru 3)
        Java’nın platform bağımsızlığını nasıl sağladığını anlatınız;

        Java uygulamaları JVM üzerinde koşar. JVM'in platform bağımsızlığı sağlandığı için (her işletim sistemi için ayrı JVM'ler bulunuyor)
        Java'ya da platform bağımsız diyoruz.

        Java Platform Bağımsızlığı Akışı;
        Yazılan .java uzantılı java kaynak kodları compiler yardımı ile .class uzantılı bytecode'a çevrilir. JVM bu bytekodu yorumlayarak makine diline çevirir.
    */

    /*
        Soru 4)
        Java’da heap ve stack kavramlarını örneklerle açıklayın;

        İlkel tipler ve nesne referansları Stack'te saklanır.
        Nesneler Heap'te saklanır.

        Örnek;

        int sayi=50;
        Person personBayram = new Person("Bayram");
        String title = "Example";
        Person personAhmet;
        personAhmet = personBayram;

        Stack'te saklananlar;
        sayi=50;
        personBayram (heapteki "Bayram"'ın referansı saklanır)
        personAhmet  (heapteki "Bayram"'ın referansı saklanır)
        title (heapteki referans saklanır)

        Heap'te
        "Bayram" (Person nesnesi)
        "Example" (String nesnesi)
     */

    /*
        Soru 5
        String class’ı nasıl immutable olmayı sağlamaktadır örnek ve çizimlerle açıklayınız

        Java'da Immutable kavramı değiştirilemez şeklinde açıklanabilir. Immutable nesne sadece create edilirken ilk değerini alır ve asla değişemez.
        Aşağıdaki örnekteki gibi
        String newString = "Hello";
        newString.concat("world"); dediğimizde Heap'te yeni HelloWorld isimli yeni bir nesne yaratır.
        Bu olmasaydı veri bütünlüğü ve güvenliği sağlanamazdı.

        Nasıl immutable class oluşturulur;
        1-Class final olmalı
        2-Üyeler private ve final olmalı
        3-Üye bazlı parametre alan Constructor olmalı
        4-Setter metodları olmamalı

        Bu sınıftaki main metod'da bir örnek bulunuyor.


     */


    /*
        Soru 6
        Javada çoklu kalıtım desteklenmez. Nedenine gelirsek, kalıtım yapacağımız üst sınıflar ortak bir ata sınıfa sahipse ve aynı metodu override etmişlerse
        diamond problem denilen şeyin ortaya çıkacağıdır.
        Dimaond problemi aşağıdaki gibi çizebiliriz;
            SuperClass
      ClassA        ClassB
            ClassB

        Örneğin ClassA ve ClassB üst sınıftan(SuperClass) doSomeThinng isimli metodu override etmiş olsunlar.
        ClassB ise ClassA ve ClassB'yi extends etmeye kalkıştığında compiler hatası alınacaktır. Hangi doSomething()'in çağrılacağı noktasında bir belirsizlik vardır.

        Notlar:
        1- Interface'ler kendi aralarında çoklu kalıtımı destekler.
        2- Bu problem nedeniyle çoklu kalıtım yerine composition yapısını kullanabiliriz.

     */

    /*
        Soru 7
        Build Tool nadir? Java ekosistemindeki build toolar neler açıklayın?

        Operasyonel işlere(Devops) yardımcı olan toollar denilebilir. Derleme, build, test çalıştırma, deploying vs. gibi işlemleri otomatize eder.

        Java'daki Build Tool'lar

       1-Apache Maven
       2-Gradle
       3-SBT
       4-Apache Ant

     */


    public static void main(String[] args){
        String NewString = "Hello";
        System.out.println(NewString.concat("World"));
        System.out.println(NewString);
    }
}
