package a.b.c.singleton;

/**
 * 枚举：可避免发射、反序列化实例化对象
 * 线程安全、调用效率高、没有懒加载
 */
public enum Test05 {

    // 这个枚举元素，本身就是单例对象
    instance;

    // 添加自己需要的操作
    public void otherMethod() {

    }
}
