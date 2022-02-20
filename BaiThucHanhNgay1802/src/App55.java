public class App55 {
   public static void main(String[] args){
        System.out.print("Các số chia hết cho 5 là: "+" ");
        for (int i = 0; i <= 20; i++) {
        if (i % 5 != 0) {
            continue;
            }
        System.out.println(i);
        }
   } 
}
