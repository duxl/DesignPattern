package a.b.c.factory.simple;

import a.b.c.factory.Car;

/**
 * 简单工厂模式下
 */
public class Client02 { // 调用者

    public static void main(String[] args) {
        Car car1 = CarFactory.createCar("奥迪");
        Car car2 = CarFactory.createCar("比亚迪");

        //Car car1 = CarFactory02.createAudi();
        //Car car2 = CarFactory02.createByd();

        car1.run();
        car2.run();
    }
}
