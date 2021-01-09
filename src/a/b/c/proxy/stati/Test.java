package a.b.c.proxy.stati;

import a.b.c.proxy.RealStar;
import a.b.c.proxy.Star;

/**
 * 测试静态代理
 */
public class Test {

    public static void main(String[] args) {
        Star realStar = new RealStar();
        ProxyStar proxyStar = new ProxyStar(realStar);

        proxyStar.sing();
    }
}
