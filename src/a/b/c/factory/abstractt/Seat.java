package a.b.c.factory.abstractt;

// 座椅
public interface Seat {
    // 按摩
    void massage();
}

// 高端座椅
class LuxurySeat implements Seat {
    @Override
    public void massage() {
        System.out.println("可以自动按摩");
    }
}

// 低端座椅
class LowSeat implements Seat {
    @Override
    public void massage() {
        System.out.println("不能自动按摩");
    }
}
