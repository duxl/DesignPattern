package a.b.c.builder;

/**
 * 测试构建者：
 * 白话文解说构建者是什么：
 * 一个大产品（飞船-AirShip）包含很多的小产品（引擎-Engine、逃逸塔-EscapeTower、轨道舱-OrbitalModule）
 * 先用一个构建器（AirShipBuilder）构建各个小产品，
 * 然后将这个构建器传给组装器（AirShipDirector）进行组装
 * 最后通过这个组装器拿到组装后的大产品
 */
public class Client {

    public static void main(String[] args) {
        AirShipDirector director = new SxtShipDirector(new SxtAirShipBuilder());
        AirShip ship = director.directorAirShip();

        ship.launch();
    }
}
