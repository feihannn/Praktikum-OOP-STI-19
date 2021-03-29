public class NotifierService {
    public void transactionCompleted(int transactionId, int nasabah, int nominal, int saldoBaru) {
        System.out.println(
                "Transaksi berhasil: nasabah " + nasabah + ", nominal: " + nominal + ", saldo baru: " + saldoBaru);
    }

    public void insufficientFunds(int transactionId, int nasabah, int nominal, int saldoLama) {
        System.out.println(
                "Saldo tidak cukup: nasabah " + nasabah + ", nominal: " + nominal + ", saldo lama: " + saldoLama);
    }

    public void fraudulentTransaction(int transactionId, int nasabah, int nominal) {
        System.out.println("Transaksi penipuan: nasabah " + nasabah + ", nominal: " + nominal);
    }
}