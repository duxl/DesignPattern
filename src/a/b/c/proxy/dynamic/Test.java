package a.b.c.proxy.dynamic;

import a.b.c.proxy.RealStar;
import a.b.c.proxy.Star;

import java.lang.reflect.Proxy;

/**
 * 测试类：使用jdk的动态代理
 * 1、代理类必须实现接口
 * 2、InvocationHandler用来处理代理逻辑
 * 3、使用jdk的Proxy生成代理类
 */
public class Test {
    public static void main(String[] args) {
        Star star = new RealStar();
        HandleStar handleStar = new HandleStar(star);

        Star proxyStar = (Star) Proxy.newProxyInstance(
                ClassLoader.getSystemClassLoader(),
                new Class[]{Star.class},
                handleStar
        );


        proxyStar.sing();
    }
}
