package a.b.c.flyweight;

import java.sql.SQLOutput;

/**
 * 棋子
 */
public interface Chess {
    String getColor();
    void display(Coordinate coordinate);
}

class RealChess implements Chess {

    private String color; // 相同的属性（颜色）共享

    public RealChess(String color) {
        this.color = color;
    }

    @Override
    public String getColor() {
        return color;
    }

    @Override
    public void display(Coordinate coordinate) { // 不同属性（位置）通过参数传递
        System.out.println("------display------");
        System.out.println("棋子颜色：" + color);
        System.out.println("棋子位置：" + coordinate.x + "-" + coordinate.y);
    }
}
