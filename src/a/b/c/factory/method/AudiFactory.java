package a.b.c.factory.method;

import a.b.c.factory.Audi;
import a.b.c.factory.Car;

public class AudiFactory implements CarFactory {
    @Override
    public Car createCar() {
        return new Audi();
    }
}
