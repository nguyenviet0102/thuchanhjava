import java.util.Scanner;

public class App47 {
   public static void main(String[] args){
       int Number, totalNumber = 0 ;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.print("Nhập vào số nguyên bất kỳ: ");
            Number = sc.nextInt();
            totalNumber += Number;
            }while (totalNumber < 100); 

        System.out.println("Tổng các số nguyên vừa nhập = " +totalNumber);

   } 
}
