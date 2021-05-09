public class Employee {
    private int gaji;
    private int jumlah_kerja=0;
    public void compensate(int compensation){
        this.gaji+=compensation;
    }
    public void work() throws UnpaidException,UnderpaidException,BurnoutException{ 
        if(gaji==0){
            throw new UnpaidException();
        }
        if(jumlah_kerja==10){
            throw new BurnoutException();
        }
        if(gaji<(1+jumlah_kerja)*100){
            int sisa=this.gaji-(this.jumlah_kerja*100);
            throw new UnderpaidException(sisa);
        }
        this.jumlah_kerja++;
    }
    public void nextDay(){
        this.jumlah_kerja=0;
        this.gaji=0;
    }
}
