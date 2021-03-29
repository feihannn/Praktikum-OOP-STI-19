public class FraudService {
    public boolean isFraud(int saldo, int nominal) {
        try {
            // Ceritanya pake AI
            Thread.sleep(nominal);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return false;
    }
}