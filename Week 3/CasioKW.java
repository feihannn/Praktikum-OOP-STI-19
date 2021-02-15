public class CasioKW implements Calculator{
    public int hasil=0;
    public int baterai=100;
    public int plus(int angka1){
        this.hasil+=angka1;
        this.baterai-=10;
        return this.hasil;
    }
    public int minus(int angka2){
        this.hasil-=angka2;
        this.baterai-=10;
        return this.hasil;
    }
    public int checkBattery(){
        return this.baterai;
    }
}
