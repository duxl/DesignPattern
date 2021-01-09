package a.b.c.singleton;

/**
 * 静态内部类
 * 线程安全、调用效率高、并实现了延迟加载
 */
public class Test04 {

    private Test04() {
    }

    // 类初始化时，不初始化静态内部类（ 延迟加载，真正用的时候才加载）
    private static class Test04Instance {
        private static final Test04 instance = new Test04();
    }

    // 资源(内存)利用效率高，因为使用的时候才初始化。但调用效率低，因为每次调用getInstance()方法都要同步
    public static Test04 getInstance() {
        return Test04Instance.instance;
    }
}
