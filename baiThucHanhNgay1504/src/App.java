import shapes.hinhChuNhat;
import shapes.hinhTron;
import shapes.hinhTru;
import shapes.hinhVuong;

public class App {

    public static void main(String[] args) throws Exception {
        // Thử nghiệm với lớp Hình tròn
        hinhTron hinhTron = new hinhTron();
        hinhTron.xuatTen();
        hinhTron.nhapBanKinh();
        hinhTron.tinhChuVi();
        hinhTron.tinhDienTich();
        hinhTron.inChuVi();
        hinhTron.inDienTich();
 
        // Thử nghiệm với lớp Hình trụ
        hinhTru hinhTru = new hinhTru();
        hinhTru.xuatTen();
        hinhTru.nhapChieuCao();
        hinhTru.tinhTheTich();
        hinhTru.inTheTich();
 
        // Thử nghiệm với lớp Hình chữ nhật
        hinhChuNhat hinhChuNhat = new hinhChuNhat();
        hinhChuNhat.xuatTen();
        hinhChuNhat.nhapChieuDai();
        hinhChuNhat.nhapChieuRong();
        hinhChuNhat.tinhChuVi();
        hinhChuNhat.tinhDienTich();
        hinhChuNhat.inChuVi();
        hinhChuNhat.inDienTich();
 
        // Thử nghiệm với lớp Hình vuông
        hinhVuong hinhVuong = new hinhVuong();
        hinhVuong.xuatTen();
        hinhVuong.nhapCanh();
        hinhVuong.tinhChuVi();
        hinhVuong.tinhDienTich();
        hinhVuong.inChuVi();
        hinhVuong.inDienTich();


    }
}
