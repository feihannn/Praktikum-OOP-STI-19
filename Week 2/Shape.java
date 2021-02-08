/*
NAMA: MARCELINO FEIHAN
NIM: 18219006
TANGGAL: 8 Februari 2021
TOPIK: PRAKTIKUM 2
DESKRIPSI: SHAPE
*/
public abstract class Shape {
    public String shape_name;
    Shape(String nama){
        this.shape_name=nama;
    }
    public void printShapeName(){
        System.out.println("Hi, I'm a "+this.shape_name+"!");
    }
    public abstract double getArea();
    public abstract double getCircumference();
}
