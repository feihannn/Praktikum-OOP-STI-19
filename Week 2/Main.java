/*
MARCELINO FEIHAN
18219006
*/
import java.lang.System;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        Scanner input=new Scanner(System.in);
        //Menyiapkan objek setan dan lawan setan
        Vampir vampir=new Vampir();
        Vampir lawan_vampir=new Vampir();
        Pocong pocong=new Pocong();
        Pocong lawan_pocong=new Pocong();
        Sadako sadako=new Sadako();
        Sadako lawan_sadako=new Sadako();
        String[] jagoan=new String[]{vampir.getNama(),pocong.getNama(),sadako.getNama()};
        //input lawan
        int jumlah_lawan=input.nextInt();
        String[] lawan=new String[jumlah_lawan+1];
        for (int i=0;i<=jumlah_lawan;i++){
            lawan[i]=input.nextLine();
        }
        //bertarung untuk vampir
        for (int i=0;i<=jumlah_lawan;i++){
            if (lawan[i].equals("Vampir")){
                vampir.tarung(lawan_vampir);
            }
            else if (lawan[i].equals("Pocong")){
                vampir.tarung(lawan_pocong);
            }
            else if(lawan[i].equals("Sadako")){
                vampir.tarung(lawan_sadako);
            }
        }
        //bertarung untuk sadako
        for (int i=0;i<=jumlah_lawan;i++){
            if (lawan[i].equals("Vampir")){
                sadako.tarung(lawan_vampir);
            }
            else if (lawan[i].equals("Pocong")){
                sadako.tarung(lawan_pocong);
            }
            else if(lawan[i].equals("Sadako")){
                sadako.tarung(lawan_sadako);
            }
        }
        //bertarung untuk pocong
        for (int i=0;i<=jumlah_lawan;i++){
            if (lawan[i].equals("Vampir")){
                pocong.tarung(lawan_vampir);
            }
            else if (lawan[i].equals("Pocong")){
                pocong.tarung(lawan_pocong);
            }
            else if(lawan[i].equals("Sadako")){
                pocong.tarung(lawan_sadako);
            }
        }
        //Hasil Akhir
        System.out.println("Vampir: "+vampir.getPoin());
        System.out.println("Pocong: "+pocong.getPoin());
        System.out.println("Sadako: "+sadako.getPoin());
    }
}
