//Marcelino Feihan
//18219006
public class UnderpaidException extends Exception{
    private int deficit;
    public UnderpaidException(int angka){
        super();
        this.deficit=angka;
    }
    public String getErrorMessage(){
        return "Bayarnya kurang "+this.deficit+" nih, istri saya 6 :(";
    }
}
