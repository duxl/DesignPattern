package a.b.c.proxy.dynamic;

import a.b.c.proxy.Star;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * 动态代理类
 */
public class HandleStar implements InvocationHandler {

    private Star star;

    public HandleStar(Star star) {
        this.star = star;
    }

    @Override
    public Object invoke(Object o, Method method, Object[] args) throws Throwable {
        System.out.println("--------动态代理开始--------");

        // 执行真正的代码
        Object result = method.invoke(star, args);

        System.out.println("--------动态代理结束--------");
        return result;
    }
}
