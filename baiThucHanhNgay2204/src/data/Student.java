package data;
import java.util.Random;
public class Student extends Person{
    protected String mssv;

    Student(String name, String yob, String address, String mssv){
        super(name, yob, address);
        this.mssv =mssv;

    }


    

    public double run(){

        return new Random().nextDouble()  * 30;

    }

    @Override
    public void showInformation(){
        System.out.printf("%25s|%3s|%30s|%11s|%3.2f|\n", name, yob, address, mssv, run());

    }

}