package shapes;

import java.util.Scanner;

public class hinhTru extends hinhTron{
    public double chieuCao;

    

    public hinhTru(double chieuCao){
        this.chieuCao = chieuCao;
    }

    public void nhapChieuCao(){
        nhapBanKinh();

        System.out.println("Chieu Cao = ");
        Scanner sc = new Scanner(System.in);
        chieuCao = sc.nextDouble();

    }

    public void tinhTheTich(){
        tinhDienTich();
        theTich = dienTich * chieuCao;
    }


}