import java.util.Scanner;
public class App1 {
   public static void main(String[] args) {
        int firstNum, secondNum;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Nhập số thứ nhất:");
        firstNum = (int)scanner.nextInt();
        System.out.print("Nhập số thứ hai:");
        secondNum = (int)scanner.nextInt();
        scanner.close();
        while (firstNum != secondNum) {
            if (firstNum > secondNum) {
                firstNum = firstNum - secondNum;
            }       
            else {
                secondNum = secondNum - firstNum;
            }            
        }
        System.out.printf("Ước chung lớn nhất là: %d", secondNum);
    } 
}
