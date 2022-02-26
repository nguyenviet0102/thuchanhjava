import java.util.Scanner;
public class App5 {
   public static void main(String[] args) {
        int a, b;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập số nguyên: ");
        a = scanner.nextInt();
        b = perfect_Num(a);
        if ( b == 1 ) {
            System.out.println(a + " là số hoàn hảo" );
        }     
        else {
            System.out.println(b + " không phải là số hoàn hảo" );
        }       
        scanner.close();
    }
    public static int perfect_Num(int n){
        int c = 0, d=0;       
        for (int i = 1; i < n; i++) {
             if (n % i == 0) {
                d += i;
            } 
        }      
        if (d == n & n!=0) {
            c = 1;
        } 
        return c;
    } 
}
