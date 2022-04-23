package data;
public class Tiger extends Animal{
    
    Tiger(String name, double weight, double high){
        super(name, weight, high);
    }


    @Override
    public void eat(){
        System.out.println("Tiger eat meals");

    }

    @Override
    public void sleep(){
        System.out.println("Tiger sleep in jungle");
    }

    @Override
    public void walk(){
        System.out.println("Tiger walk like four legs");
    }

    @Override
    public void run(){
        System.out.println("tiger runs on four legs ");
    }

    @Override
    public void roar(){
        System.out.println("Tiger say tui may tuoi gi??");
    }

    

}
