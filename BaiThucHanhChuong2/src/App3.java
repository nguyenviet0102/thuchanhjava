import java.util.Scanner;
public class App3 {
    public static void main(String[] args) {
        int age, year;
        String name, ageGroup;
        Scanner sc = new Scanner(System.in);
         
        System.out.println("Nhập vào tên: ");
        name = sc.nextLine();
        System.out.println("Nhập vào năm sinh: ");
        year = sc.nextInt();
         
        
        age = 2017 - year;  
        if (age < 16) {
            ageGroup = "tuổi vị thành niên.";
        } else if (age >= 16 || age < 18) {
            ageGroup = "tuổi trưởng thành.";
        } else {
            ageGroup = "già rồi!";
        }
         
        System.out.println("Bạn " + name + " thuộc nhóm " + ageGroup);
        sc.close();
    }
    
 
} 