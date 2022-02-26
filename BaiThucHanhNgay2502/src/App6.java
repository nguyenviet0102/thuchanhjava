import java.util.Scanner;
public class App6 {
   public static boolean SNT(int n) {
        int temp = 0;
        for (int i=1; i<=n; i++) {
            if (n % i==0) {
                temp++;
            }
        }
        if (temp==2) {
            return true;
        } 
        else {
            return false;
        }          
    }
        public static boolean SHT(int n) {
            int tong = 0;
            for (int i=1; i<n; i++) {
                if (n % i == 0) {
                    tong += i;
                }
            }
            if (tong==n) {
                return true;
            } else {
                return false;
            }              
        }
        public static void main(String[] args) {
            int n;
            Scanner sc = new Scanner(System.in);
            System.out.println("Nhập vào số nguyên n: ");
            n = sc.nextInt();
            System.out.println("Các số nguyên nhỏ hơn "+n+" là: ");
            for (int i = 1; i < n; i++) {
                if (SNT(i) == true) {
                    System.out.print(i+"\t");
                }
            }
            
            System.out.println("Cac so nguyen hoan thien nho hon "+n+" la :");
            for (int i=1; i<n; i++) {
                if (SHT(i)==true) {
                    System.out.print(i+"\t");
                }
            }
            sc.close();
        } 
}
