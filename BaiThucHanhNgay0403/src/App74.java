import java.util.*;
import java.util.Scanner;
public class App74 {
    public static void main(String[] args) {
            int n;
            Scanner scanner = new Scanner(System.in);
            do {
                System.out.println("Nhập vào số phần tử của mảng: ");
                n = scanner.nextInt();
            } while (n < 0);

        int A[] = new int[n];
        System.out.println("Nhập các phần tử cho mảng: ");

        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ "+i + ": ");
            A[i] = scanner.nextInt();
        }
// Tính tổng các số chẵn có trong mảng
        double sum =0;
        for (int i = 0; i < n; i++)// {
            if (A[i] % 2 == 0) {
                sum += A[i];
            }
            System.out.println(" sum: " + sum);
        }
   
}


