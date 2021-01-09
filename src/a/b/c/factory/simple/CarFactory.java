package a.b.c.factory.simple;

import a.b.c.factory.Audi;
import a.b.c.factory.Byd;
import a.b.c.factory.Car;

/**
 * 创建者
 */
public class CarFactory {

    public static Car createCar(String type) {
        if("奥迪".equals(type)) {
            return new Audi();
        } else if("比亚迪".equals(type)) {
            return new Byd();
        } else {
            return null;
        }
    }
}
