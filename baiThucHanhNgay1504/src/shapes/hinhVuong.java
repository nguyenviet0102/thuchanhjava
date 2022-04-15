package shapes;

import java.util.Scanner;
import shapes.hinhChuNhat;

public class hinhVuong extends hinhChuNhat{

    public hinhVuong() {
        ten = "Hinh Vuong";
    }

    public void nhapCanh(){
        System.out.println("Canh = ");
        Scanner sc = new Scanner(System.in);
        dai = rong = sc.nextDouble();
    }

}