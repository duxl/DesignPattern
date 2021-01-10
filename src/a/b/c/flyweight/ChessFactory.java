package a.b.c.flyweight;

import java.util.HashMap;
import java.util.Map;

/**
 * 享元工厂类（享元模式的核心类）
 */
public class ChessFactory {

    private static Map<String, RealChess> map = new HashMap<>();

    public static RealChess getChess(String color) {
        if(map.containsKey(color)) {
            return map.get(color);
        } else {
            RealChess chess = new RealChess(color);
            map.put(color, chess);
            return chess;
        }
    }
}
