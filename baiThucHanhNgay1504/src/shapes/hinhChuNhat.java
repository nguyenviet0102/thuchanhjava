package shapes;
import java.util.Scanner;

public class hinhChuNhat extends hinhHoc {
    public double dai;
    public double rong;

    public hinhChuNhat(double dai, double rong){
        this.dai = dai;
        this.rong = rong;
    }

    public void nhapChieuDai(){
        System.out.println("Chieu Dai: " + dai);
        Scanner sc = new Scanner(System.in);
        dai = sc.nextDouble();
    }

    public void nhapChieuRong(){
        System.out.println("Chieu Rong: " + rong);
        Scanner sc = new Scanner(System.in);
        rong = sc.nextDouble();
    }

    public void tinhChuVi(){
        chuVi = 2 * (dai + rong);
    }

    public void tinhDienTich(){
        dienTich = dai * rong;
    }

}
