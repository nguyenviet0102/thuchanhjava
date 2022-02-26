import java.util.Scanner;
public class App8 {
   public static void main(String[] args) throws Exception {
        int a, max = 0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhap so nguyen : ");
            a = sc.nextInt();
            if (a % 5 == 0)
                if (a > max)
                    max = a;
        } while (a != 0);
        System.out.println("Gia tri lon nhat trong cac so vua nhap chia het cho 5 la: " + max);
        sc.close();
    } 
}
