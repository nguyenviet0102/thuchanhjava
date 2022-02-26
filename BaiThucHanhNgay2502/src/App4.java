import java.util.Scanner;
public class App4 {
   public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập n = ");
        n = scanner.nextInt();
        scanner.close();
        System.out.printf("Tất cả các số nguyên tố nhỏ hơn %d là: \n", n);
        if (n >= 2) {
            System.out.print(2);
        }
        for (int i = 3; i < n; i+=2) {
            if (soNT(i)) {
                System.out.print(" " + i);
            }
        }
    }
        public static boolean soNT(int n) {
        if (n < 2) {
            return false;
        }
        int square_Root = (int) Math.sqrt(n);
        for (int i = 2; i <= square_Root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    } 
}
