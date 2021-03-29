public class Main {
    public static void main(String[] args) {
        FraudService fraudService = new FraudService();
        NotifierService notifierService = new NotifierService();
        BankVincent bankVincent = new BankVincent(fraudService, notifierService);

        // Contoh
        bankVincent.debit(12, 1, 1000); // transactionId: 12, nasabah: 1, nominal: 100
        bankVincent.debit(12, 1, 1500); // transactionId: 12, nasabah: 1, nominal: 100

    }
}