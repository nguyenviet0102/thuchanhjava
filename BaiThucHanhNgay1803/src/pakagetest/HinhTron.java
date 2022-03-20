package pakagetest;
import java.util.Scanner;

public class HinhTron{
    //data
    float BanKinh;
    final double PI = 3.14;
    float cv;
    float dt;


    //phuong thuc
    public void NhapBanKinh(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi ban nhap ban kinh: ");
        BanKinh = sc.nextFloat();
        
    }

    public void InBanKinh(){
        System.out.println("Ban Kinh vua nhap: " +BanKinh);
    }

    
    public  double tinhDienTich() {
        return BanKinh * BanKinh * PI;
    }

    public  double tinhChuVi(){
        return BanKinh * 2 * PI;
    }
}