package a.b.c.singleton;

/**
 * 饿汉式
 */
public class Test01 {

    private Test01() {
    }

    // 类初始化时，立即加载这个对象(没有延迟加载的优势)。加载类时，天然的线程安全的！
    private static Test01 instance = new Test01();

    // 方法没有同步（Synchronized），调用效率高
    public static Test01 getInstance() {
        return instance;
    }
}
