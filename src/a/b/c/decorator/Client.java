package a.b.c.decorator;

/**
 * 动态的为一个对象增加新的功能，无须通过继承增加子类就能扩展对象的新功能
 */
public class Client {
    public static void main(String[] args) {
        // 普通汽车
        Car car = new Car();
        car.move();

        System.out.println("怎加新的功能，飞行----------");
        FlyCar flyCar = new FlyCar(car);
        flyCar.move();

        System.out.println("怎加新的功能，水里游----------");
        WaterCar waterCar = new WaterCar(car);
        waterCar.move();

        System.out.println("怎加两个新的功能，飞行+水里游----------");
        WaterCar waterCar2 = new WaterCar(new FlyCar(car));
        waterCar2.move();
    }
}
