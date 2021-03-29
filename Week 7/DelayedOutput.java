/**
 * DelayedOutput.java 
 * Menampilkan message dengan delay sekain detik
 * @author 18219006 Marcelino Feihan
 */
public class DelayedOutput extends Thread{
    String kata;
    int waktu;
    public DelayedOutput(int delayMilisec, String output){
        this.kata=output;
        this.waktu=delayMilisec;
    }
    public void run(){
        try{
            Thread.sleep(waktu);
            System.out.println(kata);
        }catch(InterruptedException e){

        }
    }
    public static void printDelayed(int delayMillisec, String output){
       (new DelayedOutput(delayMillisec, output)).start();
    }
}
