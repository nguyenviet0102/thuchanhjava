package data;
public class OfflineStudent extends Student {
    private String vehicle;

    OfflineStudent(String name, String yob, String address, String mssv, String vehicle){
        super(name, yob, address, mssv);
        this.vehicle = vehicle;
    }

    @Override
    public void showInformation(){

        System.out.printf("%25s|%3s|%30s|%11s|%9s|%3.2f|\n",
                                 name, yob, address, mssv, vehicle, run());
    }

}
