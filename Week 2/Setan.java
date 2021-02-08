/**
 * Setan.java
 * [Jelaskan kegunaan class ini]
 * @author 18219006 MARCELINO FEIHAN
 */

public abstract class Setan {
    private String namaSetan;
    private String asalNegara;
    private int poin;

    public Setan(String namaSetan, String asalNegara) {
        // Inisialisasi nama dan negara asal setan
        // Poin awal tiap setan adalah 0
        this.namaSetan=namaSetan;
        this.asalNegara=asalNegara;
        this.poin=0;
    }
    
    public String getNama() {
        // Mengembalikan nama setan
        return this.namaSetan;
    }
    
    public String getNegara() {
        // Mengembalikan asal negara setan
        return this.asalNegara;
    }
    
    public int getPoin() {
        // Mengembalikan poin terkini setan
        return this.poin;
    }
    
    protected void tambahPoint(int plusPoin) {
        // Menambahkan poin yang telah dimiliki setan
    }
    
    public abstract void sayHi();

    public void tarung(Setan lawan) {
        // Membandingkan nama setan dengan lawan
        // Dianggap menang jika nama setan > lawan (ex: vampir > pocong karena "v" > "p")
        // Jika nama setan dan lawan sama, pertarungan dianggap seri
        // Menang mendapatkan 3 poin
        // Kalah poin dikurangi 1
        // Seri tidak mendapatkan poin
        char pertama=this.namaSetan.charAt(0);
        char kedua=lawan.namaSetan.charAt(0);
        int nilai=Character.compare(pertama,kedua);
        if (nilai>0){
            this.poin+=3;
        }
        else if (nilai<0){
            this.poin-=1;
        }
        else{
           
        }
    }
}