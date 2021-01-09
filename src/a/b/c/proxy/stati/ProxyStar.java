package a.b.c.proxy.stati;

import a.b.c.proxy.Star;

/**
 * 静态代理类
 */
public class ProxyStar implements Star {

    private Star star;

    public ProxyStar(Star star) {
        this.star = star;
    }

    @Override
    public void sing() {
        System.out.println("--------静态代理开始--------");
        star.sing();
        System.out.println("--------静态代理结束--------");
    }
}
