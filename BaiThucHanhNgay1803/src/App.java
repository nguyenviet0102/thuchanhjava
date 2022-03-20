import pakagetest.HinhVuong;
import pakagetest.HinhChuNhat;
import pakagetest.HinhTron;

public class App {
    
    public static void main(String[] args) throws Exception {
       //class HinhTron
        HinhTron ht = new HinhTron();
        double cv,dt;
        ht.NhapBanKinh();
        ht.InBanKinh();
        dt = ht.tinhDienTich();
            System.out.println("Dien tich hinh tron bang: " +dt);
        cv = ht.tinhChuVi();
            System.out.println("Chu vi hinh tron bang: " +cv);


        //class HinhVuong
        double cvHV,dtHV;
        HinhVuong hv = new HinhVuong();
        hv.NhapCdCr();
        cvHV = hv.tinhChuViHV();
            System.out.println("Chu vi hinh vuong bang: " +cvHV);
        dtHV = hv.tinhDienTichHV();
            System.out.println("Dien tich hinh vuong bang: " +dtHV);

        // class HinhChuNhcncn
            HinhChuNhat hcn = new HinhChuNhat();
            double cvHCN,dtHCN;
        hcn.nhapDaiRong();
        cvHCN = hcn.tinhChuViHCN();
            System.out.println("Chu vi hinh chu nhat bang: " +cvHCN);
        dtHCN = hcn.tinhDienTichHCN();  
            System.out.println("Dien tich hinh chu nhat bang: " +dtHCN);
        
        


        //Method Person in main
        Person person = new Person();
        person.EnterPersonInFor();
        person.ShowInformation();

        //call method Sinh Vien
        SinhVien sv = new SinhVien();
        sv.EnterInformation();
        sv.ShoShowInforSinhVien();

        //Phuong Trinh Bac Hai
        PhuongTrinhBacHai ptb2 = new PhuongTrinhBacHai();
        ptb2.nhapPT();
        ptb2.giaiPt();
    }
}
