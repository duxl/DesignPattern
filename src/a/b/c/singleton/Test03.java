package a.b.c.singleton;

/**
 * 双重校验锁
 */
public class Test03 {

    private Test03() {
    }

    // 类初始化时，不初始化对象（ 延迟加载，真正用的时候才加载）
    private static Test03 instance;

    // 资源(内存)利用效率高，因为使用的时候才初始化。但调用效率低，因为每次调用getInstance()方法都要同步
    public static Test03 getInstance() {
        if (instance == null) {
            Test03 tempInstance;
            synchronized(Test03.class) {
                tempInstance = instance;
                if(tempInstance == null) {
                    synchronized (Test03.class) {
                        if(tempInstance == null) {
                            tempInstance = new Test03();
                        }
                    }
                }
                instance = tempInstance;
            }
        }
        return instance;
    }
}
