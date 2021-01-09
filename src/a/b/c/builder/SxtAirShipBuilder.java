package a.b.c.builder;


public class SxtAirShipBuilder implements AirShipBuilder {
    @Override
    public Engine builderEngine() {
        return new Engine("尚学堂牌发动机");
    }

    @Override
    public OrbitalModule builderOrbitalModule() {
        return new OrbitalModule("尚学堂牌轨道舱");
    }

    @Override
    public EscapeTower builderEscapeTower() {
        return new EscapeTower("尚学堂牌逃逸塔");
    }
}
