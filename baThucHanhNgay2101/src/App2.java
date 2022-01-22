import java.util.Scanner;

public class App2 {
    public static void main(String[] args) throws Exception {
    double a1, a2, b1, b2, c1, c2, D, Dx, Dy;
        try (Scanner abc = new Scanner(System.in)) {
            System.out.println("Nhap vao he so a1:");
                a1 = abc.nextDouble();
            System.out.println("Nhap vao he so b1:"); 
                b1 = abc.nextDouble();  
            System.out.println("Nhap vao he so c1;");
                c1 = abc.nextDouble();
            System.out.println("Nhap vao he so a2;");
                a2 = abc.nextDouble();
            System.out.println("Nhap vao he so b1;");
                b2 = abc.nextDouble();
            System.out.println("Nhap vao he so c2;");
                c2 = abc.nextDouble();
        }
        D = a1 * b2 - a2 * b1;
        Dx = c1 * b2 - c2 * b1;
        Dy = a1 * c2 - a2 * c1;
        if (D==0) {
            if (Dx + Dy == 0)
                System.out.println("He phuong trinh co vo so nghiem !");
            else
                System.out.println("He phuong trinh vo nghiem !");
        }                           
        else {
            double x = Dx / D;
                System.out.println("x ="+x);
            double y = Dy / D;
                System.out.println("y ="+y);
        }
    }
}
