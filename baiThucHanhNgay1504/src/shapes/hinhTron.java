package shapes;

import java.util.Scanner;

public class hinhTron extends hinhHoc{
    public double banKinh;

    public hinhTron(float banKinh) {
        this.banKinh =banKinh;
    }

    public void nhapBanKinh(){
        System.out.println("Ban Kinh: " + banKinh);
        Scanner sc = new Scanner(System.in);
        banKinh = sc.nextFloat();

    }

    public void tinhChuVi(){
        chuVi = 2 * PI * banKinh;

    }

    public void tinhDienTich(){
        dienTich = PI * Math.pow(banKinh, 2);

    }


}