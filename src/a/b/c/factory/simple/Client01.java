package a.b.c.factory.simple;

import a.b.c.factory.Audi;
import a.b.c.factory.Byd;
import a.b.c.factory.Car;

/**
 * 在没有工厂模式下
 */
public class Client01 { // 调用者

    public static void main(String[] args) {
        Car car1 = new Audi();
        Car car2 = new Byd();

        car1.run();
        car2.run();
    }
}
