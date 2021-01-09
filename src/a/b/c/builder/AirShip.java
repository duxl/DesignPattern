package a.b.c.builder;

/**
 * 飞船
 */
public class AirShip {
    public OrbitalModule orbitalModule; // 轨道舱
    public Engine engine; // 发动机
    public EscapeTower escapeTower; // 逃逸塔


    public void launch() { // 发射方法
        System.out.println("1、" + engine.name + " 点火");
        System.out.println("2、进入 " + orbitalModule.name);
        System.out.println("3、打开 " + escapeTower.name);
    }
}

class OrbitalModule {
    public String name;

    public OrbitalModule(String name) {
        this.name = name;
    }
}

class Engine {
    public String name;

    public Engine(String name) {
        this.name = name;
    }
}

class EscapeTower {
    public String name;

    public EscapeTower(String name) {
        this.name = name;
    }
}
