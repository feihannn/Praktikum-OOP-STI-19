/**
 * Main.java
 * [jelaskan kegunaan file ini]
 * @author 18219006 Marcelino Feihan
 */
import java.lang.System;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        int x=input.nextInt();
        int y=input.nextInt();
        float r=input.nextFloat();
        Point titik=new Point(x,y);
        Circle lingkaran=new Circle(titik,r);
        System.out.println(x+" "+y+" "+Math.round   (r));
        System.out.println(Math.round(lingkaran.getCircumference()));
        System.out.println(Math.round(lingkaran.getArea()));
    }
}