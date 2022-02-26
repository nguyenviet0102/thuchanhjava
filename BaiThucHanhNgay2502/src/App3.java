import java.util.Scanner;
public class App3 {
   public static void main(String[] args) {
        System.out.print("Nhập số nguyên dương n = ");
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();         
        if (n < 2) { 
            System.out.println("n không phải là số nguyên tố");
        }
        boolean so_NT = true;
        for (int i = 2; i < Math.sqrt(n); i++) {
                if (n % i == 0) {
                    so_NT = false;
                    break;
            }
        }
        if (so_NT) { 
                System.out.println("n là số nguyên tố");
        } 
        else {
                System.out.println("n không phải là số nguyên tố");
        }
        scanner.close();
    } 
}
