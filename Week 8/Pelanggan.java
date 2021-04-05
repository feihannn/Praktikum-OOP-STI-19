//Marcelino Feihan
//18219006
class Pelanggan {
    public PublicData publicdata;
    private PrivateData privatedata;
    
    public enum JenisPelanggan{
        VIP,MEMBER,NONMEMBER
    }
    public Pelanggan(String nama,String namaibu){
        publicdata=this.new PublicData(nama);
        privatedata=this.new PrivateData(namaibu);
    }
    public class PublicData{
        public String nama;
        public PublicData(String nama){
            this.nama=nama;
        }
    }
    private class PrivateData{
        private String namaibu;
        private JenisPelanggan jenispelanggan;
        public  PrivateData(String namaibu){
            this.namaibu=namaibu;
            this.jenispelanggan=JenisPelanggan.NONMEMBER;
        }
    }
    public String getnamaibu(){
        return this.privatedata.namaibu;
    }
    public void setnamaibu(String namaibu){
        this.privatedata.namaibu=namaibu;
    }
    public JenisPelanggan getjenispelanggan(){
        return this.privatedata.jenispelanggan;
    }
    public void setjenispelanggan(JenisPelanggan jenispelanggan){
        this.privatedata.jenispelanggan=jenispelanggan;
    }
    // definisikan enum
    // definisikan nested class
    // definisikan konstruktor
    // definisikan getter dan setter

}