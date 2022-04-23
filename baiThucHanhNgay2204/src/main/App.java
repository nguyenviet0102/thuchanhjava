

package main;
import data.*;

public class App {
    
    public static void main(String[] args) throws Exception {
       // System.out.println("Hello, World!");
        testPerson();
        testAnimal();
        testCar();

    }

    public static void testPerson(){
        Person s1 = new Person("Viet", "2002", "Ha Nam");
        s1.showInformation();
        Person s2 = new Student("Tuong Anh", "2002", "Ha Noi", "2021050719");
        s2.showInformation();

    }

    public static void testAnimal(){
        Animal a1 = new Tiger("Ho Chon", 78.6, 1.6);
        a1.showProfile();
        a1.eat(); a1.sleep();   a1.walk();  a1.run();   a1.roar();

    }

    public static void testCar(){
        Car car = new TaxiCar();
        car.move(); car.stop(); car.turnRight();    car.turnLeft(); car.reverse();


    }

    
}
