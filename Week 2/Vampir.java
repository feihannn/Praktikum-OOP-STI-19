/**
 * Setan.java
 * [Jelaskan kegunaan class ini]
 * @author 18219006 MARCELINO FEIHAN
 */
class Vampir extends Setan{
    public Vampir(){
        super("Vampir","China");
    }
    public void sayHi(){
        System.out.println("Ni Hao! Aku "+getNama()+". Aku Dari "+getNegara()+".");
    }
}
