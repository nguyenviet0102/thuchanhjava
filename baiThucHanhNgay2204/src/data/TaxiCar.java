package data;
public class TaxiCar implements Car {
    @Override
    public void move(){
        System.out.println("move on four cake");
    }

    @Override
    public void stop(){
        System.out.println("stop.....stop by the roadside");
    }

    @Override
    public void turnRight(){
        System.out.println("turn right fall into the tree");
    }

    @Override
    public void turnLeft(){
        System.out.println("turn left fall into the tree");
    }

    @Override
    public void reverse(){
        System.out.println("reverse fall on the street");
    }

}

