  import java.util.Scanner;
  
public class App30 {
    public static void main(String[] args) throws Exception {
        int n, soDu, tong = 0;
    Scanner scanner = new Scanner(System.in);
         
    System.out.print("Nhập vào số nguyên dương bất kỳ: ");
    n = scanner.nextInt();
         
    while (n > 0) {
        soDu = n % 10;
        n = n / 10;
        tong += soDu;
    }
         
    System.out.println("Tổng các chữ số = " + tong);
    }
}
