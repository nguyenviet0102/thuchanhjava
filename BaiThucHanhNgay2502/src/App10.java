import java.util.Scanner;
public class App10 {
   public static void main(String[] args) {
        int number, count = 0;
        Scanner sc = new Scanner(System.in);

        System.out.println("Nhập vào 1 số nguyên dương bất kỳ: ");
        number = sc.nextInt();

        while (number <= 0) {
            System.out.println("Số nhập vào phải lớn hơn 0. Mời bạn nhập lại: ");
            number = sc.nextInt();
        }

        while (number > 0) {
            number /= 10;
            count++;
        }

        System.out.println("Số các chữ số = " + count);
    } 
}
