/**
 * Circle.java
 * [Jelaskan kegunaan class ini]
 * @author 18219006 Marcelino Feihan
 */

public class Circle {
    /**
     * Konstruktor
     * @param origin Titik pusat lingkaran
     * @param radius Jari-jari lingkaran
     */
    public Point origin;
    public float radius;

    public Circle(Point origin, float radius) {
        this.origin=origin;
        this.radius=radius;
    }

    /**
     * Hitung luas lingkaran
     * Asumsi pi = 3.14
     * @return luas lingkaran
     */
    public float getArea() {
        return 3.14f*this.radius*this.radius;
    }

    /**
     * Hitung keliling lingkaran
     * Asumsi pi = 3.14
     * @return luas lingkaran
     */
    public float getCircumference() {
        return 3.14f*this.radius*2;
    }
}