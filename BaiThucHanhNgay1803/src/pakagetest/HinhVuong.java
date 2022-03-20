package pakagetest;
import java.util.Scanner;

public class HinhVuong {
   //data class
        float chieuRong,chieuDai;


    //method class
    public void NhapCdCr(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Moi nhap chieu rong: ");
        chieuRong = sc.nextFloat();
        System.out.print("Moi nhap chieu dai: ");
        chieuDai = sc.nextFloat();
    }

    public double tinhDienTichHV(){
        return chieuDai*chieuRong;
    }


    public double tinhChuViHV(){
        return chieuDai*chieuRong;
    }


}
