/*
MARCELINO FEIHAN
18219006
*/
import java.util.ArrayList;
import java.util.List;

public class FruitPrinter {
    private List<Fruit> list = new ArrayList<Fruit>();

    /**
     * Add fruit. Menambahkan buah ke array
     * 
     * @param fruit objek Fruit
     */
    public void addFruit(Fruit fruit) {
        // Tambahkan buah ke list
        list.add(fruit);
    }

    /**
     * Print fruits. Mencetak nama buah yang ada di dalam array ke layar.
     */
    public void printFruits() {
        // Hint: gunakan instanceof untuk memeriksa apakah suatu objek
        // merupakan suatu tipe tertentu.
        // Misalnya: Pada list berisi objek [Banana, Banana, Orange, Apple].
        // Maka, cetak ke layar:
        // Banana
        // Banana
        // Orange
        // Apple
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Banana){
                System.out.println("Banana");
                Banana buah=(Banana) list.get(i);
                System.out.println(buah.getBananaType());
            }
            else if (list.get(i) instanceof Orange){
                System.out.println("Orange");
                Orange buah=(Orange) list.get(i);
                System.out.println(buah.isOrangeSeedless());
                System.out.println(buah.isOrangeSweet());
            }
            else if (list.get(i) instanceof Apple){
                System.out.println("Apple");
                Apple buah=(Apple) list.get(i);
                System.out.println(buah.isAppleSeedless());
            }
        }
    }
}
