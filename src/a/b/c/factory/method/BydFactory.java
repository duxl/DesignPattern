package a.b.c.factory.method;

import a.b.c.factory.Byd;
import a.b.c.factory.Car;

public class BydFactory implements CarFactory {

    @Override
    public Car createCar() {
        return new Byd();
    }
}
