package Shape;

import java.util.Scanner;

public class Point {
    protected String tenDiem;
    protected double hoanhDo;
    protected double tungDo;
    private static Scanner sc = new Scanner(System.in);


    public Point(String tenDiem, double hoanhDo, double tungDo){
        this.tenDiem = tenDiem;
        this.hoanhDo = hoanhDo;
        this.tungDo = tungDo;
    }

    public String gettenDiem() {
        return tenDiem;
    }

    public void settenDiem(String tenDiem) {
        this.tenDiem = tenDiem;
    }

    public double gethoanhDo() {
        return hoanhDo;
    }

    public void sethoanhDo(double hoanhDo) {
        this.hoanhDo = hoanhDo;
    }

    public double gettungDo() {
        return tungDo;
    }

    public void settungDo(double tungDo) {
        this.tungDo = tungDo;
    }

    public void enterInfoPoint(){

        System.out.print("Moi nhap ten Diem: ");
        // String diem; String inputMsg; String errorMsg;
        // while (true) {
        //     System.out.print(inputMsg);
        //     diem = sc.nextLine().trim();            
        //     if (diem.length() == 0 || diem.isEmpty())
        //         System.out.println(errorMsg);
        //     else 
        //         return diem;
        // }

        tenDiem = sc.nextLine();
        System.out.print("Moi nhap hoanh Do: ");
        hoanhDo = sc.nextDouble();
        System.out.print("Moi nhap tung Do: ");
        tungDo = sc.nextDouble();
    }


    public void showInfoPoint(){
        System.out.println(" " + tenDiem+ "(" + hoanhDo + "," + tungDo + ")");

    }

    

}