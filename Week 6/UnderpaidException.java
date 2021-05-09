public class UnderpaidException extends Exception{
    private int deficit;
    public UnderpaidException(int deficit){
        super();
        this.deficit=deficit;
    }
    public String getErrorMessage(){
        return "Bayarnya kurang "+this.deficit+" nih, istri saya 6 :(";
    }
}
