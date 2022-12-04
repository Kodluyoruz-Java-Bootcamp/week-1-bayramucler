package h1_s10;
import java.util.ArrayList;

public class Siparis {
    private int sipNo;
    private String faturaNo;
    private ArrayList<Urun> urunList;
    private Musteri musteri;

    public void addUrun(Urun urun){
        urunList.add(urun);
    }

    public Siparis(int sipNo, String faturaNo) {
        setSipNo(sipNo);
        setFaturaNo(faturaNo);
        urunList = new ArrayList<>();

    }

    public Musteri getMusteri() {
        return musteri;
    }

    public void setMusteri(Musteri musteri) {
        this.musteri = musteri;
    }

    public int getSipNo() {
        return sipNo;
    }

    public void setSipNo(int sipNo) {
        this.sipNo = sipNo;
    }

    public String getFaturaNo() {
        return faturaNo;
    }

    public void setFaturaNo(String faturaNo) {
        this.faturaNo = faturaNo;
    }

    public ArrayList<Urun> getUrunList() {
        return urunList;
    }

    public void setUrunList(ArrayList<Urun> urunList) {
        this.urunList = urunList;
    }

    public double getTotalAmount(){
        double totalAmount=0.0;
        for (int i = 0; i <this.getUrunList().size(); i++) {
           totalAmount= totalAmount + this.getUrunList().get(i).getFiyat();
        }
        return totalAmount;
    }

    public void printSipInfos(){
        System.out.println("***Sipariş Bilgileri***");
        System.out.println("Sipno: " +this.sipNo);
        System.out.println("Fatura No: " + this.faturaNo);
        System.out.println("Müşteri Adı:" + this.musteri.getName());

        for (int i = 0; i <this.getUrunList().size(); i++) {
            System.out.println("Ürün Adı:" + this.getUrunList().get(i).getIsim());
            System.out.println("Ürün Fiyatı:" + this.getUrunList().get(i).getFiyat());
        }
    }



}
