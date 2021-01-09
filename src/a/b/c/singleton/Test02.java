package a.b.c.singleton;

/**
 * 懒汉式
 */
public class Test02 {

    private Test02() {
    }

    // 类初始化时，不初始化对象（ 延迟加载，真正用的时候才加载）
    private static Test02 instance;

    // 资源(内存)利用效率高，因为使用的时候才初始化。但调用效率低，因为每次调用getInstance()方法都要同步
    public static synchronized Test02 getInstance() {
        if (instance == null) {
            instance = new Test02();
        }
        return instance;
    }
}
