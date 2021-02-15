/*
Marcelino Feihan 
18219006
*/
import java.lang.System;
import java.util.Scanner;
class Main {
    public static void main(String[] args){
        //Inisiasi Program
        Scanner input=new Scanner(System.in);
        Casio real_casio=new Casio();
        CasioKW fake_casio=new CasioKW();
        String kata=input.nextLine();
        //Membaca Kondisi Sesuai Input Pemain
        while(!kata.equals("END")){
            if (kata.equals("CHECK_BATTERY")){
                System.out.println("Battery Casio: "+real_casio.checkBattery());
                System.out.println("Battery CasioKW: "+fake_casio.checkBattery());
            }
            else{
                String pisah=kata.split(" ")[0];
                int angka=Integer.parseInt(kata.split(" ")[1]);
                if (pisah.equals("PLUS")){
                    System.out.println("Casio: "+real_casio.plus(angka));
                    System.out.println("CasioKW: "+fake_casio.plus(angka));
                }
                else if(pisah.equals("MINUS")){
                    System.out.println("Casio: "+real_casio.minus(angka));
                    System.out.println("CasioKW: "+fake_casio.minus(angka));
                }
            }
            kata=input.nextLine();
        }
    }
}
