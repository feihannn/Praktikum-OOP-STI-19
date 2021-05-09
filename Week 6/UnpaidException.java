public class UnpaidException extends Exception{
    public UnpaidException(){
        super();
    }
    public String getErrorMessage(){
        return "Anak Istri butuh makan nih :(";
    }
}