/*
MARCELINO FEIHAN 
18219006
*/
import java.util.ArrayList;
import java.util.List;

public class VehicleManager {
    private List<Vehicle> list = new ArrayList<Vehicle>();

    /**
     * Menambahkan kendaraan ke array
     * 
     * @param vehicle objek Vehicle
     */
    public void addVehicle(Vehicle vehicle) {
        list.add(vehicle);
    }

    /**
     * Memarkirkan semua kendaraan pada list menggunakan method park pada Vehicle
     */
    public void parkAllVehicles() {
        for (Vehicle vehicle : this.list) {
            vehicle.park();
        }
    }

    /**
     * Membuka semua pintu pada kendaraan yang memiliki pintu menggunakan method
     * openDoor pada Door
     */
    public void openAllDoors() {
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Door){
                Door pintu=(Door)list.get(i);
                pintu.openDoor();
            }
        }
    }

    /**
     * Menutup semua pintu pada kendaraan yang memiliki pintu menggunakan method
     * closeDoor pada Door
     */
    
    public void closeAllDoors() {
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Door){
                Door pintu=(Door)list.get(i);
                pintu.closeDoor();      
            }
        }
    }

    /**
     * Menyalakan semua mesin pada kendaraan yang memiliki mesin menggunakan method
     * startEngine pada Engine
     */
    public void startAllEngines() {
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Engine){
                Engine mesin=(Engine)list.get(i);
                mesin.startEngine();
            }
        }
    }

    /**
     * Mematikan semua mesin pada kendaraan yang memiliki mesin menggunakan method
     * stopEngine pada Engine
     */
    public void stopAllEngines() {
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Engine){
                Engine mesin=(Engine)list.get(i);
                mesin.stopEngine();   
            }
        }
    }

    /**
     * Mengganti semua ban pada kendaraan yang memiliki ban menggunakan method
     * changeTyre pada Tyre
     */
    public void changeAllTyres() {
        int panjang=list.size();
        for (int i=0;i<panjang;i++){
            if (list.get(i) instanceof Tyre){
                Tyre roda=(Tyre)list.get(i);
                roda.changeTyre();
            }
        }
    }
}
