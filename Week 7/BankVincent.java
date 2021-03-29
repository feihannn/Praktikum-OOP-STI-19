//Marcelino Feihan
//18219006
public class BankVincent {
    private FraudService fraudService;
    private NotifierService notifierService;
    private Integer saldoNasabah1 = 2000;
    private Integer saldoNasabah2 = 2000;
    private Integer saldoNasabah3 = 2000;
    private Integer saldoNasabah4 = 2000;

    public BankVincent(FraudService fraudService, NotifierService notifierService) {
        this.fraudService = fraudService;
        this.notifierService = notifierService;
    }

    public void debit(int transactionId, int nasabah, int nominal) {
        // Method debit mengurangi saldo milik nasabah.
        // Pada method ini kamu harus menggunakan fraudService.isFraud(nominal) untuk
        // memeriksa apakah transaksi adalah penipuan.

        // Apabila isFraud() == true, kamu harus memanggil method trxFraudulent().
        // Apabila transaksi berhasil, kamu harus memanggil method trxCompleted().
        // Apabila saldo tidak cukup, kamu harus memanggil method insufficientFunds().
        if(fraudService.isFraud(nasabah, nominal)){
            trxFraudulent(transactionId, nasabah, nominal);
        }else{
            if (nominal>getSaldo(nasabah)){
                insufficientFunds(transactionId, nasabah, nominal, getSaldo(nasabah));
            }else{
                synchronized(this){
                    if(nasabah==1){
                        saldoNasabah1-=nominal;
                    }else if(nasabah==2){
                        saldoNasabah2-=nominal;
                    }else if(nasabah==3){
                        saldoNasabah3-=nominal;
                    }else if(nasabah==4){
                        saldoNasabah4-=nominal;
                    }
                }
                trxCompleted(transactionId, nasabah, nominal, getSaldo(nasabah));
            }
        }
    }

    public void credit(int transactionId, int nasabah, int nominal) {
        // Method credit menambah saldo milik nasabah.
        // Pada method ini kamu harus menggunakan fraudService.isFraud(nominal) untuk
        // memeriksa apakah transaksi adalah penipuan.

        // Apabila isFraud() == true, kamu harus memanggil method trxFraudulent().
        // Apabila transaksi berhasil, kamu harus memanggil method trxCompleted().
        if(fraudService.isFraud(nasabah, nominal)){
            trxFraudulent(transactionId, nasabah, nominal);
        }else{
            synchronized(this){
                synchronized(this){
                    if(nasabah==1){
                        saldoNasabah1+=nominal;
                    }else if(nasabah==2){
                        saldoNasabah2+=nominal;
                    }else if(nasabah==3){
                        saldoNasabah3+=nominal;
                    }else if(nasabah==4){
                        saldoNasabah4+=nominal;
                    }
                }
            }
            trxCompleted(transactionId, nasabah, nominal, getSaldo(nasabah));
        }
    }
    public int getSaldo(int nasabah) {
        switch (nasabah) {
        case 1:
            return this.saldoNasabah1;
        case 2:
            return this.saldoNasabah2;
        case 3:
            return this.saldoNasabah3;
        case 4:
            return this.saldoNasabah4;
        default://asumsi karena kurang default
            return 0;
        }
    }

    private void trxFraudulent(int transactionId, int nasabah, int nominal) {
        notifierService.fraudulentTransaction(transactionId, nasabah, nominal);
    }

    private void trxCompleted(int transactionId, int nasabah, int nominal, int saldoBaru) {
        notifierService.transactionCompleted(transactionId, nasabah, nominal, saldoBaru);
    }

    private void insufficientFunds(int transactionId, int nasabah, int nominal, int saldoLama) {
        notifierService.insufficientFunds(transactionId, nasabah, nominal, saldoLama);
    }
}