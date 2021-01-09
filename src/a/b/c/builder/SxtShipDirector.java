package a.b.c.builder;

public class SxtShipDirector implements AirShipDirector {

    private AirShipBuilder builder;

    public SxtShipDirector(AirShipBuilder builder) {
        this.builder = builder;
    }

    @Override
    public AirShip directorAirShip() {
        Engine engine = builder.builderEngine();
        EscapeTower escapeTower = builder.builderEscapeTower();
        OrbitalModule orbitalModule = builder.builderOrbitalModule();

        // 组装
        AirShip ship = new AirShip();
        ship.engine = engine;
        ship.escapeTower = escapeTower;
        ship.orbitalModule = orbitalModule;

        return ship;
    }
}
