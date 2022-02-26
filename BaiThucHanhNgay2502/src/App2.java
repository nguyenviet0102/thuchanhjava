import java.util.Scanner;
public class App2 {
   public static void main(String[] args) {
        float a, b, c;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập vào cạnh thứ nhất: ");
        a = sc.nextFloat();
        System.out.print("Nhập vào cạnh thứ hai: ");
        b = sc.nextFloat();
        System.out.print("Nhập vào cạnh thứ ba: ");
        c = sc.nextFloat();
        if ((a + b > c) && (a + c > b) && (b + c > a) && (a > 0) && (b > 0) && (c > 0)) {
            if ((a == b) && (b == c)) {
                System.out.println("Tam giác đều!");
            } 
            else if ((a == b) || (a == c) || (b == c)) {
                System.out.println("Tam giác cân!");
            } 
            else if ((a * a == b * b + c * c) ||
                    (b * b == a * a + c * c) ||
                    (c * c == a * a + b * b)) {
                System.out.println("Tam giác vuông!");
            } 
            else if (((a * a + b * b == c * c) && (a == b)) || ((a * a + c * c == b * b) && (a == c)) ||
                    ((b * b + c * c == a * a) && (b == c))) {
                System.out.println("Tam giác vuông cân!");
            } 
            else {
                System.out.println("Tam giác thường !");
            }
            } 
            else {
            System.out.println("Dữ liệu bạn nhập không thỏa mãn!");
            }
        sc.close();
    } 
}
