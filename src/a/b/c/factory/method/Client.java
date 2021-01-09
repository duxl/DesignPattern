package a.b.c.factory.method;

import a.b.c.factory.Car;

public class Client {

    public static void main(String[] args) {
        Car car1 = new AudiFactory().createCar();
        Car car2 = new BydFactory().createCar();
    }
}
