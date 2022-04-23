package data;
public abstract class Animal{
    protected String name;
    protected double weight;
    protected double high;

    Animal(String name, double weight, double high) {
        this.name = name;
        this.weight = weight;
        this.high = high;
    }

    //tao ham get() set()
    //toString if you want

    public abstract void eat();
    public abstract void sleep();
    public abstract void walk();
    public abstract void run();
    public abstract void roar();

    public void showProfile(){
        System.out.printf("|%10|%3.2d|%3.2d|", name, weight, high);
    }

}