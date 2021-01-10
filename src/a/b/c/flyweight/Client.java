package a.b.c.flyweight;

/**
 * 测试享元模式
 * 这里模拟围棋，围棋的棋子有很多，使用享元模式把所有的棋子设计成白色和黑色两个对象
 * 在使用棋子时用这两个对象不断的改变棋子位置达到最终目的
 */
public class Client {

    public static void main(String[] args) {
        Chess chess1 = ChessFactory.getChess("黑色");
        Chess chess2 = ChessFactory.getChess("黑色");
        System.out.println(chess1);
        System.out.println(chess2);

        System.out.println("增加外部状态的处理（改变非享元部分）");
        chess1.display(new Coordinate(10, 10));
        chess2.display(new Coordinate(20, 20));
    }
}
