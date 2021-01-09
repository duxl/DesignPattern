package a.b.c.factory.abstractt;

// 轮胎
public interface Tyre {
    void revolve();
}

// 高端论坛
class LuxuryTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("旋转不磨损");
    }
}

// 低端轮胎
class LowTyre implements Tyre {
    @Override
    public void revolve() {
        System.out.println("旋转磨损");
    }
}

