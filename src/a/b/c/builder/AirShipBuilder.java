package a.b.c.builder;

// 构建接口（构建各个子模块）
public interface AirShipBuilder {
    Engine builderEngine();
    OrbitalModule builderOrbitalModule();
    EscapeTower builderEscapeTower();
}
