package h1_s10;
import java.util.ArrayList;

public class Main {
    public static ArrayList<Siparis> siparisler;

    public static void main(String[] args) {

        ArrayList<Urun> urunList = new ArrayList<>();

        urunList.add(new Urun("Telefon", 12000, "Galaxy", 122));
        urunList.add(new Urun("Bilgisayar", 25000, "HP", 13));
        urunList.add(new Urun("Bisiklet", 4000, "Salcano", 45));
        urunList.add(new Urun("Oyuncak", 150, "Ayıcık", 10));
        urunList.add(new Urun("Bardak", 250, "Su Bardağı", 10));


        Musteri cem = new Musteri("Cem", 27);

        Siparis sip = new Siparis(1, "AAS2022000000001");
        Siparis sip2 = new Siparis(2, "AAS2022000000002");

        sip.addUrun(urunList.get(1));
        sip.addUrun(urunList.get(2));

        sip2.addUrun(urunList.get(0));

        cem.addSiparis(sip);
        cem.addSiparis(sip2);


        Musteri ozan = new Musteri("Ozan", 23);
        Siparis sip3 = new Siparis(3, "AAS2022000000003");
        sip3.addUrun(urunList.get(4));
        ozan.addSiparis(sip3);

        Musteri cem2 = new Musteri("Cem", 29);
        Siparis sip4 = new Siparis(4, "AAS2022000000004");
        sip4.addUrun(urunList.get(1));
        sip4.addUrun(urunList.get(2));
        cem2.addSiparis(sip4);


        ArrayList<Siparis> tumSiparisler = new ArrayList<>();
        Musteri cem3 = new Musteri("Cem", 29);
        Siparis sip5 = new Siparis(5, "AAS2022000000005");
        sip5.addUrun(urunList.get(1));

        cem3.addSiparis(sip5);


        siparisler = new ArrayList<>();
        siparisler.add(sip);
        siparisler.add(sip2);
        siparisler.add(sip3);
        siparisler.add(sip4);
        siparisler.add(sip5);

        for (int i = 0; i < siparisler.size(); i++)
            siparisler.get(i).printSipInfos();


        System.out.println("Müşteri Sayısı: " + Musteri.getMusteriSayisi());
        System.out.println("İsmi Cem olanların aldıkları ürün sayısı: " + getUrunCountByMusteriName("Cem"));
        System.out.println("İsmi Cem olup yaşı 25-31 arası olanların toplam alısveris tutarı:" + getTotalAmountByNameAndAgeRange("Cem", 25, 31));

        for (int i = 0; i < siparisler.size(); i++) {
            if (siparisler.get(i).getTotalAmount() > 1500) {
                System.out.println("1500 TL üzeri faturalar: " + siparisler.get(i).getFaturaNo() + " fat fiyat: " + siparisler.get(i).getTotalAmount());
            }
        }

    }

    public static int getUrunCountByMusteriName(String name) {
        int urunCount = 0;
        for (int i = 0; i < siparisler.size(); i++) {
            if (siparisler.get(i).getMusteri().getName().equals(name))
                urunCount++;
        }
        return urunCount;
    }

    public static double getTotalAmountByNameAndAgeRange(String reqName, int startAge, int endAge) {
        int age;
        String name;
        double totalAmount = 0.0;
        for (int i = 0; i < siparisler.size(); i++) {
            age = siparisler.get(i).getMusteri().getAge();
            name = siparisler.get(i).getMusteri().getName();
            if (age > startAge && age < endAge && name.equals(reqName))
                totalAmount = siparisler.get(i).getTotalAmount();
        }
        return totalAmount;
    }

}

