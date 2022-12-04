package h1_s10;

public class Urun {
    private String kategori;
    private String isim;
    private double fiyat;
    private int stok;

    public String getKategori() {
        return kategori;
    }

    public Urun(String kategori, double fiyat, String isim, int stok) {
        setKategori(kategori);
        setFiyat(fiyat);
        setIsim(isim);
        setStok(stok);
    }

    public void setKategori(String kategori) {
        this.kategori = kategori;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    public int getStok() {
        return stok;
    }

    public void setStok(int stok) {
        this.stok = stok;
    }
}
