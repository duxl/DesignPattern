package a.b.c.bridge;

/**
 * <pre>
 * 测试桥连模式
 * 白话文理解桥连模式，生活中的例子：
 * 电脑的类型有台式机、笔记本、平板，而电脑又分品牌联想、戴尔等等
 * 常规我们建类的方式就像下图一样
 * <img src="../../../../../pics/not_bridge.png" />
 * 这样设计对于扩展是有问题的
 * 如果新增了一个类型比如手机，需要在手机下面添加各个品牌
 * 反之如果要添加一个品牌华硕，需要在所有类型下添加华硕
 * 为了解决这个问题，就有了桥连模式
 * 桥连模式是用组合的方式，一台电脑包含类型和品牌，通过一个中间类将类型和品牌联系在一起
 * </pre>
 */
public class Client {

    public static void main(String[] args) {
        Computer c1 = new Desktop(new Lenovo());
        c1.sale();

        Computer c2 = new Laptop(new Lenovo());
        c2.sale();
    }
}
