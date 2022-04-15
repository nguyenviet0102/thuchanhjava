import java.util.Scanner;
public class App9 {
    public static void main(String[] args) {
        String chuoi;
        char kyTu;
        Scanner sc = new Scanner(System.in);
             
        System.out.println("Nhập vào chuỗi bất kỳ: ");
        chuoi = sc.nextLine();
             
        System.out.println("Các ký tự có trong chuỗi là: ");
        for (int i = 0; i < chuoi.length(); i++) {
           
            kyTu = chuoi.charAt(i);
                 
            System.out.println(kyTu);
        } 
        sc.close();
    }
}