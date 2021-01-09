package a.b.c.factory.simple;

import a.b.c.factory.Audi;
import a.b.c.factory.Byd;
import a.b.c.factory.Car;

/**
 * 简单工厂创建者
 */
public class CarFactory02 {

    public static Car createAudi() {
        return new Audi();
    }

    public static Car createByd() {
        return new Byd();
    }
}
