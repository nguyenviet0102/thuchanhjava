package Main;
import Shape.*;
public class App {
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
       testPoint();
       System.out.println("Next is a Triangle");
       testTriangle();
    
    }

    public static void testPoint(){
        
        Point p = new Point("A", 2, 3);
        p.enterInfoPoint();
        System.out.println("Point here you are: ");
        p.showInfoPoint();

    }

    public static void testTriangle(){

        Triangle triangle = new Triangle("A", 2, 3, 3, 4, 5);
        triangle.kiemTra();

    }





}
