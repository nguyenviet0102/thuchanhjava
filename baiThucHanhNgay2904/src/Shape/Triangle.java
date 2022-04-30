package Shape;

import java.util.Scanner;

public class Triangle extends Point{
    private static Scanner sc = new Scanner(System.in);
    double a, b, c;
    public Triangle(String tenDiem, double hoanhDo, double tungDo, double a, double b, double c){
        super(tenDiem, hoanhDo, tungDo);
        this.a = a; this.b = b; this.c = c;
    }

    public double getA() { 
        return a;
    }

    public void setA(double a) {
        this.a = a;
    }

    public double getB() {
        return b;
    }

    public void setB(double b) {
        this.b = b;
    }

    public double getC() {
        return c;
    }

    public void setC(double c) {
        this.c = c;
    }

    public  void kiemTra(){
         // Nhập dữ liệu
         System.out.print("input edge a: ");
         a = sc.nextDouble();
         System.out.print("input edge b: ");
         b = sc.nextDouble();
         System.out.print("input edge c: ");
         c = sc.nextDouble();
 
        
        if ((a + b > c) && (a + c > b) && (b + c > a) &&
                (a > 0) && (b > 0) && (c > 0)) {
             
            if ((a == b) && (b == c)) {
                 System.out.println("Tam giác đều!");
            } else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");
            } else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                 System.out.println("Tam giác vuông!");
            } else if (((a * a + b * b == c * c) && (a == b)) ||
                    ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } else {
                System.out.println("Tam giác thường!");
            }
        } else 
            System.out.println("3 cạnh của tam giác không thỏa mãn điều kiện lập thành tam giác!");
        
 
        sc.close();

    }



}




