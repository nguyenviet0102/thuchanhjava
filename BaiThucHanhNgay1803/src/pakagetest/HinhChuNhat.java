package pakagetest;

import java.util.Scanner;

public class HinhChuNhat {
   //data class
    float dai , rong;
   

   //methodpublicpublic

   public void nhapDaiRong(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chieu rong: ");
        rong = sc.nextFloat();
        System.out.print("Moi nhap chieu dai: ");
        dai = sc.nextFloat();

   }

    public double tinhDienTichHCN() {
        return dai * rong;
    }
 

    public double tinhChuViHCN() {
        return (dai + rong) * 2;
    }

}
