/**
 * Main.java 
 * [Jelaskan kegunaan class ini]
 * @author 18219006 Marcelino Feihan
 */

import java.lang.System;
import java.util.Scanner;
import java.util.ArrayList;
public class Main {
    public static void main(String[] args) {
        int kompensasi;
        int pilihan;
        int jumlah_pilihan;
        ArrayList<String> pesan=new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        Employee karyawan=new Employee();
        jumlah_pilihan=scanner.nextInt();
        for(int i=0;i<jumlah_pilihan;i++){
            pilihan=scanner.nextInt();
            if(pilihan==1){
                kompensasi=scanner.nextInt();
                karyawan.compensate(kompensasi);
                pesan.add("Berhasil membayar pegawai sebesar V$"+kompensasi);
            }
            else if(pilihan==2){
                try{
                    karyawan.work();
                    pesan.add("Berhasil melakukan tugas");
                }catch(UnderpaidException e){
                    e.getErrorMessage();
                }catch(UnpaidException e){
                    e.getErrorMessage();
                }catch(BurnoutException e){
                    e.getErrorMessage();
                }
            }else{
                karyawan.nextDay();
                pesan.add("Ganti hari boi!");
            }
        }
        for(int i=0;i<pesan.size();i++){
            System.out.println(pesan.get(i));
        }
        scanner.close();
    }
}