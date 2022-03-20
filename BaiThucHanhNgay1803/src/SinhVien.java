import java.util.Date;
import java.util.Scanner;


public class SinhVien {
   //data class 
   private String MaSinhVien, HoTen, DiaChi;
   private boolean Gender;
    private int NgaySinh;

    //method class
    Scanner sc = new Scanner(System.in);
    Date date = new Date();

    public void EnterInformation(){
        System.out.println("Moi nhap thong tin Sinh Vien ");
        System.out.print("Nhap MaSinhVien: ");
        MaSinhVien = sc.nextLine();
        System.out.println("Nhap HoTen: ");
        HoTen = sc.nextLine();
        System.out.println("Nhap DiaChi: ");
        DiaChi = sc.nextLine();
        System.out.println("Nhap NgaySinh: ");
        NgaySinh = sc.nextInt();



    }

    public void ShoShowInforSinhVien(){
        System.out.println("Ma Sinh Vien: " +MaSinhVien);
        System.out.println("Ho Ten Sinh Vien: " +HoTen);
        System.out.println("Dia Chi Sinh Vien: " +DiaChi);
        System.out.println("Ngay Sinh: " +NgaySinh);
    }


}
