package h1_s10;

import java.util.ArrayList;

public class Musteri {
    private String name;
    private int age;
    private ArrayList<Siparis> siparisList;
    private static int musteriSayisi;

    public Musteri(String name, int age) {
        setName(name);
        setAge(age);
        siparisList = new ArrayList<>();
        musteriSayisi++;
    }

    public void addSiparis(Siparis siparis){
        siparisList.add(siparis);
        siparis.setMusteri(this);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static int getMusteriSayisi() {
        return musteriSayisi;
    }

    public ArrayList<Siparis> getSiparisList() {
        return siparisList;
    }

    public void setSiparisList(ArrayList<Siparis> siparisList) {
        this.siparisList = siparisList;
    }
}
