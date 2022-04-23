package data;
public class Person{
    protected String name;
    protected String yob;
    protected String address;

    Person(String name, String yob, String address){
        this.name = name;
        this.yob = yob;
        this.address = address;
    }

    //tao cac ham get() set()

    public void showInformation(){
        System.out.printf("%25s|%3s|%30s|\n", name, yob, address);

    }



}